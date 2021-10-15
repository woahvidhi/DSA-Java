import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree{
  BinaryNode root;

  // construtor
  // creating empty binary tree
  BinarySearchTree(){
    root = null;
  }

  private BinaryNode insert(BinaryNode currentNode, int value){
    if(currentNode == null){
      BinaryNode newNode = new BinaryNode();
      newNode.value = value;
      System.out.println(value+" value inserted");
      return newNode;
      } else if(value<=currentNode.value){
        currentNode.left = insert(currentNode.left, value);
        return currentNode;
      } else{
        currentNode.right = insert(currentNode.right, value);
        return currentNode;
      }
  }

  void insert(int value){
    root = insert(root,value);
  }

  //preorder traversal
  //root -> left -> right
  public void preOrder(BinaryNode node){
    if(node == null){
      return;
    }
    System.out.print(node.value+" ");
    preOrder(node.left);
    preOrder(node.right);
  }

  //inorder traversal
  // left -> root -> right
  public void inOrder(BinaryNode node){
    if(node == null){
      return;
    }
    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);
  }
  // Post Order traversal
  // left -> right -> root
  public void postOrder(BinaryNode node){
    if(node == null){
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value+" ");
  }

  // level order traversal
  public void levelOrder(){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while(!queue.isEmpty()){
      BinaryNode currentNode = queue.remove();
      System.out.print(currentNode.value+" ");
      if(currentNode.left != null){
        queue.add(currentNode.left);
      }
      if(currentNode.right!=null){
        queue.add(currentNode.right);
      }
    }
  }

  //search function using recursion
  public BinaryNode search(BinaryNode node, int value){
    if(node == null){
      System.out.println(value +" not found");
      return null;
    } else if(node.value == value){
      System.out.println(value +" found");
      return node;
    } else if(value>node.value){
      //search in right
      return search(node.right, value);
    } else{
      //search in left
      return search(node.left, value);
    }
  }

  // delete value from binary tree
  // finding the min node
  public BinaryNode minNode(BinaryNode node){
    if(node.left == null){
      return node;
    } else{
      return minNode(node.left);
    }
  }

  //deleting node 
  public BinaryNode delete(BinaryNode node, int value){
    if(node == null){
      System.out.println(value+" not found");
      return null;
    }
    if(value<node.value){
      // go to the left children
      node.left = delete(node.left, value);
    } else if(value>node.value){
      // go to the right children
      node.right = delete(node.right,value);
    } else{
      if(node.left != null && node.right != null){
        BinaryNode temp = node;
        BinaryNode minNodeRight = minNode(temp.right);
        node.value = minNodeRight.value;
        node.right = delete(node.right,minNodeRight.value);
      } else if(node.left != null){
        node = node.left;
      } else if(node.right != null){
        node = node.right;
      } else{
        node = null;
      }
    }
    return node;
  }

  // deleting the entire tree
  public void deleteBST(){
    root = null;
    System.out.println("The entire binary search tree has been deleted");
  }
}