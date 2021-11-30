public class ZeroOneKnapSack{
  private int KnapSack(int[] profits, int[] weights, int capacity, int currentIndex){
    if(capacity<=0 || currentIndex<0 || currentIndex>=profits.length) return 0;
    int profit1 = 0;
    if(weights[currentIndex]<=capacity){
      profit1 = profits[currentIndex] + KnapSack(profits, weights, capacity-weights[currentIndex], currentIndex+1);
    }
    int profit2 = KnapSack(profits, weights, capacity, currentIndex+1);

    return Math.max(profit1,profit2);
  }

  public int KnapSack(int[] profits, int[] weights, int capacity){
    return KnapSack(profits, weights, capacity, 0);
  }

}
