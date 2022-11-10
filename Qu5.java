/**
 * Created by learn on 10/11/22.
 */
import java.util.Scanner;

public class Qu5 {
    public static void main(String[] args) {
        String Text;
        char vowls []={'a','i','o','u','y'};

        int vowls_num=0;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter text: ");
        Text=in.next();

        for (int i = 0; i < Text.length() ; i++) {
            for (int j = 0; j <5 ; j++) {
                if (Text.charAt(i)==vowls[j])
                    vowls_num++;
            }
        }


        System.out.println(Text+" has "+vowls_num+" vowls letters");
    }
}
