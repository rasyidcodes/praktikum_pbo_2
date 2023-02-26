import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        String res = "";
        for (int i = 0; i < word.length(); i++) {
            res = res + word.charAt(word.length() - i -1);
        }
        System.out.print(res);
    }
}
