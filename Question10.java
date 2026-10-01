
// Qs Fint the 1st and lasr occurance of an element in String 

public class Question10 {

  public static int First = -1;
  public static int Last = -1;

  public static void FindOccurance(String str, int idx, char element) {

    if (idx == str.length()) {
      System.out.println(First);
      System.out.println(Last);
      return;
    }

    char currchar = str.charAt(idx);

    if (currchar == element) {
      if (First == -1) {
        First = idx;

      } else {
        Last = idx;
      }
    }
    FindOccurance(str, idx + 1, element);
  }

  public static void main(String[] args) {

    String str = "abaacdaefaah";
    FindOccurance(str, 0, 'a');

  }

}
