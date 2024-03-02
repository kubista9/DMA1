package BalancedParenthesisChecking;

import java.util.*;

public class parenthesis
{
  public boolean checkParentheses(ArrayList<Character> input)
  {
    // TODO Insert your method here and update the return statement
	  Deque<Character> deque = new ArrayDeque<>();

	  for (Character i: input) {
		  if ((i.equals('(') || i.equals('['))) {
			  deque.push(i);
			  continue;
		  }

		  char popChar;
		  switch (i){
			  case ')':
				  popChar = deque.pop();
				  if (popChar == '['){
					  return false;
				  }
			  case ']':
				  popChar = deque.pop();
				  if (popChar == '('){
					  return false;
				  }
		  }
	  }

	  return true;
  }
}
