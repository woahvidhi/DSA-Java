class Main {
  public static void main(String[] args) {
    Searching search = new Searching();
    // linear
    int[] arr1 = {22,3,12,1,7,9,0,4};
    for(int i=0;i<arr1.length;i++) System.out.print(arr1[i]+" ");
    System.out.println();
    search.linearSearch(arr1, 0);
    search.linearSearch(arr1, 10);
    System.out.println();

    //binary
    int[] arr2 = {10,20,35,45,50,60,65,70,90};
    for(int i=0;i<arr2.length;i++) System.out.print(arr2[i]+" ");
    System.out.println();
    search.binarySearch(arr2, 65);
    search.binarySearch(arr2, 55);
  }
}
