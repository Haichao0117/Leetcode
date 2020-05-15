package Problems;

import java.util.ArrayList;
import java.util.List;

/*Given a non-negative integer numRows,
 generate the first numRows of Pascal's triangle.*/

public class Problem0118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0) return result;

       /* List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);*/

        result.add(new ArrayList<>());
        result.get(0).add(1);

        for(int i = 1;i <numRows;i++){
            List<Integer> current = new ArrayList<>();
            List<Integer> last = result.get(i-1);

            current.add(1);
            for (int j = 1; j < i ; j++) {
                current.add(last.get(j-1)+last.get(j));
            }
            current.add(1);
            result.add(current);
        }
        return result;
    }
}
