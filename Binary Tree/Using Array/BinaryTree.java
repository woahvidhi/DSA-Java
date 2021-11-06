public class BinaryTree{
  String [] arr;
  int lastIndex;

  //Create empty binary tree
  // constructor
  public BinaryTree(int size){
    arr = new String[size + 1];
    this.lastIndex = 0;
  }

  // check id binary tree is full or not
  public boolean isFull(){
    if(lastIndex == arr.length){
      return true;
    } else{
      return false;
    }
  }

  //insert element into binary tree
  public void insert(String value){
    if(!isFull()){
      arr[lastIndex + 1] = value;
      lastIndex ++;
      System.out.println(value + " inserted into binary tree");
    } else{
      System.out.println("Binary Tree is full");
    }
  }

  //pre order traversal
  // root -> left -> right
  public void preOrder(int index){
    if(index>lastIndex){
      return;
    }
    System.out.print(arr[index]+" ");
    preOrder(index*2);
    preOrder(index*2 +1);
  }

  //in order traversal
  // left -> root -> right
  public void inOrder(int index){
    if(index>lastIndex){
      return;
    }
    inOrder(index*2);
    System.out.print(arr[index]+" ");
    inOrder(index*2 + 1);
  }

  // post order traversal
  // left -> right -> root
  public void postOrder(int index){
    if(index>lastIndex){
      return;
    }
    postOrder(index*2);
    postOrder(index*2 + 1);
    System.out.print(arr[index]+" ");
  }

  // level order
  public void levelOrder(){
    for(int i=1; i<lastIndex+1;i++){
      System.out.print(arr[i]+" ");
    }
  }

  // searching element in binary tree
  public int search(String value){
    for(int i = 1;i<=lastIndex;i++){
      if(arr[i]==value){
        System.out.println(value +" found");
        return i;
      } 
    }
    System.out.println(value +" not found");
    return -1;
  }

  // delete an element from binary tree;
  public void delete(String value){
    int index = search(value);
    if(index == -1 ){
      return;
    } else{
      arr[index] = arr[lastIndex];
      lastIndex--;
      System.out.println(value +" deleted");
    }
  }

  // delete entire binary tree
  public void deleteBT(){
    arr=null;
    System.out.println("Entire binary tree has been deleted");
  }

}