package QueueSimulation;

import java.util.*;

public class QueueSimulation {
  public int simulate(ArrayList<Integer> input) {
    // TODO Insert your method here and update the return statement

	 Deque<Integer> queue = new ArrayDeque<>();
	 for (int i : input){
		 queue.addLast(i);
	 }

	 while(queue.size() != 1){
		 queue.removeFirst();
		 queue.addLast(queue.getFirst());
		 queue.removeFirst();
	 }

	 return queue.getFirst();

  }
}
