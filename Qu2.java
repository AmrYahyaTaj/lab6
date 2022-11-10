/**
 * Created by learn on 10/11/22.
 */
import java.util.Scanner;
public class Qu2 {

    public static void main(String[] args) {
        int sum_even=0;
        for (int i = 2; i <=100 ; i++)
            if(i%2==0)
                sum_even+=i;
        System.out.println("Sum of even numbers 2->100 = "+sum_even);

        int x,y;
        int Som_odd=0;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Range from -> to ");
        x=in.nextInt();
        y=in.nextInt();
        for (int i = x; i <=y ; i++) {
            if (i%2==0)
                continue;
            Som_odd+=i;
        }
        System.out.println("Sum of odd numbers from "+x+"->"+y+" = "+Som_odd);

        int num;
        int digit;
        int sum_OddDigit=0;
        System.out.println("Enter a number:");
        num=in.nextInt();
        while (num>0){
            digit=num%10;
            num/=10;
            if (digit%2==0)
                continue;
            sum_OddDigit+=digit;
        }
        System.out.println("Sum of odd digits = "+sum_OddDigit);

    }
}
