package findClosest;

import java.util.*;

public class closest
{

  public int findClosest(ArrayList<Integer> input)
  {
    // TODO implement method

	  Collections.sort(input);   // ← (n log(n))

	  int smallestInteger = Integer.MAX_VALUE;

	  for (int i = 1; i < input.size(); i++){
		  int difference = input.get(i) - input.get(i - 1);
		  if (difference < smallestInteger){
			  smallestInteger = difference;
		  }
	  }
	  return smallestInteger;
  }

}
