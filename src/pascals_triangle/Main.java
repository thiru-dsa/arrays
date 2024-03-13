package pascals_triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        output = BruteForceApproach.generate(7);
        System.out.println(output);
    }
}

class BruteForceApproach {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<List<Integer>>();
        for(int iterator = 0; iterator < numRows; iterator++) {
            List<Integer> innerList = new ArrayList<Integer>();
            for(int jterator = 1; jterator <= iterator + 1; jterator++) {
                if(jterator == 1 || jterator == iterator+1) {
                    innerList.add(1);
                } else {
                    if(iterator >= 2) {
                        innerList.add(outerList.get(iterator-1).get(jterator - 2) + outerList.get(iterator - 1).get(jterator - 1));
                    }
//                    innerList.add(jterator);
//                    innerList.add(outerList.get(iterator).get(jterator));
//                    System.out.println(outerList);
                }

            }
            outerList.add(innerList);
        }

        return outerList;
    }
}


//import java.util.*;
//
//public class tUf {
//    public static List<Integer> generateRow(int row) {
//        long ans = 1;
//        List<Integer> ansRow = new ArrayList<>();
//        ansRow.add(1); //inserting the 1st element
//
//        //calculate the rest of the elements:
//        for (int col = 1; col < row; col++) {
//            ans = ans * (row - col);
//            ans = ans / col;
//            ansRow.add((int)ans);
//        }
//        return ansRow;
//    }
//
//    public static List<List<Integer>> pascalTriangle(int n) {
//        List<List<Integer>> ans = new ArrayList<>();
//
//        //store the entire pascal's triangle:
//        for (int row = 1; row <= n; row++) {
//            ans.add(generateRow(row));
//        }
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        int n = 5;
//        List<List<Integer>> ans = pascalTriangle(n);
//        for (List<Integer> it : ans) {
//            for (int ele : it) {
//                System.out.print(ele + " ");
//            }
//            System.out.println();
//        }
//    }
//}

