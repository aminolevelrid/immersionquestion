import java.util.*;
public class quicksort {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            int arr[] = new int[k];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            quicksort(arr, 0, arr.length - 1);
            System.out.print(Arrays.toString(arr));
        }

        public static void quicksort(int arr[], int s, int e) {
            if (s >= e) {
                return;
            }
            int index = placeindex(arr, s, e);
            quicksort(arr, s, index - 1);
            quicksort(arr, index + 1, e);
        }

        public static int placeindex(int[] arr, int k, int z) {
            int pivot = arr[z];
            int l = k;
            for (int i = k; i < z; i++) {
                if (arr[i] < pivot) {
                    int temp = arr[i];
                    arr[i] = arr[l];
                    arr[l] = temp;
                    l++;
                }
            }
            int temp = arr[l];
            arr[l] = arr[z];
            arr[z] = temp;
            return l;
        }
    }
