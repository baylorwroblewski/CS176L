package week9;

public class week9Problem2 {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 3, 4, 3, 5, 6};
        int[] arr2 = {6, 10, 5, 4, 9, 120, 4, 6, 10};

        int firstRepeatIndex1 = findFirstRepeatingElementIndex(arr1);
        int firstRepeatIndex2 = findFirstRepeatingElementIndex(arr2);

        System.out.println("First repeating element in arr1: " + (firstRepeatIndex1 != -1 ? arr1[firstRepeatIndex1] : "No repeating element"));
        System.out.println("First repeating element in arr2: " + (firstRepeatIndex2 != -1 ? arr2[firstRepeatIndex2] : "No repeating element"));
    }

    public static int findFirstRepeatingElementIndex(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }

        return -1; // if no repeating element found
    }
}

