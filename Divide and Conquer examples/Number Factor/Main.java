class Main {
  public static void main(String[] args) {
    NumberFactor nf = new NumberFactor();
    //use 1,3,4 to make the given sum
    // for 4 -> {1,1,1,1}, {4}, {3,1}, {1,3}
    // for 5 -> f(4) + 1 -> {1,1,1,1,1}, {4,1}, {3,1,1}, {1,3,1}
    // f(2) + 3 -> {1,1,3}
    // f(1) + 4 -> {1,4}
    // hence 6 ways to get 5
    System.out.println(nf.numberOfWays(4)); //4
    System.out.println(nf.numberOfWays(5)); //6
    System.out.println(nf.numberOfWays(6)); //9
  }
}
