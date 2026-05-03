public class SortingTech {
    public int[] sortArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
            }

        if (arr[i] == 0) {
            i++;
        }
        if (arr[j] == 1) {
            j--;
        }
    }
        return arr;

    }

    public static void main() {
        int arr[] = {1, 0, 1, 0, 1, 0};
        SortingTech obj = new SortingTech();
        arr = obj.sortArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
