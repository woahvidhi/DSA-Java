public class Searching{
  // linear searching
  // for unsorted
  // time complexity is O(N)
  public static int linearSearch(int arr[], int value){
  for(int i=0; i<arr.length;i++){
    if(arr[i] == value){
      System.out.println(value + " found");
      return i;
    }
  }
  System.out.println(value+" does not exist");
  return -1;
  }

  // for sorted
  // time complexity O(logN)
  public static int binarySearch(int arr[], int value){
    int start = 0;
    int end = arr.length;
    int mid = (start + end)/2;
    while(end>start){
      if(arr[mid]>value) end = mid -1;
      else start = mid +1;
      mid = (start+end)/2;
      if(arr[mid] == value){
        System.out.println(value + " found");
        return mid;
      }
    }
    System.out.println(value+" does not exist");
    return -1;
  }
}
