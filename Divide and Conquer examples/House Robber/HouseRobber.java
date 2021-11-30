public class HouseRobber{
  private int maxMoney(int[] houseNetWorth, int currentHouse){
    if(currentHouse >= houseNetWorth.length) return 0;
    int steal = houseNetWorth[currentHouse] + maxMoney(houseNetWorth, currentHouse+2); // can not rob consecutive houses
    int skip = maxMoney(houseNetWorth, currentHouse+1);
    return Math.max(steal,skip);
  }

  public int maxMoney(int[] houseNetWorth){
    return maxMoney(houseNetWorth,0);
  }
}
