package src.dsa.day4.sumOfAllSubArray;

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

    // Total = 20

// Time Complexity  : O(N)
// Space Complexity : O(1)

public class SumOfAllSubArray {
    public static void main(String[] args) {
        
        int[] arr = {4, 2, 10, 3};

        printSumOfEachSubArray(arr);
    }

    public static void printSumOfEachSubArray(int[] arr) {

        int totalSumOfSubarray = 0;
        for(int iterator = 0; iterator < arr.length; iterator++) {
           totalSumOfSubarray += (iterator + 1) * (arr.length - iterator) * arr[iterator];
        }
        System.out.println("Sum of all sub array : " + totalSumOfSubarray);
    }
}