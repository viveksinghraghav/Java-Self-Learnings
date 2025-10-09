import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18, 56};
     //   swap(arr, 1, 3);

        reverse(arr);
        System.out.println(Arrays.toString(arr));  // index 1 and index 3 will be swapped which is 3 and 9 will become 9 and 3
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;

        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
