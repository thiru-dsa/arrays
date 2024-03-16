package set_matrix_zero;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];

        matrix[0][0] = 0;
        matrix[0][1] = 0;
        matrix[0][2] = 1;
        matrix[0][3] = 0;

        matrix[1][0] = 1;
        matrix[1][1] = 1;
        matrix[1][2] = 1;
        matrix[1][3] = 1;

        matrix[2][0] = 1;
        matrix[2][1] = 1;
        matrix[2][2] = 0;
        matrix[2][3] = 1;

        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
//        int[][] result = new int[matrix.length][matrix[0].length];
//        BetterApproach.initializeValue(result, -1);
//
//        BetterApproach.checkForTheValueZeroInMatrix(matrix, result);
//        BetterApproach.printMatrix(result);
        System.out.println("Actual Matrix: ");
        BetterApproach.printMatrix(matrix);
        OptimalApproach.findTheZeroInRowAndColumn(matrix);
        System.out.println("Zero Matrix: ");
        BetterApproach.printMatrix(matrix);
    }
}

class BruteForce{

    public static int[][] checkForTheValueZeroInMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    changeRowAndColumnValueToMinusOne(matrix, i, j);
                }
            }
        }

        return matrix;
    }

    public static void changeRowAndColumnValueToMinusOne(int[][] matrix, int posI, int posJ) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    continue;
                } else if (i == posI || j == posJ) {
                    matrix[i][j] = -1;
                }
            }
        }

    }
    static void setValueZeroForMinusOneInMatrix(int[][] result) {
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[0].length; j++) {
                if(result[i][j] == -1) {
                    result[i][j] = 0;
                }
            }
        }

    }
    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

class BetterApproach{
    public static void initializeValue(int[][] result, int value) {
        for(int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = value;
            }
        }

    }

    public static void checkForTheValueZeroInMatrix(int[][] matrix, int[][] result) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0){
                    setValueZeroForRowAndColumn(matrix, result, i, j);
                }
            }
        }

    }

    static void setValueZeroForRowAndColumn(int[][] matrix, int[][] result, int posI, int posJ) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(posI == i || posJ == j ) {
                    result[i][j] = 0;
                } else if(result[i][j] == -1){
                    result[i][j] = matrix[i][j];
                }
            }
        }

    }
    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

class OptimalApproach {
    public static void findTheZeroInRowAndColumn(int[][] matrix) {
        int rowZero = 1;
        for(int iterator = 0; iterator < matrix.length; iterator++) {
            for(int jterator = 0; jterator < matrix[0].length; jterator++) {
            System.out.println("called");
                if(matrix[0][0] == 0) {
                    rowZero = 0;
                } else  {
                    if (matrix[iterator][jterator] == 0) {
                        System.out.println(iterator+""+jterator);
                        matrix[iterator][0] = 0;
                        matrix[0][jterator] = 0;
                    }

                }
            }
        }
    }
}
