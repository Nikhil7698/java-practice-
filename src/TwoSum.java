import java.util.Scanner;
public class TwoSum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]= new int[n];
        for(int i=0; i<n ; i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the target value : ");
        int target=sc.nextInt();
        for(int j=0;j<n;j++){
            for(int k=j+1;j<n;j++)
            if(arr1[j]+arr1[k]==target){
                System.out.println("match found : "+ arr1[j] + arr1[k] );
            }
        }
    }
}
