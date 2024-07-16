package src.dsa.day5.findMaximumSubOfSubarrayLengthK;

// Question :-
// Given a matrix N*M, Rotate the matrix 90 deg

// Explanation ;-
    // Array:
    // [1, 4, 2, 10, 23, 3, 1, 0, 20]
    // k = 4

    // [1, 4, 2, 10] => 17
    // [4, 2, 10, 23] => 39  (maximum)
    // [2, 10, 23, 3] => 38
    // [10, 23, 3, 1] => 38
    // [23, 3, 1, 0] => 28
    // [3, 1, 0, 20] => 24 

// Output: 
    // 39 

// Time Complexity  : O(N)
// Space Complexity : O(1)

public class FindMaximumSumOfSubarrayLengthK {
    public static void main(String[] args) {
        
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(findMaximumSumOfSubarrayLengthK(arr, k));
    }

    public static int findMaximumSumOfSubarrayLengthK(int[] arr, int k) {

        int maximumSum = Integer.MIN_VALUE;
        int currentSlideSum = 0;
        for(int iterator = 0; iterator < k; iterator++) { // got the sum of first slide
            currentSlideSum += arr[iterator];    
        }
        maximumSum = currentSlideSum;

        int s = 1, e = k;
        while(e < arr.length) {
            // currentSlideSum = 0;
            currentSlideSum = currentSlideSum + arr[e] - arr[s-1];
            if(currentSlideSum > maximumSum) {
                maximumSum = currentSlideSum;
            }

            s++;
            e++;
        } 



        return maximumSum;
    }
}
