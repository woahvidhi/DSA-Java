public class ConvertString{
  private int findMinConverts(String s1, String s2, int i1, int i2){
    if(i1 == s1.length()) return s2.length() - i2;
    if(i2 == s2.length()) return s1.length() - i1;
    if(s1.charAt(i1) == s2.charAt(i2)) return findMinConverts(s1,s2,i1+1,i2+1);
   
    int delete = 1 + findMinConverts(s1,s2,i1+1,i2);
    int insert = 1 + findMinConverts(s1,s2,i1,i2+1);
    int replace = 1 + findMinConverts(s1,s2,i1+1,i2+1);

    return Math.min(delete, Math.min(insert,replace));
  }

  public int findMinConverts(String s1, String s2){
    return findMinConverts(s1,s2,0,0);
  }
}
