import java.util.Arrays;

class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        Arrays.fill(rows, -1);
        Arrays.fill(cols, -1);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    if (rows[i] == -1) {
                        rows[i] = j;
                    } else {
                        rows[i] = -2;
                    }
                    if (cols[j] == -1) {
                        cols[j] = i;
                    } else cols[j] = -2;
                }
            }
        }
        int res = 0;
        for (int i = 0; i < m; i++) {
            if (rows[i] >= 0) {
                if (cols[rows[i]] >= 0) {
                    res++;
                }
            }
        }

        return res;

    }
}
