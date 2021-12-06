class Main {
  public static void main(String[] args) {
    NumberFactor nf = new NumberFactor();
    System.out.println("Top Down -> "+nf.numberOfWaysTopDown(5));
    System.out.println("Bottom Up -> "+nf.numberOfWaysBottomUp(5));
  }
}
