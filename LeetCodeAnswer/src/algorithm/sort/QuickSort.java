package algorithm.sort;

import java.util.Arrays;

public class QuickSort {

    int partition(int[] a, int low, int high) {
        int key = a[low];
        while (low < high) {
            while(low < high && a[high] >= key) {
                high--;
            }
            a[low] = a[high];
            while(low < high && a[low] <= key) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }

    void sort(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }
        int p = partition(a, low, high);
        sort(a, low, p - 1);
        sort(a, p + 1, high);
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,8,3,5,20,15,11};
        System.out.println(Arrays.toString(a));
        QuickSort qs = new QuickSort();
        qs.sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
