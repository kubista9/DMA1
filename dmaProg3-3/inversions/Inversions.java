package inversions;

import java.io.*;
import java.util.*;

public class Inversions
{
	public int countInversions(ArrayList<Integer> input) {
		int inv_count = 0; // initialize result

		// traverse array elements
		for (int i = 0; i < input.size() - 1; i++)
			for (int j = i + 1; j < input.size(); j++) // count pairs (i, j) such that i appears before j and arr[i] > arr[j]
				if (input.get(i) > input.get(j)) // if i > j, then there is an inversion
					inv_count++; // increment the inversion count
		return inv_count;

		// T(n) = O(n^2)
		// O(n^2)
	}
}

