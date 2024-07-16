package src.dsa.day4.printLeadingDiagonalOfASquareMatrix;

// Question :-
// Given matrix square matrix N*N, print the diagonal  

// Explanation ;-
    // Matrix:
    // [
    //   [1, 2, 3],
    //   [4, 5, 6],
    //   [7, 8, 9]
    // ]

// Output: 
    // 1 5 9
    // 3 5 7

// Time Complexity  : O(N)
// Space Complexity : O(1)

public class PrintLeadingDiagonalOfASquareMatrix {
    public static void main(String[] args) {
        
        int[][] mat = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        printLeadingDiagonalOfASquareMatrix(mat);
    }

    public static void printLeadingDiagonalOfASquareMatrix(int[][] mat) {
        
        for(int iterator = 0; iterator < mat.length; iterator++) {
            System.out.print(mat[iterator][iterator] + " ");
        }

        System.out.println();
 
        for(int iterator = 0; iterator < mat.length; iterator++) {
            System.out.print(mat[iterator][mat.length - 1 - iterator] + " ");
        }
 
        
    }
}
