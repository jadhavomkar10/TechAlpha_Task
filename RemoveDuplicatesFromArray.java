import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,3,4,5};

        // Original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Remove duplicates
        int uniqueCount = removeDuplicates(array);

        // Array after removing duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(array, uniqueCount)));
    }

    public static int removeDuplicates(int[] array) {
        int n = array.length;
        if (n == 0 || n == 1) {
            return n;
        }

        // Sort the array to bring duplicates together
        Arrays.sort(array);

        // Remove duplicates in-place
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[n - 1];

        return j;
    }
}
