import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menghitung factorial");
        System.out.println("Input number");
        int num  = scanner.nextInt();

        int result1 = 1;
        for (int i = 1; i <= num; i ++){
            result1 = result1 * i;
        }


        int result2 = 1;
        int j = 1;
        while (j <=  num){
            result2 = result2 * j;
            j = j+1;
        }

        int result3= 1;
        int k = 1;
        do{
            result3 = result3 * k;
            k = k+1;
        }while (k <= num);

        System.out.println("result for " + result1);
        System.out.println("result while " + result2);
        System.out.println("result while do " + result3);
    }
}
