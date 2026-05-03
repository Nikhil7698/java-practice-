public class ArrayShifting {
    static void shift1(int[] arr){
        int n=arr.length;
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public static void PrintAlternate(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            else{
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }
    }

    static void main(){
        int arr[]={1,2,3,4,5};
        PrintAlternate(arr);
        /*shift1(arr);
        for(int a:arr){
            System.out.println(a + " ");
        }
        System.out.println();*/
    }
}
