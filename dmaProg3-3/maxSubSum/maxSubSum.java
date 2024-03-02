package maxSubSum;

import java.util.*;

public class maxSubSum
{
	public int findMaxSubSum(ArrayList<Integer> input)
	{
		// set the initial maximum
		int maxSum = 0, thisSum = 0;

		// loop through the array
		for(int a : input){
			thisSum += a; // add the current element to the sum

			if(thisSum > maxSum) // if the sum is greater than the current maximum, update the maximum
				maxSum = thisSum;
			else if(thisSum < 0) // if the sum is less than 0, reset the sum
				thisSum = 0;
		}

		return maxSum;

		// T(n) = O(n)
		// O(n)
	}
}
