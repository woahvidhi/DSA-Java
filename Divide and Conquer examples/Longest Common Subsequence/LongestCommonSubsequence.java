public class LongestCommonSubsequence{
  private int findLength(String s1, String s2, int i1, int i2){
    if(i1 == s1.length() || i2 == s2.length()) return 0;
    int count1 = 0;
    if(s1.charAt(i1) == s2.charAt(i2)){
      count1 = 1 + findLength(s1,s2,i1+1,i2+1);
    }
    int count2 = findLength(s1,s2,i1+1,i2);
    int count3 = findLength(s1, s2, i1, i2+1);

    return Math.max(count1, Math.max(count2, count3));
  }

  public int findLength(String s1, String s2){
    return findLength(s1, s2, 0, 0);
  }

}
