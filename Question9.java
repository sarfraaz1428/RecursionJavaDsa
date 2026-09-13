
// Print the String Reverse

public class Question9 {

  public static void Printreverse(String str, int idx) {
    if (idx == 0) {
      System.out.println(str.charAt(idx));
      return ;

    }
    System.out.println(str.charAt(idx));
    Printreverse(str, idx - 1);
  }

  public static void main(String[] args) {

    String str = "abcd";
    Printreverse(str, str.length()-1);

  }

}


/*
This Funtions wihtout recursion
public class Question9 {

  public static void main(String[] args) {

    String str = "abcd";

    for(int i = str.length() - 1; i >= 0; i--) {
      System.out.println(str.charAt(i));
    }

  }
}


*/
