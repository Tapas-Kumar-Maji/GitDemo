package Tutorial;

public class Thought1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result = find(4,3,2);
		System.out.println("result" + result);
	}
	
	public static long find(long N, long K, long X) {
		// Write your code here
		int MOD = 1000000007;
		if(N == 1){
			return X == 1 ? 1 : 0;
		}

		long[][] dp = new long[(int) (N+1)][(int) (K+1)];
		dp[1][1] = 1;

		for(int i=2; i<=N; i++){
			for(int j=1; j<=K; j++){
				dp[i][j] = 0;
				for(int l=1; l<= K; l++){
					if(l != j){
						dp[i][j] = (dp[i][j] + dp[i-1][1]) % MOD;
					}
				}
				System.out.print(dp[i][j] + ", ");
			}
			System.out.println();
		}

		return dp[(int) N][(int) X];
	}

}
