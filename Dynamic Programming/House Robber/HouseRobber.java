public class HouseRobber{
  //top down method
  private int maxMoneyTopDown(int[]dp, int[] HouseNetWorth, int currentIndex){
    if(currentIndex >= HouseNetWorth.length) return 0;
    if(dp[currentIndex] == 0){
      int steal = HouseNetWorth[currentIndex] + maxMoneyTopDown(dp, HouseNetWorth, currentIndex+2);
      int skip = maxMoneyTopDown(dp, HouseNetWorth, currentIndex+1);
      dp[currentIndex] = Math.max(steal,skip);
    }
    return dp[currentIndex];
  }

  public int maxMoneyTopDown(int[] HouseNetWorth){
    int dp[] = new int[HouseNetWorth.length];
    return maxMoneyTopDown(dp, HouseNetWorth, 0);
  }

  // Bottom up method
  public int maxMoneyBottomUp(int[] HouseNetWorth){
    int[] dp = new int[HouseNetWorth.length + 2];
    dp[HouseNetWorth.length] = 0;
    for(int i=HouseNetWorth.length -1; i>=0; i--){
      dp[i] = Math.max(dp[i+2]+HouseNetWorth[i], dp[i+1]);
    }
    return dp[0];
  }
}
