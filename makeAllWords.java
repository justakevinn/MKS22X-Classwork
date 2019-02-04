import java.util.ArrayList;

public class makeAllWords{


  public static ArrayList<String> makeAllWords(int k, int maxLetter){
    ArrayList<String> data = new ArrayList<String>();
    makeAllWordsH(data, k, "", maxLetter);
    return data;
  }

  public static void makeAllWordsH(ArrayList<String> data, int k, String s, int maxLetter){
    if (k == 0) data.add(s);
    else{
      for (int i = 97; i < 97 + maxLetter; i++){
        makeAllWordsH(data, k-1, s + (char)i, maxLetter);
      }
    }
  }

  public static void main(String[] args){
    System.out.println(makeAllWords(4,7));
  }


}
