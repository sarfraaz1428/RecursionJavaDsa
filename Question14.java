
// Print all Subsequences of String 
// important 

public class Question14 {

  public static void Subsqeunces(String str, int idx, String newString) {

    if (idx == str.length()) {
      System.out.println(newString);
      return;

    }
    char currChar = str.charAt(idx);

    // The Character will come to not (To be )
    Subsqeunces(str, idx + 1, newString + currChar);

    // will not(not to be )
    Subsqeunces(str, idx + 1, newString);
  }

  public static void main(String[] args) {
    String str = " abc";
    Subsqeunces(str, 0, "");

  }

}
