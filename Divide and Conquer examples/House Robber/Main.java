class Main {
  public static void main(String[] args) {
    int[] houseNetWorth = {6,7,1,30,8,2,4};
    HouseRobber hr = new HouseRobber();
    System.out.println(hr.maxMoney(houseNetWorth));//41 = 7 30 4
  }
}
