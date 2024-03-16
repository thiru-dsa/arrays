package sort_colors;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

//        BruteForce Approach
//        BruteForce.sortColors(nums);
        BruteForce.sortColors(nums);
        BruteForce.print(nums);
    }
}

class BruteForce {
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        int iterator = 0;
        while (mid <= high) {
            System.out.println("\nStart of the loop :");
            System.out.println("Low : " + low + " Mid : " + mid + " High : " + high + " Current value : " + nums[iterator]);
            iterator++;
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
            System.out.println("\nEnd of the loop :");
            System.out.println("Low : " + low + " Mid : " + mid + " High : " + high );

            System.out.println("\nThe array : ");
            print(nums);
            System.out.println("\n-------------\n");
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
