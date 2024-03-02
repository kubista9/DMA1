package closestBall;
import java.util.*;

public class testComputeClosest
{
  public static void testAll() {
    clearTerminal();
    testSinglePair();
    testSinglePairInv();
    test1();
    test2();
    test3();
    test4();
    testQuadraticTime();
  }

  public static void testSinglePair() {
    int[][] input = { { 3 }, { 5 } };
    int correctAnswer = 2;

    ArrayList<Integer> players = new ArrayList<Integer>();
    ArrayList<Integer> balls = new ArrayList<Integer>();
    for (int i : input[0]) players.add(i);
    for (int i : input[1]) balls.add(i);

    int output = new closestBall().computeClosest(players, balls);

    if (output != correctAnswer)
      outputFail("testSinglePair",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("testSinglePair");
  }

  public static void testSinglePairInv() {
    int[][] input = { { 7 }, { 4 } };
    int correctAnswer = 3;

    ArrayList<Integer> players = new ArrayList<Integer>();
    ArrayList<Integer> balls = new ArrayList<Integer>();
    for (int i : input[0]) players.add(i);
    for (int i : input[1]) balls.add(i);

    int output = new closestBall().computeClosest(players, balls);

    if (output != correctAnswer)
      outputFail("testSinglePairInv",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("testSinglePairInv");
  }

  public static void test1() {
    int[][] input = {
        { 95, 66, 82, 63, 78, 37, 100, 96, 98, 17, 13, 7, 28, 74, 73, 78, 41, 25, 53, 93 },
        { 275, 938, 8, 77, 649, 803, 500, 823, 519, 711, 422, 227, 235, 655, 373 }
    };
    int correctAnswer = 8 - 7;

    ArrayList<Integer> players = new ArrayList<Integer>();
    ArrayList<Integer> balls = new ArrayList<Integer>();
    for (int i : input[0]) players.add(i);
    for (int i : input[1]) balls.add(i);

    int output = new closestBall().computeClosest(players, balls);

    if (output != correctAnswer)
      outputFail("test1",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("test1");
  }

  public static void test2() {
    int[][] input = {
        { 750, 927, 16, 324, 667, 196, 693, 551, 561, 100 },
        { 30, 27, 2, 96, 82, 41, 24, 55, 19, 33, 52, 61, 58, 23, 27, 34, 76, 39, 28, 96 }
    };
    int correctAnswer = 19 - 16;

    ArrayList<Integer> players = new ArrayList<Integer>();
    ArrayList<Integer> balls = new ArrayList<Integer>();
    for (int i : input[0]) players.add(i);
    for (int i : input[1]) balls.add(i);

    int output = new closestBall().computeClosest(players, balls);

    if (output != correctAnswer)
      outputFail("test2",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("test2");
  }

  public static void test3() {
    int[][] input = {
        { 95, 66, 82, 63, 17 },
        { 75, 38, 25, 77 }
    };
    int correctAnswer = 82 - 77;

    ArrayList<Integer> players = new ArrayList<Integer>();
    ArrayList<Integer> balls = new ArrayList<Integer>();
    for (int i : input[0]) players.add(i);
    for (int i : input[1]) balls.add(i);

    int output = new closestBall().computeClosest(players, balls);

    if (output != correctAnswer)
      outputFail("test3",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("test3");
  }

  public static void test4() {
    int[][] input = {
        { 1, 2 },
        { 2, 3 }
    };
    int correctAnswer = 0;

    ArrayList<Integer> players = new ArrayList<Integer>();
    ArrayList<Integer> balls = new ArrayList<Integer>();
    for (int i : input[0]) players.add(i);
    for (int i : input[1]) balls.add(i);

    int output = new closestBall().computeClosest(players, balls);

    if (output != correctAnswer)
      outputFail("test4",
          "Expected output " + correctAnswer +
              " but got " + output);
    else
      outputPass("test4");
  }

  public static void testQuadraticTime() {
    int n1 = 1000;
    int n2 = 10000;
    long t11 = timeTest(n1);
    long t12 = timeTest(n1);
    long t13 = timeTest(n1);
    long t14 = timeTest(n1);
    long t15 = timeTest(n1);
    long t1 = Math.min(Math.min(Math.min(Math.min(t11, t12), t13), t14), t15);
    System.out.println("");
    System.out.println("Testing time complexity.");
    long t21 = timeTest(n2);
    long t22 = timeTest(n2);
    long t23 = timeTest(n2);
    long t2 = Math.min(Math.min(t21, t22), t23);
    double slowdown = ((double) t2) / t1;
    double linearSlowdown = ((double) n2) / n1;
    if (slowdown > Math.pow(linearSlowdown, 1.2))
      System.out.println("That's not log-linear time! Assuming all tests are ok, you get 1 point. Or try again for another point");
    else
      System.out.println("Yes! That is log-linear time. Assuming all tests are ok, you get 2 points.");
  }

  private static long timeTest(int n) {
    long t1 = System.nanoTime();
    ArrayList<Integer> players = new ArrayList<Integer>(n);
    ArrayList<Integer> balls = new ArrayList<Integer>(n);
    for (int i = 0; i < n; ++i) {
      players.add((int) (i * 982451653L % 413158511L));
      balls.add((int) (i * 413158511L % 982451653L));
    }
    new closestBall().computeClosest(players, balls);
    long t2 = System.nanoTime();
    // For debugging, output the individual times:
    // System.out.println(n + " " + (t2 - t1));
    return t2 - t1;
  }

  private static void clearTerminal() {
    System.out.print('\u000C');
  }

  private static void outputPass(String testName) {
    System.out.println("[Pass " + testName + "]");
  }

  private static void outputFail(String testName, String message) {
    System.out.println("[FAIL " + testName + "] " + message);
  }

  public static void main(String[] args) {
    testAll();
    /*Scanner sc = new Scanner(System.in);
    int testcases = sc.nextInt();
    for (int t = 0; t < testcases; ++t) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      ArrayList<Integer> players = new ArrayList<Integer>();
      ArrayList<Integer> balls = new ArrayList<Integer>();
      for (int i = 0; i < n; ++i) players.add(sc.nextInt());
      for (int i = 0; i < m; ++i) balls.add(sc.nextInt());
      System.out.println(new closestBall().computeClosest(players, balls));
    }*/
  }
}
