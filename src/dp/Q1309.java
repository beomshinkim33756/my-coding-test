package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/1309
 */
public class Q1309 {

    public static void main(String[] args) throws IOException {
        solution();
    }

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[][] dp = new long[N][2];

        dp[0][0] = 1;
        dp[0][1] = 2;

        for (int i=1; i < N; i++) {
            dp[i][0] = (dp[i-1][0] + dp[i-1][1]) % 9901;
            dp[i][1] = (dp[i-1][0] * 2 + dp[i-1][1]) % 9901;
        }

        System.out.println((dp[N-1][0] + dp[N-1][1]) % 9901);

    }
}
