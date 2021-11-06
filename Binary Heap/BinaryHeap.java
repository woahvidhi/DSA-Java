public class BinaryHeap{
  int arr[];
  int size;

  //creating empty binary heap
  //constructor
  public BinaryHeap(int size){
    arr = new int[size+1];
    this.size = 0;
    System.out.println("Empty Binary Heap created");
  }

  //check if binary heap is empty
  public boolean isEmpty(){
    if(size==0){
      return true;
    } else{
      return false;
    }
  }

  //peek -> root
  public Integer peek(){
    if(isEmpty()){
      System.out.println("Binary Heap has no elements");
      return null;
    }
    return arr[1];
  }

  //traversal - level order
  public void traversal(){
    for(int i=1;i<=size;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }

  //heapify -> bottom to top -> parent
  public void heapifyBTT(int index, String type){
    int parent = index/2;
    if(index<=1){
      return;
    }
    // for min heap 
    if(type == "Min"){
      if(arr[index]<arr[parent]){
        int temp = arr[index];
        arr[index] = arr[parent];
        arr[parent] = temp;
      }
      // for max heap
    } else if(type == "Max"){
      if(arr[index]>arr[parent]){
        int temp = arr[index];
        arr[index] = arr[parent];
        arr[parent] = temp;
      }
    }
    heapifyBTT(parent, type);
  }

  //insert
  public void insert(int value, String type){
    arr[size+1] = value;
    size ++;
    heapifyBTT(size, type);
    System.out.println(value +" inserted in binary heap");
  }

  //heapify -> top to bottom -> left and right child
  public void heapifyTTB(int index, String type){
    int swapChild = 0;
    int left = index*2;
    int right = index*2 + 1;
    // case 1: no child same for min and max
    if(size < left){
      return;
    }
    // max heap
    if(type == "Max"){
      // case 2: for one child -> left child
      if(size == left){
        if(arr[index]<arr[left]){
          int temp = arr[index];
          arr[index] = arr[left];
          arr[left] = temp;
        }
        return;
      }
      // case 3: for two children
      else{
        // get the greater element
        if(arr[left]>arr[right]){
          swapChild = left;
        } else{
          swapChild = right;
        }
        //swapping
        if(arr[index]<arr[swapChild]){
          int temp = arr[index];
          arr[index] = arr[swapChild];
          arr[swapChild] = temp;
        }
      }
    }
    else if(type == "Min"){
      //case 2: one child -> left
      if(size == left){
        if(arr[index]>arr[left]){
          int temp = arr[index];
          arr[index] = arr[left];
          arr[left] = temp;
        }
        return;
      }
      // case 3: for two children
      else{
        // value of swapChild
        if(arr[left]<arr[right]){
          swapChild = left;
        } else{
          swapChild = right;
        }

        // swapping
        if(arr[index]>arr[swapChild]){
          int temp = arr[index];
          arr[index] = arr[swapChild];
          arr[swapChild] = temp;
        }
      }
    }
    heapifyTTB(swapChild, type);
  }

  //extract head
  public int extractHead(String type){
    if(isEmpty()){
      return -1;
    } else{
      int value = arr[1];
      arr[1] = arr[size];
      size--;
      heapifyTTB(1, type);
      return value;
    }
  }

  //delete binary heap
  public void deleteBH(){
    arr = null;
    System.out.println("Binary Heap deleted");
  }
}