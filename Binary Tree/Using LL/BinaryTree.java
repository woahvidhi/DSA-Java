import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree{
  BinaryNode root;

  //constructor
  //creating empty Binary Tree
  public BinaryTree(){
    this.root = null;
  }

  //insert new node into Binary Tree
  public void insert(String value){
    BinaryNode newNode = new BinaryNode();
    newNode.value = value;
    if(root == null){
      root = newNode;
      System.out.println(value+" inserted at root");
      return;
    }
    // creating queue to add all node of the binary tree
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root); //enqueue
    while(!queue.isEmpty()){
      BinaryNode presentNode = queue.remove();//dequeue
      if(presentNode.left == null){
        // adding left node
        presentNode.left = newNode;
        System.out.println(value+" inserted");
        break;
      } else if(presentNode.right==null) {
        //adding right node
        presentNode.right = newNode;
        System.out.println(value+" inserted");
        break;
      } else{
        // if both left and right child are there then add both to the queue
        queue.add(presentNode.left);
        queue.add(presentNode.right);
      }
    }
  }

  // preorder traversal - depth first search
  // root node -> left node -> right node
   void preOrder(BinaryNode node) {
    if (node == null) {
      // exit condition
      return;
    }
    System.out.print(node.value + " "); // root
    preOrder(node.left); // left
    preOrder(node.right); // right
  }

  //inorder traversal - depth first search
  //left -> root -> right
  void inOrder(BinaryNode node){
    if(node == null){
      return; // exit condition
    }
    inOrder(node.left); // left
    System.out.print(node.value + " "); // root
    inOrder(node.right); // right
  }

  //post order traversal - depth first search
  //left -> right -> root
  void postOrder(BinaryNode node){
    if(node == null){
      return; // exit condition
    }
    postOrder(node.left); // left
    postOrder(node.right); // right
    System.out.print(node.value + " "); // root
  }

  //level order traversal - breadth first search
  void levelOrder(){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root); // enqueue root node
    while(!queue.isEmpty()){
      BinaryNode presentNode = queue.remove(); // dequeue
      System.out.print(presentNode.value+" ");
      if(presentNode.left != null){
        queue.add(presentNode.left);//enqueue left node
      }
      if(presentNode.right != null){
        queue.add(presentNode.right);//enqueue right node
      }
    }
  }

  //searching - level order traversal is used 
  public void search(String value){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while(!queue.isEmpty()){
      BinaryNode presentNode = queue.remove();
      if(presentNode.value == value){
        System.out.println(value+" found");
        return;
      } else{
        if(presentNode.left != null){
          queue.add(presentNode.left);
        }
        if(presentNode.right != null){
          queue.add(presentNode.right);
        }
      }
    }
    System.out.println(value+" not found");
  }

  //finding the deepest node
  public BinaryNode getDeepestNode(){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode presentNode = null;
    while(!queue.isEmpty()){
      presentNode = queue.remove();
      if(presentNode.left != null){
        queue.add(presentNode.left);
      }
      if(presentNode.right != null){
        queue.add(presentNode.right);
      }
    }
    return presentNode;
  }

  // deleting the deepest node
  public void deleteDeepestNode(){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode previousNode, presentNode = null;
    while(!queue.isEmpty()){
      previousNode = presentNode;
      presentNode = queue.remove();
      if(presentNode.left == null){
        // node has no child hence previous right node is last node and hence 
        previousNode.right = null;
        return;
      } else if(presentNode.right == null){
        // left child the deepest node
        presentNode.left = null;
        return;
      }
      queue.add(presentNode.left);
      queue.add(presentNode.right);
    }
  }

  // delete given node
  // given node is deleted and the deepest node goes to its place
  public void delete(String value){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode presentNode = null;
    while(!queue.isEmpty()){
      presentNode = queue.remove();
      if(presentNode.value == value){
        presentNode.value = getDeepestNode().value;
        deleteDeepestNode();
        System.out.println(value +" deleted from the binary tree");
        return;
      } else{
        if(presentNode.left != null){
          queue.add(presentNode.left);
        }
        if(presentNode.right != null){
          queue.add(presentNode.right);
        }
      }
    }
    System.out.println(value + " not found in the binary tree");
  }

  //delete entire tree
  public void deleteEntireTree(){
    root = null;
    System.out.println("Entire Binary Tree deleted");
  }
}
