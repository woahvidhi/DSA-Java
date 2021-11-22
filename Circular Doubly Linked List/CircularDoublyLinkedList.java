public class CircularDoublyLinkedList{
  public DoublyNode head;
  public DoublyNode tail;
  public int size;

  //create CDLL with one node 
  public DoublyNode create(int nodeValue){
    head = new DoublyNode();
    DoublyNode newNode = new DoublyNode();
    newNode.value = nodeValue;
    head = tail = newNode;
    newNode.next = newNode;
    newNode.prev = newNode;
    size = 1;
    System.out.println("Circular Doubly Linked List crested with node having value "+ nodeValue);
    return head;
  }

  // insert value at given position
  public void insert(int nodeValue, int position){
    DoublyNode newNode = new DoublyNode();
    newNode.value = nodeValue;
    if(head==null){
      create(nodeValue);
      return;
    } else if(position == 0){
      newNode.prev = tail;
      newNode.next = head;
      head.prev = newNode;
      head = newNode;
      tail.next = newNode;
    } else if(position>=size){
      newNode.prev = tail;
      newNode.next = head;
      head.prev = newNode;
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
    System.out.println(nodeValue+" inserted at " +position);
  }
  
  //traversal head -> tail
  public void traversal(){
    if(head!=null){
      DoublyNode temp = head;
      for(int i=0; i<size; i++){
        System.out.print(temp.value);
        if(i != size-1) System.out.print(" -> ");
        temp = temp.next;
      }
      System.out.println();
    } else System.out.println("Circular Doubly Linked List does not exist");
  }

  //reverse traversal tail -> head
  public void reverse(){
    if(head != null){
      DoublyNode temp = tail;
      for(int i=0; i<size; i++){
        System.out.print(temp.value);
        if(i != size-1){
          System.out.print(" -> ");
        } 
        temp = temp.prev;
      }
      System.out.println();
    } else System.out.println("Circular Doubly Linked List does not exist");
  }

  //search given value in CDLL
  public boolean search(int value){
    if(head != null){
      DoublyNode temp = head;
      for(int i=0; i<size; i++){
        if(temp.value == value){
          System.out.println(value+" found");
          return true;
        }
      }
    }
    System.out.println(value+" not found");
    return false;
  }

  // delete node at givem position
  public void delete(int position){
    if(head==null){
      System.out.println("Circular Doubly Linked List does not exist");
      return;
    } else if(position == 0){
      if(size ==1){
        head.next = head.next = null;
        head = tail = null;
      } else{
        head = head.next;
        head.prev = tail;
        tail.next = head;
      }
      size--;
    } else if(position >= size){
      if(size==1){
        head.next = head.prev = null;
        head = tail = null;
      } else{
        tail = tail.prev;
        tail.next=head;
        head.prev = tail;
      }
      size--;
    } else{
      DoublyNode temp = head;
      for(int i=0; i<position-1; i++){
        temp = temp.next;
      }
      temp.next = temp.next.next;
      temp.next.prev = temp;
      size--;
    }
  }

  //delete entire CDLL
  public void deleteCDLL(){
    DoublyNode temp = head;
    for(int i=0; i<size; i++){
      temp.prev = null;
      temp = temp.next;
    }
    head = tail = null;
    System.out.println("Circular Doubly Linked List deleted");
  }
}
