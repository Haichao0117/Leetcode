package Problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description: Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
 *              Note that the row index starts from 0.
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/13 14:49
 **/
public class Problem0119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> resultRow = new ArrayList<Integer>();
        resultRow.add(1);
        for(int i = 1; i <= rowIndex; i++){
            for(int j = i-1;j > 0;j--){
                resultRow.set(j,resultRow.get(j-1)+resultRow.get(j));
            }
            resultRow.add(1);

        }
        return resultRow;
    }
}
