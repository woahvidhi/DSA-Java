public class NumberOfPaths{
  public int paths(int[][] arr, int row, int col, int cost){
    if(cost <0) return 0;
    if(row==0 && col==0) return arr[0][0]-cost==0? 1:0;
    if(row == 0) return paths(arr, 0, col-1, cost-arr[row][col]);
    if(col == 0) return paths(arr, row-1, 0, cost-arr[row][col]);
    int prevRow = paths(arr, row-1, col, cost-arr[row][col]);
    int prevCol = paths(arr, row, col-1, cost-arr[row][col]);
    return prevCol + prevRow;
  }
}
