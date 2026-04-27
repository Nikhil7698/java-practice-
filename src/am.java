//Armstrong numbers (also called narcissistic numbers)
// are numbers that are equal to the sum of their digits each raised to the power of the number of digits.
import java.util.Scanner;
public class am {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int o=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum =sum+(d*d*d);
            n=n/10;
        }
        if(sum ==o){
            System.out.println("Amstrong number "+sum);
        }
        else {
            System.out.println("not Amstrong Number "+sum);
        }

    }
}
