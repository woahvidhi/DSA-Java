class Main {
  public static void main(String[] args) {
    //creation of empty binary tree
    BinaryTree bt = new BinaryTree(10);

    //inserting elements into binary tree
    bt.insert("N1");
    bt.insert("N2");
    bt.insert("N3");
    bt.insert("N4");
    bt.insert("N5");
    bt.insert("N6");
    bt.insert("N7");
    bt.insert("N8");
    bt.insert("N9");
    System.out.println();

    //traversal
    System.out.print("Pre Order: ");
    bt.preOrder(1);
    System.out.println();

    System.out.print("In Order: ");
    bt.inOrder(1);
    System.out.println();

    System.out.print("Post Order: ");
    bt.postOrder(1);
    System.out.println();

    System.out.print("Level Order: ");
    bt.levelOrder();
    System.out.println();

    //search for element
    System.out.println();
    bt.search("N9");
    bt.search("N10");
    System.out.println();

    //delete element
    bt.delete("N3");
    bt.levelOrder();
    System.out.println();

    //delete entire tree
    System.out.println();
    bt.deleteBT();
  }
}