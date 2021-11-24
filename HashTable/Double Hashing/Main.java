class Main {
  public static void main(String[] args) {
    DoubleHashing DH = new DoubleHashing(7);
    DH.insert("the");
    DH.insert("quick");
    DH.insert("brown");
    DH.insert("fox");
    DH.insert("jumped");
    DH.insert("over");
    DH.display();
  }
}
