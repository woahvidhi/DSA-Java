class Main {
  public static void main(String[] args) {
    Queue queue = new Queue(5);
    queue.insert(10);
    queue.insert(20);
    queue.insert(30);
    System.out.println("Remove ->"+queue.remove());
    System.out.println("Peek ->"+queue.peek());
    System.out.println("Remove ->"+queue.remove());
    System.out.println("Peek ->"+queue.peek());
    queue.delete();
    queue.peek();
  }
}