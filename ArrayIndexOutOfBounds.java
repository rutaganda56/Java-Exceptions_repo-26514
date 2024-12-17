public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Example 1: Attempting to access an invalid index (will throw ArrayIndexOutOfBoundsException)
        try {
            System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index 5 is out of bounds for the array.");
        }

        // Example 2: Preventing ArrayIndexOutOfBoundsException with manual bounds check
        int index = 4;
        if (index >= 0 && index < arr.length) {
            System.out.println("Element at index " + index + ": " + arr[index]);
        } else {
            System.out.println("Index " + index + " is out of bounds for the array.");
        }

        // Example 3: Loop with bounds checking
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        // Example 4: Enhanced for-loop (no need to check bounds)
        System.out.println("Array elements using  for-loop:");
        for (int element : arr) {
            System.out.println(element);
        }

        // Example 5: Handling negative index gracefully
        int negativeIndex = -1;
        if (negativeIndex >= 0 && negativeIndex < arr.length) {
            System.out.println("Element at negative index " + negativeIndex + ": " + arr[negativeIndex]);
        } else {
            System.out.println("Negative index " + negativeIndex + " is out of bounds for the array.");
        }
    }
}

