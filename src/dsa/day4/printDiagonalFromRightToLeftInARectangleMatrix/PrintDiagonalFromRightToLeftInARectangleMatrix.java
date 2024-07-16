package src.dsa.day4.printDiagonalFromRightToLeftInARectangleMatrix;

// Question :-
// Given matrix N*M, print all the diagonal from right to left

// Explanation ;-
    // Matrix:
    // [
    //   [1, 2,],
    //   [3, 4],
    //   [5, 6],
    // ]

// Output: 
    // 1
    // 2 3 
    // 4 5
    // 6

// Time Complexity  : O(N2)
// Space Complexity : O(1)

public class PrintDiagonalFromRightToLeftInARectangleMatrix {

    public static void main(String[] args) {
        int[][] mat = {
            {10, 20},
            {30, 40},
            {50, 60},
        };

        printDiagonalFromRightToLeftInARectangleMatrix(mat);
    }

    public static void printDiagonalFromRightToLeftInARectangleMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        for(int column = 0; column < m; column++) {
            int iterator = 0, jterator = column;
            while(iterator < n && jterator >= 0) {
                System.out.print(mat[iterator][jterator] + " ");
                iterator++;
                jterator--;
            }

            System.out.println();
        }

        for(int row = 1; row < n; row++) {
            int iterator = row, jterator = m-1;
            while(iterator < n && jterator >= 0) {
                System.out.print(mat[iterator][jterator] + " ");
                iterator++;
                jterator--;
            }

            System.out.println();
        }
    }
}
