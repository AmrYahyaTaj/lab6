/**
 * Created by learn on 10/11/22.
 */
import java.util.Scanner;

public class Qu8 {

    public static void main(String[] args) {
        int Limit;
        int counter=0;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a limit number:");
        Limit=in.nextInt();


        for (int i = 2; i <=Limit ; i++) {

            for (int j = 1; j <=i ; j++) {

                if (i%j==0)
                    counter++;
            }

            if (counter==2)
                System.out.println(i);
            counter=0;
        }
    }
}
