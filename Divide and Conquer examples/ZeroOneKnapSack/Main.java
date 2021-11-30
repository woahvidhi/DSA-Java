class Main {
  public static void main(String[] args) {
    int[] profits = {31,26,17,72};
    int[] weights = {3,1,2,5};
    ZeroOneKnapSack ks = new ZeroOneKnapSack();
    System.out.println(ks.KnapSack(profits, weights, 7)); // second + last = 98
  }
}
