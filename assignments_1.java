import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class assignments_1 {
    public static void main(String[] args) {
        ArrayList<String> daftarCatatan = new ArrayList<String>(Arrays.asList("cabai", "bayam", "bawang","tempe","beras"));
        ArrayList<String> daftarBeli = new ArrayList<String>();
        ArrayList<String> namaBarang = new ArrayList<String>(Arrays.asList("cabai", "bawang", "bayam", "beras", "ayam", "tempe", "minyak"));
        ArrayList<Integer> hargaBarang = new ArrayList<Integer>(Arrays.asList(3000,3000,2000,20000,20000,5000,12000));



        int res =0;


        for (int i = 0; i < daftarCatatan.size() ; i++){
            if (daftarCatatan.get(i) == "cabai"){
                daftarBeli.add("ayam");
                daftarBeli.add("minyak");
            }else{
                daftarBeli.add((daftarCatatan.get(i)));
            }
        }

        System.out.println("Daftar catatan dina");
        for (String ct : daftarCatatan){
            System.out.println(ct);
        }

        System.out.println("Barang yang dibeli dina");
        for (String ct : daftarBeli){
            System.out.println(ct);
        }


        for (int i = 0; i < daftarBeli.size(); i++){
            for (int j = 0; j < namaBarang.size(); j++){
                if (daftarBeli.get(i) == namaBarang.get(j)){
                    res = res + hargaBarang.get(j);
                }
            }
        }

        int  money = 50000;
        System.out.println("Uang Dina " + money);
        System.out.println("total belanja " + res);
        int sisa = res - money;
        if(sisa == 0){
            System.out.println("Uang Pas");
        }else if (sisa > 0){
            System.out.println("Uang Kurang " + sisa);
        }else {
            System.out.println("Uang Sisa " + sisa);
        }


    }
}
