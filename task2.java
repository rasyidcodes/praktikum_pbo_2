import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Perpangkatan");
        System.out.println("masukkan angka");
        int angka = scanner.nextInt();

        System.out.println("masukkan pangkat");
        int pangkat = scanner.nextInt();

        int result1 = 1;
        for(int i=1; i<=pangkat; i++){
            result1=result1*angka;
        }

        int result2 = 1;
        int j = 1;
        while (j <= pangkat){
            result2 = result2 * angka;
            j = j+1;
        }

        int result3 = 1;
        int k =1;
        do{
            result3 = result3 * angka;
            k = k+1;
        }while (k <= pangkat);


        System.out.println("result for "+ result1);
        System.out.println("result while "+ result2);
        System.out.println("result while do "+ result3);
    }
}
