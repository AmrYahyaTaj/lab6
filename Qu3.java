/**
 * Created by learn on 10/11/22.
 */
import java.util.Scanner;

public class Qu3 {
    public static void main(String[] args) {


        String Text;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The Texst: ");

        Text=in.next();


        for (int i = 0; i <Text.length(); i++) {
            System.out.println(Text.charAt(i));
        }
    }
}
