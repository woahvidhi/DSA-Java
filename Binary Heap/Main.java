class Main {
  public static void main(String[] args) {
    //min binary heap
    BinaryHeap min = new BinaryHeap(10);
    min.insert(10, "Min");
    min.insert(5, "Min");
    min.insert(15, "Min");
    min.insert(1, "Min");
    min.traversal();
    System.out.println("Head: "+min.extractHead("Min"));
    min.traversal();
    min.deleteBH();
    System.out.println();

    //max binary heap
    BinaryHeap max = new BinaryHeap(10);
    max.insert(10, "Max");
    max.insert(15, "Max");
    max.insert(5, "Max");
    max.insert(20, "Max");
    max.traversal();
    System.out.println("Head: "+max.extractHead("Max"));
    max.traversal();
  }
}
