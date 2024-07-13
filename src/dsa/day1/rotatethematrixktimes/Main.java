package src.dsa.day1.rotatethematrixktimes;

    // Question :- 
    // Given N array, rotate the array k times 

    // Given N array, rotate the array from last to first k times  
    // solution :- (call the function in a different way, first reverse the whole array and then reverse the sub array)

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, -2, 1, 4, 6, 9, 8};
        int k = 3;

        ReverseTheArray obj = new ReverseTheArray();

        System.out.println("Before Rotating the array: ");
        obj.print(arr);

        System.out.println("After Reversing the array for " + k + " times: ");

        obj.rotateKTimes(arr, k);
        obj.print(arr);
    }
}

// Time Complexity  : O(N)
// Space Complexity : O(1)

class ReverseTheArray {
    public void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

       reverse(left, right, arr);
    }

    public void reverse(int start, int end, int[] arr) {
        int left = start;
        int right = end;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public void rotateKTimes(int[] arr, int k) {
        reverse(0, k-1, arr);
        reverse(k, arr.length - 1, arr);
        reverse(arr);
    }

    public void print(int[] arr) {
        for(int iterator = 0; iterator < arr.length; iterator++) {
            System.out.print(arr[iterator] + " ");
        }
        System.out.println();
    }
}


