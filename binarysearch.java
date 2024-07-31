//A program to perform Binary Search
import java.util.Scanner;

class BinarySearch {
    private int[] array;
    private int key;
    
    BinarySearch(int[] array, int key) {
        this.array = array;
        this.key = key;
    }

    void search() {
        int low = 0;
        int high = array.length - 1;
        int count=0;

        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (array[mid] == key) {
                System.out.println("Your key is found at index " + mid);
                count = 1;
                break;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (count==0) {
            System.out.println("Your key is not found");
        }
    }
}

public class bsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Enter a key:");
        int key = sc.nextInt();
        BinarySearch binarySearch = new BinarySearch(array, key);
        binarySearch.search();
    }
}
