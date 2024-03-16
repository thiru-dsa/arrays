package next_permutation;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5};
        BruteForce.nextPermutation(arr);
    }

}

class BruteForce {
    public static void nextPermutation(int[] nums) {
        int breakPoint = 0;
        // finding breaking point
        for(int iterator = nums.length -1; iterator > 0; iterator--) {
            if(nums[iterator - 1] < nums[iterator]) {
                breakPoint = iterator - 1;
                System.out.println("i = " + iterator);
                System.out.println("Breaking point " + breakPoint);
                break;
            }
        }

        // finding the next bigger value to breakPoint, from right to left to swap
        // (the number has to greater than breakPoint and smaller than other values)
        for(int iterator = nums.length -1; iterator > 0; iterator--) {
            if(nums[iterator] > breakPoint) {
                int temp = nums[iterator];
                nums[iterator] = nums[breakPoint];
                nums[breakPoint] = temp;

                System.out.println("start : " + nums[iterator]);
                System.out.println("end : " + nums[breakPoint]);
                break;
            }
        }

        // reverse the array, from next to breakpoint to end of array
        reverseArray(breakPoint + 1, nums.length - 1, nums);

        print(nums);
    }

    public static void reverseArray(int start, int end, int[] nums) {
        System.out.println("start of index:" + start);
        System.out.println("end of index:" + end);
        int i = 1;
        for(int iterator = start; iterator <= (end + 1) / 2; iterator ++) {
            System.out.println("i"+iterator);
            System.out.println("swap first : " + nums[iterator]);
//            System.out.println("swap last  : " + nums[end - iterator + 2]);
            System.out.println("swap last  : " + nums[end - i]);

            int temp = nums[iterator];
            nums[iterator] = nums[end - i];
            nums[end - i] = temp;
            i++;
        }
    }

    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }
}