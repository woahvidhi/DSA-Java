import java.util.ArrayList;

public class LinearProbing{
  String[] HashTable;
  int usedCells;

  //constructor
  public LinearProbing(int size){
    HashTable = new String[size];
    usedCells = 0;
  }

  //hashing function
  public int modASCIIHashFunction(String word, int M){
    char ch[] = word.toCharArray();
    int sum=0;
    for(int i=0; i<word.length();i++){
      sum = sum + ch[i];
    }
    return sum % M;
  }

  //load factor
  public double getLoadFactor(){
    double loadFactor = usedCells * 1.0 / HashTable.length;
    return loadFactor;
  }

  // rehashing - when load factor more than 0.75
  public void rehash(String word){
    ArrayList<String> data = new ArrayList<>();
    for(String s : HashTable){
      if(s != null){
        data.add(s);
      }
    }
    data.add(word);
    HashTable = new String[HashTable.length * 2];
    for(String s : data){
      insert(s);
    }
  }

  //insert word into hash HashTable
  public void insert(String word){
    double loadFactor = getLoadFactor();
    if(loadFactor>=0.75){
      rehash(word);
    } else{
      int index = modASCIIHashFunction(word, HashTable.length);
      for(int i = index; i<index+HashTable.length;i++){
        int newIndex = i % HashTable.length;
        if(HashTable[newIndex] == null){
          HashTable[newIndex] = word;
          System.out.println(word+" has been inserted in Hash Table at "+ newIndex);
          break;
        } else{
          System.out.println(newIndex+" is already occupied");
        }
      }
    }
    usedCells++;
  }

  //diplay
  public void display(){
    if(HashTable == null){
      System.out.println("Hash Table does not exist");
      return;
    } else{
      System.out.println(" ------- Hash Table------- ");
      for(int i = 0; i<HashTable.length;i++){
        System.out.println(i+" : "+HashTable[i]);
      }
    }
  }
  //search for give word
  public boolean search(String word){
    int index = modASCIIHashFunction(word, HashTable.length);
    for(int i=index; i<index+HashTable.length; i++){
      int newIndex = i % HashTable.length;
      if(HashTable[newIndex]!= null && HashTable[newIndex].equals(word)){
        System.out.println(word+" found");
        return true;
      }
    }
    System.out.println(word+" not found");
    return false;
  }

  //delete word
  public void delete(String word){
    int index = modASCIIHashFunction(word, HashTable.length);
    for(int i = index; i<index+HashTable.length; i++){
      int newIndex = i % HashTable.length;
      if(HashTable[newIndex] != null && HashTable[newIndex].equals(word)){
        HashTable[newIndex] = null;
        System.out.println(word+" deleted from hash table");
        return;
      }
    }
    System.out.println(word+" not found");
  }
}