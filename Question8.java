
// Qs : Tower of Honai 

// Rules :
// 1.Move only one disk at a time.
//2. You can only move the top disk.
//3. A larger disk cannot be placed on a smaller disk.

public class Question8 {

  public static void TowerHanoi(int n, String Source, String helper, String Destination) {

    if (n == 1) {
      System.out.println("Transferr disk" + n + "form " + Source + " to " + Destination);
      return;
    }

    TowerHanoi(n - 1, Source, Destination, helper);

    System.out.println("Transferr disk" + n + "form " + Source + " to " + Destination);
    TowerHanoi(n - 1, helper, Source, Destination);
  }

  public static void main(String[] args) {
    int n = 2;
    TowerHanoi(n, "S", "H", "D");

  }
}
