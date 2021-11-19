class Main {
  public static void main(String[] args) {
    CircularLL CLL = new CircularLL();

    //creating single node in CLL
    CLL.create(1);

    //insertion of nodes in CLL
    CLL.insert(2, 0);
    CLL.insert(3, 4);
    CLL.insert(4, 2);
    CLL.insert(5, 1);
    System.out.println();

    //traversal in CLL
    CLL.traversal();
    System.out.println();

    //searching value
    CLL.search(1);
    CLL.search(0);
    System.out.println();

    //delete value;
    CLL.delete(5);
    CLL.traversal();
    System.out.println();
    CLL.delete(1);
    CLL.traversal();
    System.out.println();
    CLL.delete(0);
    CLL.traversal();
    System.out.println();

    //delete entire CLL
    CLL.deleteCLL();
  }
}
