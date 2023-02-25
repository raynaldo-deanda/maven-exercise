import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or sentence");
        String text = sc.nextLine();
        System.out.println("You have entered: " + text);

        if (StringUtils.isNumeric(text)){
            System.out.println("Your Number is : " + text);
        } else {
            System.out.println(StringUtils.swapCase(text));//flip
            System.out.println(StringUtils.reverse(text));//reverse
        }


    }
}