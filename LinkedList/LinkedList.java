public class LinkedList{
  public Node head;
  public Node tail;
  public int size;

  //Creation of a Single Linked List with mentioned value
  public Node create(int value){
    head = new Node();
    Node node = new Node();
    node.next = null;
    node.value = value;
    head = node;
    tail = node;
    size = 1;
    return head;
  }

  //Insert in Single Linked List
  public void insert(int nodeValue, int location){
    Node node = new Node();
    node.value = nodeValue;
    // case 1: There is no LL
    if(head==null){
      create(nodeValue);
      return;
    } else if(location == 0){
      // case 2: insertion in the start of the Linked List
      node.next = head;
      head = node;
    } else if (location>=size){
      // case 3: insertion in the end of the Linked List
      node.next = null;
      tail.next = node;
      tail = node;
    } else{
      // case 4: insetion in the middle of the Linked List
      Node tempNode = head;
      int i = 0;
      while(i<=location-1){
        tempNode = tempNode.next;
        i++;
      }
      Node nextNode = tempNode.next;
      tempNode.next = node;
      node.next = nextNode;
    }
    size++;
    System.out.println("Node of value "+nodeValue+" inserted at location "+ location+" in the Linked List");
  }

  // Traversal in Linked List
  public void traversal(){
    // case 1: if LL does not exist
    if(head==null){
      System.out.println("Linked List does not exist");
    } else{
      // case 2: if LL has elements
      Node tempNode = head;
      for(int i = 0; i<size; i++){
        System.out.print(tempNode.value);
        if(i != size-1){
          System.out.print(" -> ");
        }
        tempNode=tempNode.next;
      }
    }
    System.out.print("\n");
  }

  // Searching a given value in LL
  public boolean search(int nodeValue){
      if ( head != null){
        Node tempNode = head;
        for(int i = 0; i<size; i++){
          if(tempNode.value == nodeValue){
            System.out.println(nodeValue+" Found at location "+i);
            return true;
            }
          tempNode = tempNode.next;
        }
      }
      System.out.println(nodeValue+ " not Found");
      return false;
  }

  // Delete value at given location
  public void delete(int location){
    if(head == null){
      System.out.println("Linked List does not exist");
    } else if (location == 0){
      head = head.next;
      size--;
      if(size==0){
        tail = null;
      }
    } else if (location >= size){
      Node tempNode = head;
      for(int i = 0; i< size-1; i++){
        // finding second last node
        tempNode = tempNode.next;
      }
        if (tempNode == head){
          tail = null;
          head = null;
          size--;
          return;
        }
        // deleting last node
        tempNode.next = null;
        tail = tempNode;
        size--;
    } else {
      // location is in the middle
      Node tempNode = head;
      for(int i=0; i<location-1;i++){
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
    }
  }

  //Deleting entire linkedlist
  public void deleteFull(){
    head = null;
    tail = null;
    size = 0;
    System.out.println("Entire Linked list deleted");
  }
}