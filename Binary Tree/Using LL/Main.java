class Main {
  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    // insertion into binary tree
    binaryTree.insert("N1");
    binaryTree.insert("N2");
    binaryTree.insert("N3");
    binaryTree.insert("N4");
    binaryTree.insert("N5");
    binaryTree.insert("N6");
    binaryTree.insert("N7");
    binaryTree.insert("N8");
    binaryTree.insert("N9");
    System.out.println();

    // Traversal in binary tree
    System.out.print("Pre Order Traversal: ");
    binaryTree.preOrder(binaryTree.root);
    System.out.println();
    System.out.print("In Order Traversal: ");
    binaryTree.inOrder(binaryTree.root);
    System.out.println();
    System.out.print("Post Order Traversal: ");
    binaryTree.postOrder(binaryTree.root);
    System.out.println();
    System.out.print("Level Order Traversal: ");
    binaryTree.levelOrder();
    System.out.println();
    System.out.println();

    //searching in binary tree
    binaryTree.search("N4");
    binaryTree.search("N10");
    System.out.println();
    binaryTree.levelOrder();
    System.out.println();

    // deleting a particular node from the binary tree
    binaryTree.delete("N3");
    binaryTree.levelOrder();
    System.out.println();
    binaryTree.delete("N11");
    System.out.println();

    //deleting the entire tree
    binaryTree.deleteEntireTree();
  }
}