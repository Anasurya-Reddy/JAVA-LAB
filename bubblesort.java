//A program to perform Bubble Sort

class bubbleSort {
    void Sort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    void print(int a[]) {
        System.out.println("Sorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class bsort {
    public static void main(String[] args) {
        int[] a = {4, 6, 2, 8, 1};
        bubbleSort s = new bubbleSort();
        s.Sort(a);
        s.print(a);
    }
}
