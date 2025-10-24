package C_ArrayOperations.B_Searching_Array;

public class b_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};  // Predefined sorted array
        int target = 10;                      // Element to search

        int start = 0, end = arr.length - 1;
        boolean found = false;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println("Element " + target + " found at index " + mid);
                found = true;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Element " + target + " not found.");
        }
    }
}
