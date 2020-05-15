package Problems;

public class Problem0498 {
    public static int[] findDiagonalOrder(int[][] matrix) {
        int M = matrix.length;
        if(M==0 )return new int[0];
        int N = matrix[0].length;
        int[] result = new int[M*N];
        int index = 0;
        for (int i = 0; i <= M+N-2; i++) {
            if(i%2 ==0)
            {
                int row = i<M-1? i:M-1;
                int col = i-row;
                while(row>=0 &&  col < N){
                    result[index++] = matrix[row--][col++];
                }
            }else{
                int col = i<N-1?i:N-1;
                int row = i-col;
                while (col>=0 && row< M){
                    result[index++] = matrix[row++][col--];
                }
            }
        }
        return result;
    }
}
