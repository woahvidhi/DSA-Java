public class Stack{
  LinkedList linkedlist;

  // constructor
  public Stack(){
    linkedlist = new LinkedList();
  }

  //pushing elements into the stack
  public void push(int value){
    linkedlist.insert(value,0);//always pushed at location 0
    System.out.println(value+" pushed into stack successfully");
  }

  // checking is stack empty
  public boolean isEmpty(){
    if(linkedlist.head==null){
      return true;
    } else{
      return false;
    }
  }

  // pop elements - removing last element
  public int pop(){
    int result = -1;
    if(isEmpty()){
      System.out.println("Stack is Empty");
      return result;
    } else {
      result = linkedlist.head.value;
      linkedlist.delete(0);
      return result;
    }
  }

  // peek - gives topmost element of the stack
  public int peek(){
    if(isEmpty()){
      System.out.println("Stack is Empty");
      return -1;
    } else{
      return linkedlist.head.value;
    }
  }

  // deletion of entire stack
  public void delete(){
    linkedlist.head = null;
    System.out.println("Stack deleted");
  }
}