public class MinCost{
  public int findMin(int[][] cost, int row, int col){
    if(row == -1 || col == -1) return Integer.MAX_VALUE;
    if(row==0 && col==0) return cost[row][col];
    int min1 = findMin(cost, row-1, col); // to go up
    int min2 = findMin(cost, row, col-1); // to go left
    int minPath = cost[row][col] + Integer.min(min1, min2);
    return minPath;
  }
}
