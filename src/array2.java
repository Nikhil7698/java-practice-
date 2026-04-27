import java.util.Scanner;
public class array2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int j=0; j<n; j++){
            arr[j]=sc.nextInt();
        }

        int max= arr[0];
        for(int i=1; i<arr.length;i++ ){
            if(max< arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Maximum element in the array is : "+max);
    }
}
