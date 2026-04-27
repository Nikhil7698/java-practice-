import java.util.Arrays;
public class Revrse{
    public static void main(String[]args){
        int arr1[]={1,2,3,4,5,6,7,8,9};
        int start=0 , end=arr1.length-1;
        while(end>start){
            int temp=arr1[start];
            arr1[start]=arr1[end];
            arr1[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
