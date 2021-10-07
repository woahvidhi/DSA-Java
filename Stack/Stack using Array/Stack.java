public class Stack{
  int arr[];
  int topOfStack;

  // constructor
  // creation of empty stack
  public Stack(int size){
    this.arr = new int[size];
    this.topOfStack = -1;
    System.out.println("Empty stack created with size "+size);
  }

  // check if stack is empty
  public boolean isEmpty(){
    if(topOfStack == -1){
      return true;
    } else {
      return false;
    }
  }

  // check if stack is full
  public boolean isFull(){
    if(topOfStack == arr.length - 1){
      return true;
    } else {
      return false;
    }
  }

  //push given value on to stack
  public void push(int value){
    if(isFull()){
      System.out.println("Stack is full");
    } else{
      arr[topOfStack+1] = value;
      topOfStack++;
      System.out.println(value+" pushed into stack");
    }
  }

  //pop in stack
  public int pop(){
    if(isEmpty()){
      System.out.println("Stack is Empty");
      return -1;
    } else{
      int value = arr[topOfStack];
      topOfStack--;
      return value;
    }
  }

  // peek into Stack
  public int peek(){
    if(isEmpty()){
      System.out.println("Stack is Empty");
      return -1;
    } else{
      return arr[topOfStack];
    }
  }

  //delete stack
  public void delete(){
    arr = null;
    topOfStack = -1;
    System.out.println("Stack deleted");
  }
}