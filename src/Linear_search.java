import java.util.Scanner;
public class Linear_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("give the taget value : ");
        int target= sc.nextInt();
        for(int j=0; j<n ; j++){
            if(arr[j]==target){
                System.out.println("found it");

            }
        }

    }
}
