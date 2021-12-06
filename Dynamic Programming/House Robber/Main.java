class Main {
  public static void main(String[] args) {
    int[] houseNetWorth = {6,7,1,30,8,2,4};
    HouseRobber hr = new HouseRobber();
    System.out.println("Top Down -> " + hr.maxMoneyTopDown(houseNetWorth));//41 = 7 30 4
    System.out.println("Bottom Up -> "+hr.maxMoneyBottomUp(houseNetWorth));
  }
}
