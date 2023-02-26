import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("input row size");
        int lenx = sc.nextInt();

        System.out.println("input column size");
        int leny = sc.nextInt();

        int [][] numbers = new int[lenx][leny];

        for(int x = 0; x < lenx; x++){
            for (int y =0; y < leny; y++){
                System.out.println("input number" + "["+ x +"]" + "["+ y +"] : ");
                numbers[x][y] = sc.nextInt();
            }
        }

        for(int x = 0; x < lenx; x++){
            for (int y =0; y < leny; y++){
                System.out.println("Print number" + "["+ x +"]" + "["+ y +"] : " + numbers[x][y]);
            }
        }
    }
}
