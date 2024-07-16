package src.dsa.day5.rotateAMatrix90Deg;

// Question :-
// Given a matrix N*M, Rotate the matrix 90 deg

// Explanation ;-
    // Matrix:
    // [
    //   [1, 2,],
    //   [3, 4],
    //   [5, 6],
    // ]

// Output: 
    // [
    //   [5, 3, 1],
    //   [6, 4, 2],
    // ]

// Time Complexity  : O(N*M)
// Space Complexity : O(N)

public class RotateAMatrix90Deg {

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
        resultMat = find90DegRotationOfAMatrix(mat);
        System.out.println("After transpose : ");
        print(resultMat);
    }

    public static int[][] find90DegRotationOfAMatrix(int[][] mat) {

        int[][] resultMatrix = new int[mat[0].length][mat.length];
        findTransposeOfANonSquareMatrix(mat, resultMatrix);
        reverseEachRow(resultMatrix);

        return resultMatrix;
    }

    public static int[][] findTransposeOfANonSquareMatrix(int[][] mat, int[][] resultMatrix) {

        
        for(int iterator = 0; iterator < mat.length; iterator++) {
            for(int jterator = 0; jterator < mat[0].length; jterator++) {
                resultMatrix[jterator][iterator] = mat[iterator][jterator];
            }
        }

        return resultMatrix;
    }

    public static void reverseEachRow(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for(int iterator = 0; iterator < n; iterator++) {
            for(int jterator = 0; jterator < m / 2; jterator++) {
                int temp = mat[iterator][jterator];
                mat[iterator][jterator] = mat[iterator][m - 1 - jterator];
                mat[iterator][m - 1 - jterator] = temp;
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
