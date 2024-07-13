package src.dsa.day1.twosum;

// Question :- 
// Given N array element, Check if there exist a pair [i, j] such that arr[i] + arr[j] = k, where i != j, k is given 

public class Main {
    public static void main(String[] args) {
        
        int[] arr = {2, 1, 3, 4, 6, 8};
        int target = 10;
        int[] result = new int[2];
    
        TwoSum obj = new TwoSum();
        result = obj.sum(arr, arr.length, target);
        
        System.out.println("[" + result[0] + ", " + result[1] +"]");
    }
}

// Time Complexity  : O(N*N)
// Space Complexity : O(1)

class TwoSum {
    public int[] sum(int[] arr, int n, int target) {
        int[] result = {-1, -1};
        for(int iterator = 0; iterator < n; iterator++) {
            for(int jterator = iterator+1; jterator < n; jterator++) {
                if(arr[iterator] + arr[jterator] == target) {
                    result[0] = iterator;
                    result[1] = jterator;

                    return result;
                }
            }
        }

        return result;
    }
}
