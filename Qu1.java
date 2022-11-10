/**
 * Created by learn on 10/11/22.
 */
import java.util.Scanner;
public class Qu1 {
    public static void main(String[] args) {


        double balances;
        double interest_rate;
        double interest;
        int year=0;

        Scanner in= new Scanner(System.in);
        System.out.println("Enter the initial balance");
        balances=in.nextDouble();
        System.out.println("Enter the rate of interest:");
        interest_rate=in.nextDouble();
        interest_rate/=100;



        while (balances<1000000){
            interest=interest_rate*balances;
            balances+=interest;
            year++;
        }


        System.out.println("Years= "+year);
    }
}
