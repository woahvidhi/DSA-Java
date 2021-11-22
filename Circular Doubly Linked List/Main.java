class Main {
  public static void main(String[] args) {
    CircularDoublyLinkedList CDLL = new CircularDoublyLinkedList();
    //creation of CDLL with one node
    CDLL.create(1);

    //insert values at given postion
    CDLL.insert(2,1);
    CDLL.insert(3,0);
    CDLL.insert(4,7);
    CDLL.insert(5,3);
    System.out.println();

    //traversal
    CDLL.traversal();
    System.out.println();
    CDLL.reverse();
    System.out.println();

    // searching for a given
    CDLL.search(4);
    CDLL.search(0);
    System.out.println();

    // delete node at given position
    CDLL.delete(8);
    CDLL.traversal();
    System.out.println();
    CDLL.delete(2);
    CDLL.traversal();
    System.out.println();
    CDLL.delete(0);
    CDLL.traversal();
    System.out.println();

    // delete entire CDLL
    CDLL.deleteCDLL();
  }
}
