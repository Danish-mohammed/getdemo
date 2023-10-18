class ShiftZerosToRight {
    public static void main(String[] args) {
        int[] array = {1, 0, 5, 0, 3, 0, 9, 0, 2};

        System.out.println("Original Array:");
        printArray(array);

        shiftZerosToRight(array);

        System.out.println("\nArray after shifting zeros to the right:");
        printArray(array);
    }

    // Function to shift zeros to the right
    public static void shiftZerosToRight(int[] arr) {
        int nonZeroIndex = 0;

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is non-zero, move it to the left
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    // Function to print an array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
