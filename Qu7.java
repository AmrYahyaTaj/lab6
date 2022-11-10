/**
 * Created by learn on 10/11/22.
 */
import java.util.Scanner;


public class Qu7 {
    public static void main(String[] args) {

        int Num;
        int binary_Arry[] = new int[32];
        int counter=0;


        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        Num=in.nextInt();
        System.out.println("The number in binary");

        while (Num>0){
            binary_Arry[counter]=Num%2;
            Num/=2;
            counter++;
        }

        for (int i = counter-1; i >=0 ; i--) {
            System.out.print(binary_Arry[i]);
        }
    }
}
