public class ConvertString{
  public int TopDown(String s1, String s2){
    Integer[][] dp = new Integer[s1.length()+1][s2.length()+1];
    return TopDown(dp,s1,s2,0,0);
  }

  private int TopDown(Integer[][] dp, String s1, String s2, int i1, int i2){
    if(dp[i1][i2] == null){
      if(i1 == s1.length()) dp[i1][i2] = s2.length() - i2;
      else if(i2 == s2.length()) dp[i1][i2] = s1.length() - i1;
      else if (s1.charAt(i1) == s2.charAt(i2)) dp[i1][i2] = TopDown(dp,s1,s2,i1+1,i2+1);
      else{
        int c1 = TopDown(dp,s1,s2,i1+1,i2);
        int c2 = TopDown(dp,s1,s2,i1,i2+1);
        int c3 = TopDown(dp,s1,s2,i1+1,i2+1);
        dp[i1][i2] = 1 + Math.min(c1, Math.min(c2,c3));
      }
    }
    return dp[i1][i2];
  }

  public int BottomUp(String s1, String s2){
    int[][] dp = new int[s1.length()+1][s2.length()+1];
    for(int i1=0; i1<=s1.length();i1++) dp[i1][0] = i1;
    for(int i2=0; i2<=s2.length();i2++) dp[0][i2] = i2;
    for(int i1 = 1; i1<=s1.length(); i1++){
      for(int i2=1; i2<=s2.length(); i2++){
        if(s1.charAt(i1-1) == s2.charAt(i2-1)){
          dp[i1][i2] = dp[i1-1][i2-1];
        } else{
          dp[i1][i2] = 1 + Math.min(dp[i1-1][i2],Math.min(dp[i1][i2-1],dp[i1-1][i2-1]));
        }
      }
    }
    return dp[s1.length()][s2.length()];
  }
}
