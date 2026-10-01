
// Move all 'x' to end of String 

public class Question12 {

  public static void MoveallX(String str, int idx, int count, String newString) {

    if (idx == str.length()) {

      for (int i = 0; i < count; i++) {
        newString += 'x';
      }
      System.out.println(newString);
      return;
    }
    char currChar = str.charAt(idx);

    if (currChar == 'x') {

      count++;
      MoveallX(str, idx + 1, count, newString);

    } else {
      newString += currChar; // newString = newString + currChar
      MoveallX(str, idx + 1, count, newString);
    }
  }

  public static void main(String[] args) {

    String str = "axcdxxdxan";
    MoveallX(str, 0, 0, "");

  }

}
