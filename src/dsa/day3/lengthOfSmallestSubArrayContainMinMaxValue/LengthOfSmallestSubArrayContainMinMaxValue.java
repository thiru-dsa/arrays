package src.dsa.day3.lengthOfSmallestSubArrayContainMinMaxValue;

// Question :-
// Given an array, return the length of the smallest subarray which contains both the minimum and maximum array element  

// Time Complexity  : O(N)
// Space Complexity : O(1)

class LengthOfSmallestSubArrayContainMinMaxValue {

    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 1, 3, 4, 6, 4, 6, 3};
        int[] arr = {7, 7, 7, 7, 7, 7};
        int minValue, maxValue;

        minValue = findMinimumValue(arr);
        maxValue = findMaximumValue(arr);

        System.out.println(findLengthOfSmallestSubArrayContainMinMaxValue(arr, minValue, maxValue));
    }

    public static int findMinimumValue(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for (int iterator = 0; iterator < arr.length; iterator++) {
            if (arr[iterator] < minValue) {
                minValue = arr[iterator];
            }
        }
        return minValue;
    }

    public static int findMaximumValue(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        for (int iterator = 0; iterator < arr.length; iterator++) {
            if (arr[iterator] > maxValue) {
                maxValue = arr[iterator];
            }
        }
        return maxValue;
    }

    public static int min(int firstNumber, int secondNumber) {
        if(firstNumber < secondNumber) {
            return firstNumber;
        }

        return secondNumber;
    }

    public static int findLengthOfSmallestSubArrayContainMinMaxValue(int[] arr, int minValue, int maxValue) {
        int latestMinValueIndex = -1, latestMaxValueIndex = -1;
        int lengthOfSmallestSubarray = Integer.MAX_VALUE;

        for (int iterator = 0; iterator < arr.length; iterator++) {
            if (arr[iterator] == minValue) {
                latestMinValueIndex = iterator;
                if (latestMaxValueIndex >= 0) {
                    lengthOfSmallestSubarray = min(lengthOfSmallestSubarray, iterator - latestMaxValueIndex + 1);
                }
            }
            if (arr[iterator] == maxValue) {
                latestMaxValueIndex = iterator;
                if (latestMinValueIndex >= 0) {
                    lengthOfSmallestSubarray = min(lengthOfSmallestSubarray, iterator - latestMinValueIndex + 1);
                }
            }
        }

        return lengthOfSmallestSubarray;
    }
}
