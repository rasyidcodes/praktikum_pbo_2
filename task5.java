import java.util.ArrayList;
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        ArrayList<String> anjing = new ArrayList<String>(Arrays.asList("buddy", "ruby", "coco"));
        ArrayList<String> kucing = new ArrayList<String>(Arrays.asList("sam", "kyki", "shadow"));
        ArrayList<String> ferry = new ArrayList<String>();

        for (String kcg : kucing){
            if (kcg.contains("y")) {
                ferry.add(kcg);
            }
        }

        for (String ajg : anjing){
            if (ajg.contains("y")) {
                ferry.add(ajg);
            }
        }

        System.out.println(ferry);
    }
}
