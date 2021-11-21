class Main {
  public static void main(String[] args) {
    DoublyLinkedList DLL = new DoublyLinkedList();
    
    //create DLL with one node
    DLL.create(1);

    //insert value at 
    DLL.insert(2,1);
    DLL.insert(3,0);
    DLL.insert(4,2);
    DLL.insert(5,6);
    System.out.println();

    //traversal
    DLL.traversal();
    System.out.println();
    DLL.reverse();
    System.out.println();

    //search for given value
    DLL.search(3);
    DLL.search(8);
    System.out.println();

    //delete node at given position
    DLL.delete(0);
    DLL.traversal();
    System.out.println();

    DLL.delete(8);
    DLL.traversal();
    System.out.println();
    
    DLL.delete(1);
    DLL.traversal();
    System.out.println();

    //delete entire DLL
    DLL.deleteDLL();
  }
}
