package src.dsa.day3.countOfTotalSubarray;

// Question :-
// Given N array, return the count of total sub array 

// Time Complexity  : O(1)
// Space Complexity : O(1)

class CountOfTotalSubarraySubArray {

    public static void main(String[] args) {
        
        int[] arr = {4, 2, 10, 3};

        System.out.println(countOfSubArray(arr));
    }

    public static int countOfSubArray(int[] arr) {

        int n = arr.length;
        return (n*(n+1))/2;
    }
}
