package week9;

public class week9Problem3 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 0};
        int firstNonRepeating = findFirstNonRepeatingElement(arr);

        if (firstNonRepeating != Integer.MIN_VALUE) {
            System.out.println("First non-repeating element: " + firstNonRepeating);
        } else {
            System.out.println("No non-repeating element found");
        }
    }

    public static int findFirstNonRepeatingElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean isRepeated = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return arr[i];
            }
        }

        return Integer.MIN_VALUE; // No non-repeating element found
    }
}
