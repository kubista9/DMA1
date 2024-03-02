package findClosest;

import java.util.*;

public class closest
{

	public int findClosest(ArrayList<Integer> input)
	{
		// sort the array
		Collections.sort(input);  // ← (n log(n))

		// set the initial minimum
		int smallestInteger = Integer.MAX_VALUE;

		// loop through the array
		for (int i = 1; i < input.size(); i++){
			int difference = input.get(i) - input.get(i - 1); // get the difference between the current and previous element
			if (difference < smallestInteger){ // if the difference is less than the current minimum, update the minimum
				smallestInteger = difference;
			}
		}
		return smallestInteger;

		//T(n) = O(n log(n)) + O(n) = O(n log(n))
		//O(n log(n))
	}
}
