class Main {
  public static void main(String[] args) {
    int arr[] = {12,1,4,32,14,10,16};

    System.out.print("Before sorting: ");
    for(int i =0; i<arr.length-1; i++){
      System.out.print(arr[i]+" ");
    }

    for(int i = 0; i<arr.length-1; i++){
      for(int j = 0; j<arr.length-i-1; j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    System.out.println();
    System.out.print("After sorting: ");
    for(int i =0; i<arr.length-1; i++){
      System.out.print(arr[i]+" ");
    }
  }
}
