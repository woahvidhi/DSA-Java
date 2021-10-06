class Main {
  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(10);
    stack.push(30);
    stack.push(40);
    System.out.println("Peek -> "+stack.peek());System.out.println("Pop -> "+stack.pop());
    System.out.println("Peek -> "+stack.peek());
    System.out.println("Peek -> "+stack.peek());
    stack.delete();
    stack.peek();
  }
}