class Main {
  public static void main(String[] args) {
    //creating empty hashtable
    DirectChaining directChaining = new DirectChaining(5);

    //insert
    directChaining.insert("The");
    directChaining.insert("quick");
    directChaining.insert("brown");
    directChaining.insert("fox");
    directChaining.insert("over");
    System.out.println();

    //display
    directChaining.display();
    System.out.println();

    //search
    directChaining.search("fox");
    directChaining.search("ox");
    System.out.println();

    //delete
    directChaining.delete("over");
    System.out.println();
    directChaining.display();

  }
}