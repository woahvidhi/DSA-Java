import java.util.ArrayList;

public class QuadraticProbing{
  String[] hashTable;
  int usedCells;

  //constructor
  //creation of empty hash table
  public QuadraticProbing(int size){
    hashTable = new String[size];
    usedCells = 0;
  }

  //to get hash value for given word
  public int modACSIIHashFunction(String x, int M){
    char ch[];
    ch = x.toCharArray();
    int sum,i;
    for(i=0, sum=0; i<x.length();i++){
      sum += ch[i];
    }
    return sum % M;
  }

  //paramter to check if rehasing is required
  public double getLoadFactor(){
    return usedCells * 1.0 / hashTable.length;
  }

  // if hash table is almost full then rehashing occurs
  public void rehashing(String newString){
    usedCells = 0;
    ArrayList<String> data = new ArrayList<>();
    for(String s:hashTable){
      if(s != null){
        data.add(s);
      }
    }
    data.add(newString);
    hashTable = new String[hashTable.length *2];
    for(String d:data){
      insert(d);
    }
  }

  //inserting of word into hashtable
  public void insert(String word){
    double loadFactor = getLoadFactor();
    if(loadFactor>=0.75){
      rehashing(word);
    } else{
      int index = modACSIIHashFunction(word, hashTable.length);
      int counter = 0;
      for(int i=index; i<index+hashTable.length;i++){
        int newIndex = (index+(counter + counter))%hashTable.length;
        if(hashTable[newIndex] == null){
          hashTable[newIndex] = word;
          System.out.println(word+" inserted at "+newIndex);
          break;
        } else{
          System.out.println(newIndex+ " occupied");
        }
        counter++;
      }
    }
    usedCells++;
  }

  //to view all the contents of the hash table
  public void display(){
    if(hashTable == null){
      System.out.println("Hash Table does not exist");
    } else{
      System.out.println("-------- Hash Table --------");
      for(int i=0;i<hashTable.length;i++){
        System.out.println(i+" : "+hashTable[i]);
      }
    }
  }
}
