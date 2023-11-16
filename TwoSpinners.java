public class TwoSpinners{
 	/** Precondition: min < max
  	*/
 	/*The spin method simulates a spin of a fair spinner.
  	* The method returns a random integer between min and max,
  	* inclusive. Complete the spin method below by assigning
  	* this random integer to result.
  	*/
    int i = 0;
 	public int spin(int min, int max)
 	{
     	    int result=0;
     	    result = (int) (Math.random()*(max-min))+min;
    	    return result;
 	}

 	/** Simulates one round of the game as described in part (b).
  	*/
 	public void playRound()
 	{
        int player = spin(1,10);
        int computer = spin(1,10);

        if(player > computer){
            System.out.println("Player Won: " + (player - computer) + " points \n");
        } else if(player < computer){
            System.out.println("Computer Won: " + (player - computer) + " points \n ");
        } else if (player == computer){
            if(i < 2){
                i++;
                playRound();
            } else {
                System.out.println("Draw");
            } 

        } 	
	}

 	public static void main(String[] args) {
     	  TwoSpinners ds = new TwoSpinners();
     	      for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
         		ds.playRound();
     	      }
 	  }

 }

