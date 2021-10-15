class Main {
  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    bst.insert(70);
    bst.insert(50);
    bst.insert(90);
    bst.insert(30);
    bst.insert(60);
    bst.insert(80);
    bst.insert(100);
    bst.insert(20);
    bst.insert(40);
    System.out.println();

    // traversal
    System.out.print("Pre Order Traversal: ");
    bst.preOrder(bst.root);
    System.out.println();
    System.out.print("In Order Traversal: ");
    bst.inOrder(bst.root);
    System.out.println();
    System.out.print("Post Order Traversal: ");
    bst.postOrder(bst.root);
    System.out.println();
    System.out.print("Level Order Traversal: ");
    bst.levelOrder();
    System.out.println();
    System.out.println();

    //searching given value in binary tree
    bst.search(bst.root,100);
    bst.search(bst.root,45);
    System.out.println();
    
    // delete value from binary tree
    bst.levelOrder();
    System.out.println();
    bst.delete(bst.root, 70);
    bst.levelOrder();
    System.out.println();

    // delete entire binary tree
    System.out.println();
    bst.deleteBST();
  }
  
}