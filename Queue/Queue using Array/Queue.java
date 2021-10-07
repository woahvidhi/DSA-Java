public class Queue{
  int arr[];
  int top;
  int begin;

  //constructor
  //creation of empty queue
  public Queue(int size){
    this.arr = new int[size];
    begin = -1;
    top = -1;
    System.out.println("Empty queue created with size "+size);
  }

  // check if queue is empty
  public boolean isEmpty(){
    if(begin<0){
      return true;
    }
    else{
      return false;
    }
  }

  // check if queue is full
  public boolean isFull(){
    if(top==arr.length -1){
      return true;
    } else{
      return false;
    }
  }

  // insert into queue
  public void insert(int value){
    if(isFull()){
      System.out.println("Queue is full");
      return;
    } else if(isEmpty()){
      begin = 0;
      top++;
      arr[top] = value;
    } else{
      top++;
      arr[top]= value;
    }
    System.out.println(value +" inserted into queue");
  }

  // remove from queue
  public int remove(){
    if(isEmpty()){
      System.out.println("Queue is empty");
      return -1;
    } else{
      int res = arr[begin];
      begin++;
      if(begin>top){
        begin = top = -1;
      }
      return res;
    }
  }

  //peek
  public int peek(){
    if(!isEmpty()){
      return arr[begin];
    } else{
      System.out.println("Queue is empty");
      return -1;
    }
  }

  //delete entire queue
  public void delete(){
    arr = null;
    top = begin = -1;
    System.out.println("Entire queue deleted");
  }
}

