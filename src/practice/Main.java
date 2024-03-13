package practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        List<Integer> innerList1 = new ArrayList<Integer>();
        List<Integer> innerList2 = new ArrayList<Integer>();
        List<Integer> innerList3 = new ArrayList<Integer>();

        int numRows = 3;

        innerList1.add(1);
        innerList1.add(2);
        innerList1.add(3);

        innerList2.add(4);
        innerList2.add(5);
        innerList2.add(6);

        innerList3.add(7);
        innerList3.add(8);
        innerList3.add(9);

        output.add(innerList1);
        output.add(innerList2);
        output.add(innerList3);

        System.out.println(output);
        System.out.println();

        for(int iterator = 0; iterator < numRows; iterator++) {

            for (int jterator = 1; jterator <= iterator + 1; jterator++) {
                System.out.println(output.get(iterator).get(jterator-1 ));
            }
        }

    }
}
