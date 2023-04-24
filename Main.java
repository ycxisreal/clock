public class Main {
    public static void main(String[] args) {
        FileHander f = new FileHander();
        f.read();
        f.write(MaxMulti(FileHander.num,FileHander.n,FileHander.k));
    }
    public static int MaxMulti(int num,int n,int k)
    {
        String numStr = String.valueOf(num);
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 1; i <= n; i++) {
            dp[i][1] = Integer.parseInt(numStr.substring(0, i));
        }
        for (int j = 2; j <= k; j++) {
            for (int i = j; i <= n; i++) {
                for (int p = j - 1; p < i; p++) {
                    dp[i][j] = Math.max(dp[i][j], dp[p][j - 1] * Integer.parseInt(numStr.substring(p, i)));
                }
            }
        }
        return dp[n][k];
    }
}


