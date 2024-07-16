package src.dsa.day4.sumOfEachSubArray;

// Question :-
// Given N array, find the sum of each sub array  

// Explanation ;-
    // N = [1, 2, 3]

    // [1]: Sum = 1
    // [2]: Sum = 2
    // [3]: Sum = 3
    // [1, 2]: Sum = 1 + 2 = 3
    // [2, 3]: Sum = 2 + 3 = 5
    // [1, 2, 3]: Sum = 1 + 2 + 3 = 6

// Time Complexity  : O(N2)
// Space Complexity : O(1)

public class SumOfEachSubarray {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, -3, 1};

        printSumOfEachSubArray(arr);
    }

    public static void printSumOfEachSubArray(int[] arr) {

        int sumOfSubArray;
        for(int iterator = 0; iterator < arr.length; iterator++) {
            sumOfSubArray = 0;
            for(int jterator = iterator; jterator < arr.length; jterator++) {
                sumOfSubArray += arr[jterator];
                System.out.println(sumOfSubArray);
            }
        }
    }
}
