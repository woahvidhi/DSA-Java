public class NumberFactor{
  // Top Down method
  private int numberOfWaysTopDown(int[] dp, int n){
    if(n==0 || n==1 || n==2) return 1;
    else if(n==3) return 2;
    if(dp[n] == 0){
      int c1 = numberOfWaysTopDown(dp, n-1);
      int c2 = numberOfWaysTopDown(dp, n-3);
      int c3 = numberOfWaysTopDown(dp, n-4);
      dp[n] = c1 + c2 + c3;
    }
    return dp[n];
  }

  public int numberOfWaysTopDown(int n){
    int dp[] = new int[n+1];
    return numberOfWaysTopDown(dp,n);
  }

  //Bottom Up method

  public int numberOfWaysBottomUp(int n){
    int dp[] = new int[n+1];
    dp[0] = dp[1] = dp[2] = 1;
    dp[3] = 2;
    for(int i=4; i<=n; i++){
      dp[i] = dp[i-1] + dp[i-3] + dp[i-4];
    }
    return dp[n];
  }
}
