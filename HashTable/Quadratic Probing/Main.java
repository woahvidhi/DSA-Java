class Main {
  public static void main(String[] args) {
    QuadraticProbing QP = new QuadraticProbing(9);
    QP.insert("the");
    QP.insert("quick");
    QP.insert("brown");
    QP.insert("fox");
    QP.insert("jumped");
    QP.insert("over");
    QP.display();
  }
}
