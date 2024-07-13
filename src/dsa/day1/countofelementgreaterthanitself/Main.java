package src.dsa.day1.countofelementgreaterthanitself;

// Question :-
// Given N array element, To find the count of elements having at least one element greater than itself

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 8, 9, 6, 7, 9};

        Solution obj = new Solution();
        
        System.out.println(obj.countOfElementGreaterThanItself(arr));
    }
    
}

// Time Complexity  : O(N)
// Space Complexity : O(1)

class Solution {
    public int countOfElementGreaterThanItself(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        
        for(int iterator = 0; iterator < arr.length; iterator++) {
            if(arr[iterator] > max) {
                max = arr[iterator];
                maxCount = 0;
            }
            if(arr[iterator] == max) {
                maxCount++;
            } 
        }
        
        return arr.length - maxCount;
    }
}

