import java.util.Arrays;

public class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[] rowSums = new int[n];
        int[] columnSums = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int value = mat[i][j];
                rowSums[i] += value;
                columnSums[j] += value;
            }
        }

        int number = 0;
        for (int i = 0; i < n; i++) {
            if(rowSums[i] != 1){
                continue;
            }
            for (int j = 0; j < m; j++) {
                if(mat[i][j] == 1 && columnSums[j] == 1){
                    number++;
                }
            }
        }
        return number;
    }
}
