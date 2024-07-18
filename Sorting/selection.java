public class selection {

    // Function to perform selection sort
    public static void selection(int[] array) {
        int n = array.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            // Print the array after each pass for debugging
            System.out.print("Array after pass " + (i + 1) + ": ");
            printArray(array);
        }
    }

    // Utility function to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the algorithm
    public static void main(String[] args) {
        int[] array = { 64, 25, 12, 22, 11 };
        System.out.println("Given Array");
        printArray(array);

        selection(array);

        System.out.println("\nSorted Array");
        printArray(array);
    }
}
