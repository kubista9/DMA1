package ReversePolishNotation;

import java.util.*;

public class ReversePolishCalculator
{
  private final Deque<Integer> stack = new ArrayDeque<>();

  public void push(int n) {
    // TODO Insert your method here
	  stack.push(n);
  }

  public void plus() {
    // TODO Insert your method here
	  int last = stack.pop();
	  int last2 = stack.pop();
	  int sum = last + last2;
	  stack.push(sum);
  }

  public void minus() {
    // TODO Insert your method here
	  int last = stack.pop();
	  int last2 = stack.pop();
	  int sum = last2 - last;
	  stack.push(sum);
  }

  public void times() {
    // TODO Insert your method here
	  int last = stack.pop();
	  int last2 = stack.pop();
	  int sum = last * last2;
	  stack.push(sum);
  }

  public int read() {
    // TODO Insert your method here and update the return statement
	  int f = stack.peek();
    return f;
  }
}
