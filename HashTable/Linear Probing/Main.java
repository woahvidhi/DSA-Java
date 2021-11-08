class Main {
  public static void main(String[] args) {
    //creating empty hash table
    LinearProbing lp = new LinearProbing(7);

    //inserting into hash table
    lp.insert("The");
    lp.insert("quick");
    lp.insert("brown");
    lp.insert("fox");
    System.out.println();

    //display whole hash table
    lp.display();

    //search for given word
    lp.search("fox");
    lp.search("white");
    System.out.println();

    //delete the give word
    lp.delete("quick");
    lp.display();
  }
}
