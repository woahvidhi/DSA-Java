class Main {
  public static void main(String[] args) {
  LinkedList sll = new LinkedList();
  sll.create(10);
  sll.insert(20,1);
  sll.insert(30,2);
  sll.insert(40,3);
  sll.insert(50,4);
  sll.insert(60,5);
  sll.traversal();
  sll.search(90);
  sll.delete(5);
  sll.traversal();
  sll.deleteFull();
  sll.traversal();
  }
}