package src.dsa.day4.transposeOfANonSquareMatrix;

// Question :-
// Given matrix A -> N*M, find the A Transpose

// Explanation ;-
    // Matrix:
    // [
    //   [1, 2,],
    //   [3, 4],
    //   [5, 6],
    // ]

// Output: 
    // [
    //   [1, 3, 5],
    //   [2, 4, 6],
    // ]

// Time Complexity  : O(N2)
// Space Complexity : O(1)

public class TransposeOfANonSquareMatrix {
    
    public static void main(String[] args) {
        int[][] mat = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90},
            {100, 110, 120}
        };

        int N = mat.length;
        int M = mat[0].length;

        int[][] resultMat = new int[M][N];

        System.out.println("Before transpose : ");
        print(mat);
        resultMat = findTransposeOfANonSquareMatrix(mat);
        System.out.println("After transpose : ");
        print(resultMat);
    }

    public static int[][] findTransposeOfANonSquareMatrix(int[][] mat) {

        int[][] resultMatrix = new int[mat[0].length][mat.length];
        for(int iterator = 0; iterator < mat.length; iterator++) {
            for(int jterator = 0; jterator < mat[0].length; jterator++) {
                resultMatrix[jterator][iterator] = mat[iterator][jterator];
            }
        }

        return resultMatrix;
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