import java.util.ArrayList;
import java.util.LinkedList;

public class DirectChaining{
  LinkedList<String>[] hashTable;
  
  // constructor
  // creates empty hash table
  DirectChaining(int size){
    hashTable = new LinkedList[size];
  }

  //hash function -> modASCII
  public int modASCIIHashFunction(String word, int M){
    char ch[];
    ch = word.toCharArray(); // converts word into array of characters
    int i,sum;
    for(i=0, sum=0; i<word.length();i++){
      sum = sum + ch[i];
    }
    return sum % M;
  }

  //inserting word into hash table
  public void insert(String word){
    int newIndex = modASCIIHashFunction(word,hashTable.length);
    if(hashTable[newIndex]==null){
      //if there is no word at index then create new LinkedList
      hashTable[newIndex] = new LinkedList<String>();
      hashTable[newIndex].add(word);
    } else{
      // if other words exist then append
      hashTable[newIndex].add(word);
    }
    System.out.println(word+" inserted into Hash Table at "+newIndex);
  }

  //displaying values in the hashTable
  public void display(){
    if(hashTable==null){
      System.out.println("Hash Table is empty");
    } else{
      System.out.println("------- Hash Table --------");
      for(int i=0; i<hashTable.length;i++){
        System.out.println("Index -> "+i+" Key -> "+hashTable[i]);
      }
    }
   }
  // searching for given word in the hashTable
  public boolean search(String word){
    int newIndex = modASCIIHashFunction(word,hashTable.length);
    if(hashTable[newIndex]!=null && hashTable[newIndex].contains(word)){
      System.out.println(word+" found at index "+newIndex);
      return true;
    } else{
      System.out.println(word+" not found in Hash Table ");
      return false;
    }
  }

  //deleting a given word
  public void delete(String word){
    int newIndex = modASCIIHashFunction(word, hashTable.length);
    if(search(word)){
      hashTable[newIndex].remove(word);
      System.out.println(word+" at index "+ newIndex+" deleted");
    }
  }
}