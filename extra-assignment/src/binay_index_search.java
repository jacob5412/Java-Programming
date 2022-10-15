import java.util.*;

class BinarySearch {
    public int binarySearch(int[] inputArr, int arrSize) {

        int start = 1;
        int end = arrSize;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid == inputArr[mid]) {
                return mid;
            }
            if (mid < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) throws Exception {
        // Enter through keyboard
        Scanner scanner = new Scanner(System.in);
        BinarySearch mbs = new BinarySearch();
        // size of the array
        int size = scanner.nextInt();
        int array[] = new int[size + 1];
        for (int i = 1; i <= size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Index Match: " + mbs.binarySearch(array, size));
        scanner.close();
    }
}
