package src.dsa.day5.findMinimumNumberOfSwapRequiredToCombineTheElementLessThanB;

// Question :-
// Given N array elements, a random number B is given. Find the minimum number of swaps required to put all the array elements <= B together.

// Explanation ;-
    // Array:
    // [19, 11, 3, 9, 7, 25, 6, 20, 4]
    // k = 7

    // you can swap 25 and 4
    // so requires one swap

// Output: 
    // 1

// Time Complexity  : O(N)
// Space Complexity : O(1)

public class FindMinimumNumberOfSwapRequiredToCombineTheElementLessThanB {
    public static void main(String[] args) {
     
        int[] arr = {19, 11, 3, 9, 7, 25, 24, 6, 20, 4};
        int b = 10;

        System.out.println(findMinimumNumberOfSwapRequiredToCombineTheElementLessThanB(arr, b));
    }

    public static int findMinimumNumberOfSwapRequiredToCombineTheElementLessThanB(int[] arr, int b) {
        int noOfElementLessThanB = findMinimumElementThanB(arr, b);
        int k = noOfElementLessThanB;

        int minimumSwapRequires = Integer.MAX_VALUE;
        int badElement = 0; // represent the element is greater than b
        for(int iterator = 0; iterator < k; iterator++) {  // found the bad elements in first slide
            if(arr[iterator] > b) {
                badElement++;
            }
        }
        if(badElement < minimumSwapRequires) {
            minimumSwapRequires = badElement;
        }

        int start = 1, end = k;
        while(end < arr.length) {  // next remaining slides 

            if(arr[start - 1] > b) {  // removing the previous element count if it is bad
                badElement--;
            }

            if(arr[end] > b) {      // adding the next element if the element is bad
                badElement++;
            }

            if(badElement < minimumSwapRequires) {
                minimumSwapRequires = badElement;
            }
            start++; end++;
        }
        return minimumSwapRequires;
    }

    public static int findMinimumElementThanB(int[] arr, int b) {
        int count = 0;
        for(int iterator = 0; iterator < arr.length; iterator++) {
            if(arr[iterator] <= b) {
                count ++;
            }
        }

        return count;
    }
}
