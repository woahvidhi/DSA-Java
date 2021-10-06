public class Queue{
  LinkedList linkedlist;

  //constructor
  public Queue(){
    linkedlist = new LinkedList();
  }

  // checks if queue is empty
  public boolean isEmpty(){
    if(linkedlist.head == null){
      return true;
    } else{
      return false;
    }
  }

  //insert in queue
  public void insert(int value){
    linkedlist.insert(value,linkedlist.size);
    System.out.println(value+" successfully inserted into queue");
  }

  // removing from Queue
  public int remove(){
    int value = -1;
    if (isEmpty()){
      System.out.println("Queue is empty");
    } else{
      value = linkedlist.head.value;
      linkedlist.delete(0);
    }
    return value;
  }

  // peek element
  public int peek(){
    if (isEmpty()){
      System.out.println("Queue is empty");
      return -1;
    } else{
      return linkedlist.head.value;
    }
  }

  //deletion of entire queue
  public void delete(){
    linkedlist.head = null;
    linkedlist.tail = null;
    System.out.println("Queue deleted");
  }
}