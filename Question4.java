
public class Question4 {

  public static int calculatFactorial(int n) {

    if (n == 1 || n == 0) {
      return 1;

    }
    int Factorial_num = calculatFactorial(n - 1);
    int factorial_n = n * Factorial_num;
    return factorial_n;

  }

  public static void main(String[] args) {

    int n = 5;
    int ans = calculatFactorial(n);
    System.out.println(ans);

  }
}