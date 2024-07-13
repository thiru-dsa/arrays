package src.dsa.day3.countOfLeaderInAnArray;


// Question :-
// Given N array, Find no of leaders
// Leaders :- the array element is leader if all of its right side element is lesser than this element 

// Time Complexity  : O(N)
// Space Complexity : O(1)

class CountOfLeaderInAnArray {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 4, 17, 16};

        System.out.println(countOfLeaders(arr));
    }

    public static int countOfLeaders(int[] arr) {
        int maxValue = Integer.MIN_VALUE;
        int leaderCount = 1;
        for(int iterator = arr.length-2; iterator > 0; iterator--) {
            if(maxValue < arr[iterator]) {
                leaderCount++;
                maxValue = arr[iterator];
            }
        }

        return leaderCount;
    }
}
