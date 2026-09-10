
// Print x^n (stack height = h)

public class Question6 {

  public static int calculatePower(int x, int n) {

    if (n == 0) { // base case 1
      return 1;

    }
    if (x == 0) { // base case 2
      return 0;

    }

    int xpower1 = calculatePower(x, n - 1);
    int xpown = x * xpower1;
    return xpown;

  }

  public static void main(String[] args) {
int x=2 ;
int n=5;
int ans = calculatePower(x, n);
System.out.println(ans);
  }

}
