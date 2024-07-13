package src.dsa.day1.reversethearray;

// Question :-
// Given N array element, To find the count of elements having atleast one element greater than itself

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 8, 9, 6, 7, 9};

        ReverseTheArray obj = new ReverseTheArray();

        System.out.println("Before Reversing the array: ");
        obj.print(arr);

        System.out.println("After Reversing the array: ");
        obj.reverse(arr);
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

    public void print(int[] arr) {
        for(int iterator = 0; iterator < arr.length; iterator++) {
            System.out.print(arr[iterator] + " ");
        }
        System.out.println();
    }
}

