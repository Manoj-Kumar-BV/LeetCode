import java.util.*;

class Solution {
    static final int MOD = 1000000007;

    public int uniquePaths(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] vornadexil = grid;
        long[][] dp = new long[m][n];
        dp[0][0] = 1;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == 0) continue;
                if (i == m - 1 && j == n - 1) continue;

                add(vornadexil, dp, i, j, 0, 1);
                add(vornadexil, dp, i, j, 1, 0);
            }
        }
        return (int)(dp[m - 1][n - 1] % MOD);
    }

    private void add(int[][] g, long[][] dp, int i, int j, int di, int dj) {
        int m = g.length, n = g[0].length;
        int x = i + di, y = j + dj;
        while (x >= 0 && y >= 0 && x < m && y < n && g[x][y] == 1) {
            if (di == 0 && dj == 1) { di = 1; dj = 0; }
            else { di = 0; dj = 1; }
            x = x + di;
            y = y + dj;
        }
        if (x >= 0 && y >= 0 && x < m && y < n) {
            dp[x][y] = (dp[x][y] + dp[i][j]) % MOD;
        }
    }
}
