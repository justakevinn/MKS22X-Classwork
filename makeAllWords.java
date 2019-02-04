import java.util.ArrayList;

public class makeAllWords{


  public static ArrayList<String> makeAllWords(int k){
    ArrayList<String> data = new ArrayList<String>();
    makeAllWordsH(data, k, "");
    return data;
  }

  public static void makeAllWordsH(ArrayList<String> data, int k, String s){
    if (k == 0) data.add(s);
    else{
      makeAllWordsH(data, k-1, s + "a");
      makeAllWordsH(data, k-1, s + "b");
      makeAllWordsH(data, k-1, s + "c");
      }
  }

  public static void main(String[] args){
    System.out.println(makeAllWords(2));
  }


}
