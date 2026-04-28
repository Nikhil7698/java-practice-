public class ArrayShifting {
    static void shift1(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    static void main(){
        int arr[]={1,2,3,4,5};
        shift1(arr);
        for(int a:arr){
            System.out.println(a + " ");
        }
        System.out.println();
    }
}
