class Main {
  public static void main(String[] args) {
    Queue queue = new Queue();
    queue.insert(10);
    queue.insert(30);
    queue.insert(50);
    System.out.println("Peek -> "+queue.peek());System.out.println("Pop -> "+queue.remove());
    System.out.println("Peek -> "+queue.peek());
    System.out.println("Peek -> "+queue.peek());
    queue.delete();
    queue.peek();
  }
}