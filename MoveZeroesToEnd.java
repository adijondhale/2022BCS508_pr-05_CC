
public class MoveZeroesToEnd {
    public static void moveZeroes(int[] arr) {
        int nonZeroIndex = 0;

        // Traverse the array and move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill the rest of the array with zeroes
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 0, 1, 9, 0, 5, 0 };
        moveZeroes(arr);
        // System.out.println(Arrays.toString(arr)); // Output: [4, 5, 1, 9, 5, 0, 0, 0]
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
