class Main {
  public static void main(String[] args) {
    ConvertString cs = new ConvertString();
    System.out.println("Top Down Method: "+cs.TopDown("table", "tbres"));
    System.out.println("Bottom Up Method: "+cs.BottomUp("table", "tbres"));
  }
} 
