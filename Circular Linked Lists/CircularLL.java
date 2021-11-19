public class CircularLL{
  public Node head;
  public Node tail;
  public int size;

  //create CLL with one node
  //constructor
  public Node create(int nodeValue){
    head = new Node();
    Node newNode = new Node();
    newNode.value = nodeValue;
    newNode.next = newNode;
    head = newNode;
    tail = newNode;
    size = 1;
    System.out.println("Circular Linked Listed created with node value as "+nodeValue);
    return head;
  }

  //insert value at given position
  public void insert(int value, int position){
    Node newNode = new Node();
    newNode.value = value;
    if(head == null){
      create(value);
      return;
    } else if(position == 0){
      newNode.next = head;
      head = newNode;
      tail.next = head;
    } else if(position >= size){
      tail.next = newNode;
      tail = newNode;
      tail.next = head;
    } else{
      Node temp = head;
      for(int i=0; i<position-1;i++){
        temp = temp.next;
      }
      newNode.next = temp.next;
      temp.next = newNode;
    }
    size++;
    System.out.println(value+" inserted at "+position);
  }

  //traversal
  public void traversal(){
    if(head != null){
      Node temp = head;
      for(int i=0; i<size; i++){
        System.out.print(temp.value);
        if(i != size -1){
          System.out.print(" -> ");
        }
        temp = temp.next;
      }
      System.out.println();
    }
  }

  //searching for given value
  public boolean search(int value){
    if(head != null){
      Node temp = head;
      for(int i=0; i<size; i++){
        if(temp.value == value){
          System.out.println("Found "+value +" at position "+i);
          return true;
        }
        temp = temp.next;
      }
    }
    System.out.println(value+" not found");
    return false;
  }

  //delete node at given position
  public void delete(int position){
    if(head == null){
      System.out.println("Circular Linked List does not exist");
      return;
    } else if(position == 0){
      head = head.next;
      tail = head;
      size--;
      if(size == 0){
        head.next = null;
        tail = head = null;
      }
    } else if(position>= size){
      Node temp = head;
      for(int i =0; i<size-1;i++){
        temp = temp.next;
      }
      if(temp==head){
        head.next=null;
        head = tail = null;
        size--;
        return;
      }
      temp.next = head;
      tail = temp;
      size--;
    } else{
      Node temp = head;
      for(int i =0;i<position-1;i++){
        temp = temp.next;
      }
      temp.next = temp.next.next;
      size--;
    }
  }

  //delete entire CLL
  public void deleteCLL(){
    if(head == null){
      System.out.println("Circular Linked List does not exist");
      return;
    } else{
      tail.next = null;
      head = tail = null;
      System.out.println("Cicrular Linked List is deleted");
    }
  }
}
