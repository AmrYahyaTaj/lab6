/**
 * Created by learn on 10/11/22.
 */
import java.util.Scanner;

public class Qu4 {


    public static void main(String[] args) {

        String Text;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a text");
        Text=in.next();



        for (int i = Text.length()-1; i >=0 ; i--) {
            System.out.print(Text.charAt(i));
        }
    }
}
