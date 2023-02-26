import java.util.*;

public class task6 {
    public static void main(String[] args) {

        Scanner si = new Scanner(System.in);

        ArrayList<String> barang = new ArrayList<String>();
        System.out.println("Input data ");
        int jml =  si.nextInt();

        for (int i = 0;i< jml;i++){
            barang.add(si.next());
        }

        System.out.println("Search barang");
        String searchbarang = si.next();
        int res = 0;

        for (String nmbr : barang){
            if (Objects.equals(searchbarang, nmbr)){
                res=1;
            }
        }

        if (res ==0){
            System.out.println("Barang tidak ditemukan");
        }else {
            System.out.println("Barang ditemukan");
        }

    }
}
