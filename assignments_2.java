import java.util.Scanner;

public class assignments_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input mainan yang dibeli :");
        int jumlahMainan = scanner.nextInt();

        int sisa = jumlahMainan % 3;
        if (sisa == 0){
            System.out.println("Mainan yang dibeli = " + jumlahMainan + " Mainan di toko habis");
        }else {
            System.out.println("Mainan yang dibeli = " + jumlahMainan + " Mainan di toko sisa " + sisa);
        }

    }
}
