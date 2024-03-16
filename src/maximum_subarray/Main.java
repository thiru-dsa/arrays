package maximum_subarray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-2,1};

//        BruteForce Method
//        Time Complexity  : O(n*n*n)
//        Space Complexity : O(1)

//        int answer = BruteForce.maxSubArray(arr);
//        System.out.println("Answer : " + answer);

//        BetterApproch Method -- (it fails,,,)
//              1. Find Prefix sum array
//              2. Find Positive max in the prefix sum array
//              3. Find Negative max in the prefix sum array
//              4. Add Positive max value and Negative max value (p - n)
//        Time Complexity  : O(n)
//        Space Complexity : O(1)

//        BetterApproach.maxSubArray(arr);

//        Optimal Approach
        OptimalApproach.maxSubArray(arr);
    }
}

class BruteForce {
    public static int maxSubArray(int[] nums) {
        int maxValue = 0;
        int currentMax = 0;
        for(int iterator = 0; iterator < nums.length; iterator++) {
            for(int jterator = iterator; jterator < nums.length; jterator++) {
                System.out.println("\ni : " + iterator + "  j : " + jterator);
                currentMax = sumOfSubArray(iterator, jterator, nums);
                if (currentMax > maxValue) {
                    maxValue = currentMax;
                }

                System.out.println("current : " + currentMax + "  maxx : " + maxValue);
            }
        }
        return maxValue;
    }

    public static int sumOfSubArray(int start, int end, int[] nums) {
        int sum = 0;
        for(int iterator = start; iterator < end + 1; iterator ++) {
            sum += nums[iterator];
        }
        System.out.println("Finding sum of sub array : ");

        return sum;
    }

}

class BetterApproach {
    public static void maxSubArray(int[] arr) {
        int positiveMax = 0;
        int negativeMax = 0;
        findPrefixSumArray(arr);
        positiveMax = findPositiveMax(arr);
        negativeMax = findNegativeMax(arr);
        System.out.println("Positive Max : " + positiveMax);
        System.out.println("Negative Max : " + negativeMax);
        System.out.println(positiveMax - negativeMax);
    }

    // Find prefix sum array
    private static void findPrefixSumArray(int[] arr) {

        for(int iterator = 1; iterator < arr.length; iterator++) {
            arr[iterator] = arr[iterator - 1] + arr[iterator];
        }

        for(int iterator = 0; iterator < arr.length; iterator++) {
            System.out.print(arr[iterator] + " ");
        }
    }

    private static int findPositiveMax(int[] arr) {
        int max = 0;
        for(int iterator = 0; iterator < arr.length; iterator++) {
            if(arr[iterator] > max && arr[iterator] > 0) {
                max = arr[iterator];
            }
        }
        return  max;
    }
    private static int findNegativeMax(int arr[]) {
        int max = 0;
        for(int iterator = 0; iterator < arr.length; iterator++) {
            if(arr[iterator] < max && arr[iterator] < 0) {
                max = arr[iterator];
            }
        }
        return  max;
    }



}

class OptimalApproach {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxii = nums[0];

        for (int num : nums) {

            sum += num;

            if (sum > maxii) {
                maxii = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxii);
        return maxii;
    }
}