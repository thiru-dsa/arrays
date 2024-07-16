package src.dsa.day4.transposeOfASquareMatrix;

// Question :-
// Given matrix N*M, find the A Transpose, with space complexity O(1) 

// Explanation ;-
    // Matrix:
    // [
    //   [1, 2, 3],
    //   [4, 5, 6],
    //   [7, 8, 9]
    // ]

// Output: 
    // [
    //   [1, 4, 7],
    //   [2, 5, 8],
    //   [3, 6, 9]
    // ]

// Time Complexity  : O(N2)
// Space Complexity : O(1)

public class TransposeOfASquareMatrix {

    public static void main(String[] args) {

        int[][] mat = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
        };

        System.out.println("Before transpose : ");
        print(mat);
        transposeOfASquareMatrix(mat);
        System.out.println("After transpose : ");
        print(mat);
    }

    public static void transposeOfASquareMatrix(int[][] mat) {
        
        for(int iterator = 0; iterator < mat.length; iterator++) {
            for(int jterator = iterator + 1; jterator < mat[0].length; jterator++) {
                int temp = mat[iterator][jterator];
                mat[iterator][jterator] = mat[jterator][iterator];
                mat[jterator][iterator] = temp;
            }
        }
    }

    public static void print(int[][] mat) {

        for(int iterator = 0; iterator < mat.length; iterator++) {
            for(int jterator = 0; jterator < mat[0].length; jterator++) {
                System.out.print(mat[iterator][jterator] + " ");
            }
            System.out.println();
        }
    }
}
