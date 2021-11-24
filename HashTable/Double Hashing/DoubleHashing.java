import java.util.ArrayList;

public class DoubleHashing{
  int usedCells;
  String[] hashTable;

  //create empty hashTable
  //constructor
  public DoubleHashing(int size){
    hashTable = new String[size];
    usedCells = 0;
  }

  //hash function 1
  public int modASCIIHashFuction(String word, int M){
    char ch[];
    ch = word.toCharArray();
    int sum,i;
    for(sum=0,i=0; i<word.length(); i++){
      sum += ch[i];
    }
    return sum % M;
  }

  //helper function for second hash function
  private int addDigits(int sum){
    int value = 0;
    while(sum>0){
      value = sum % 10;
      sum /= 10;
    }
    return value;
  }

  //hash function 2
  public int secondHashFunction(String word, int M){
    char ch[];
    ch = word.toCharArray();
    int sum,i;
    for(sum=0, i=0; i<word.length(); i++){
      sum += ch[i];
    }
    while(sum>hashTable.length){
      sum = addDigits(sum);
    }
    return sum % M;
  }

  //to get load factor
  public double getLoadFactor(){
    return usedCells * 1.0 / hashTable.length;
  }
  
  //rehashing
  public void rehashing(String word){
    usedCells = 0;
    ArrayList<String> data = new ArrayList<>();
    for(int i=0; i<hashTable.length; i++){
      if(hashTable[i] != null){
        data.add(hashTable[i]);
      }
    }
    data.add(word);
    for(String s:data){
      insert(s);
    }
  }

  // insert value into hash hash table 
  public void insert(String word){
    double loadFactor = getLoadFactor();
    if(loadFactor>=0.75){
      rehashing(word);
    } else{
      int x = modASCIIHashFuction(word,hashTable.length);
      int y = secondHashFunction(word,hashTable.length);
      for(int i=0; i<hashTable.length; i++){
        int newIndex = (x+i*y) % hashTable.length;
        if(hashTable[newIndex] == null){
          hashTable[newIndex] = word;
          System.out.println(word+" inserted at "+newIndex);
          break;
        } else{
          System.out.println(newIndex+" already occupied");
        }
      }
    }
    usedCells++;
  }

  //display content of hashTable
  public void display(){
    if(hashTable == null){
      System.out.println("Hash Table does not exist");
      return;
    }
    System.out.println("---------- Hash Table ----------");
    for(int i=0; i<hashTable.length; i++){
      System.out.println(i+" : "+hashTable[i]);
    }
  }
}
