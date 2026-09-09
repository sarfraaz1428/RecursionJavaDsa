
// print the sum of first Natural Number 

public class question3 {

  public static void Printsum(int i, int n, int sum) {

    if (i == n) {

      sum = sum + i;

      // sum += i;

      System.out.println(sum);
      return;

    }
    sum += i;
    Printsum(i + 1, n, sum);

  }

  public static void main(String[] args) {

    Printsum(1, 5, 0);
  }

}
