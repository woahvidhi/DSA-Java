public class DoublyLinkedList{
  int size;
  DoublyNode head;
  DoublyNode tail;

  //create one node DoublyLinkedList
  public DoublyNode create(int nodeValue){
    head = new DoublyNode();
    DoublyNode newNode = new DoublyNode();
    newNode.value = nodeValue;
    newNode.next = null;
    newNode.prev = null;
    head = tail = newNode;
    size = 1;
    System.out.println("Doubly Linked List created with value "+nodeValue);
    return head;
  }

  //insert value at given position
  public void insert(int value, int position){
    DoublyNode newNode = new DoublyNode();
    newNode.value = value;
    if(head == null){
      create(value);
      return;
    } else if(position == 0){
      newNode.next = head;
      newNode.prev = null;
      head.prev = newNode;
      head = newNode;
    } else if(position >= size){
      newNode.prev = tail;
      newNode.next = null;
      tail.next = newNode;
      tail = newNode;
    } else{
      DoublyNode temp = head;
      for(int i=0; i<position-1; i++){
        temp = temp.next;
      }
      newNode.prev = temp;
      newNode.next = temp.next;
      temp.next = newNode;
      newNode.next.prev = newNode;
    }
    size++;
    System.out.println(value+ " inserted at "+position);
  }
  
  //traversal from head to tail
  public void traversal(){
    if(head==null){
      System.out.println("Doubly Linked List does not exist");
      return;     
    }
     DoublyNode temp = head;
     for(int i=0; i<size; i++){
       System.out.print(temp.value);
       if(i != size-1) System.out.print(" -> ");
       temp = temp.next;
     }
     System.out.println();
  }

  //reverse traveral - tail to head
  public void reverse(){
    if(head == null){
      System.out.println("Doubly Linked List does not exist");
      return;
    }
    DoublyNode temp = tail;
    for(int i=0; i<size; i++){
      System.out.print(temp.value);
      if(i != size-1) System.out.print(" -> ");
      temp = temp.prev;
    }
    System.out.println();
  }

  //search for given value
  public boolean search(int value){
    if(head != null){
      DoublyNode temp = head;
      for(int i=0; i<size;i++){
        if(temp.value == value){
          System.out.println(value +" found");
          return true;
        }
      }
    }
    System.out.println(value + " not found");
    return false;
  }

  //delete node at given position
  public void delete(int position){
    if(head==null){
      System.out.println("Doubly Linked List does not exist");
      return;
    } else if(position == 0){
      if(size == 1){
        head=null;
        tail=null;
        size--;
        return;
      } else{
        head = head.next;
        head.prev = null;
        size--;
      }
    } else if(position >= size){
      DoublyNode temp = tail.prev;
      if(size==1){
        head = tail = null;
        size--;
        return;
      } else{
        temp.next = null;
        tail = temp;
        size--;
      }
    } else{
      DoublyNode temp = head;
      for(int i=0; i<position-1;i++){
        temp = temp.next;
      }
      temp.next = temp.next.next;
      temp.next.prev = temp;
      size--;
    }
    System.out.println("Node at "+position+" deleted");
  }

  //delete entire DoublyLinkedList
  public void deleteDLL(){
    DoublyNode temp = head;
    for(int i = 0; i<size; i++){
      temp.prev = null;
      temp = temp.next;
    }
    head = tail = null;
    System.out.println("Doubly Linked List deleted");
  }
}
