package dodgeBall;

import java.util.TreeSet;

public class dodgeBall {
	TreeSet<Integer> players = new TreeSet<>();
	// Add any private fields you might need here
  public void addPlayer(int x) {
    // Implement your code here to add a player to the line
	  players.add(x);
  }

  public int throwBall(int x) {
    int distance = x;

	  // Implement your code here to update the line of players and return the distance

	  if (players.contains(x)){
		  players.remove(x);
		  return 0;
	  }

	  else if (players.floor(x) == null){
		  distance = Math.abs(players.ceiling(x) - x);
		  players.remove(players.ceiling(x));
		  players.add(x);
		  return distance;
	  }

	  else if (players.ceiling(x) == null ){
		  distance = Math.abs(players.floor(x) - x);
		  players.remove(players.floor(x));
		  players.add(x);
		  return distance;
	  }

	  else if (Math.abs(players.floor(x) - x) > Math.abs(players.ceiling(x) - x)){
		  distance = Math.abs(players.ceiling(x) - x);
		  players.remove(players.ceiling(x));
		  players.add(x);
		  return distance;
	  }

	  else if (Math.abs(players.floor(x) - x) <= Math.abs(players.ceiling(x) - x)){
		  distance = Math.abs(players.floor(x) - x);
		  players.remove(players.floor(x));
		  players.add(x);
		  return distance;
	  }

    return distance;
  }
}
