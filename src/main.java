import Problems.Problem0014;
import Problems.Problem0028;

public class main {
    public static void main(String[] args) {
        /*int [] test0747 = {0,0,0,1};
        System.out.println(Problem0747.dominantIndex(test0747));*/

        /*int[] test0066 = {9,9,8};
        System.out.println(Problem0066.plusOne(test0066));*/

        /*int[][] matrix = {{1,2,3},{4,5,6}};
        int[] result = Problem0498.findDiagonalOrder(matrix);
        for (int i:result
             ) {
            System.out.print(i);
        }*/

        /*List<List<Integer>> list = Problem0118.generate(5);
        for (List<Integer> ls: list
             ) {
            for (Integer i:ls
                 ) {
                System.out.print(i);
            }
            System.out.println();
        }*/

        /*String a = "1234567";
        String b = "01";
        while (a.length()>b.length()){
            b = '0'+b;
        }
        System.out.println(b);*/

        System.out.println(Problem0028.strStr("bbbbbbbaa","bbbbbbaa"));

        String[] strs = {"flower","flow","flight"};
        System.out.println(Problem0014.longestCommonPrefix(strs));


    }
}
