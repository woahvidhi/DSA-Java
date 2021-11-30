public class LPS{
  private int findLength(String s, int start, int end){
    if(start>end) return 0;
    if(start == end) return 1;
    int count1 = 0;
    if(s.charAt(start) == s.charAt(end)) {
      count1 = 2 + findLength(s, start+1, end-1);}
    int count2 = findLength(s, start+1, end);
    int count3 = findLength(s, start, end-1);

    return Math.max(count1, Math.max(count2,count3));
  }

  public int findLength(String s){
    return findLength(s, 0, s.length()-1);
  }
}
