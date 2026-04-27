import java.util.Scanner;
public class palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int o=n;
        int rev=0;
        while(n>0){
            int d = n%10;
            rev=rev*10+d;
            n=n/10;

        }
        if(o==rev){
            System.out.println(rev + " palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}