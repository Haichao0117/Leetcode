package Problems;

import java.util.HashSet;

/**
 * @Project: leetcode
 * @Package: Problems
 * @Description:
 * @Author: Wang Haichao
 * @CreateTime: 2020/5/24 17:16
 **/
public class Problem0036 {
    public boolean isValidSudoku(char[][] board) {
        //woshishabi(board);
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] boxes = new int[9][9];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length;j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '1';
                    int box_index = (i/3)*3+j/3;
                    if(rows[i][num] == 1) return false;
                    else rows[i][num] = 1;
                    if(cols[j][num] == 1) return false;
                    else cols[j][num] = 1;
                    if(boxes[box_index][num] == 1)return false;
                    else boxes[box_index][num] = 1;
                }
            }
        }
        return true;
    }

    private boolean woshishabi(char[][] board) {
        //HashSet<Character> sudoku = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            HashSet<Character> sudoku = new HashSet<>();
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] !='.'){
                    if(sudoku.contains(board[i][j])) return false;
                    else sudoku.add(board[i][j]);
                }
            }
        }

        for(int i = 0; i < board[0].length; i++){
            HashSet<Character> sudoku = new HashSet<>();
            for(int j = 0; j < board.length; j++){
                if(board[j][i] !='.'){
                    if(sudoku.contains(board[j][i])) return false;
                    else sudoku.add(board[j][i]);
                }
            }
        }
        return true;
    }
}
