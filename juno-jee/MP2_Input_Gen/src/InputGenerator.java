import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class InputGenerator {

	/**
	 * @param args
	 * Description: Generate MP2 input file 
	 * History:
	 * 		20151031: Juvy dela Rosa - Created
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalVotes = 100000;
		int voteIdx = 0;
		//long randSeed = new
		Random randomGenerator = new Random();
		 
		 //define ArrayList to hold Integer objects
	     ArrayList<Integer> numbers = new ArrayList<Integer>();
	     for(int i = 1; i <= 15; i++)
	     {
	    	 numbers.add(i);
	     }
	     
		//generate Input 
		while(voteIdx < totalVotes){
			//generate region
			System.out.print(showRandomInteger(1, 15, randomGenerator) + "\t");
			
			//generate president
			System.out.print(showRandomInteger(1, 5, randomGenerator) + "\t");
			
			//generate vice president
			System.out.print(showRandomInteger(1, 5, randomGenerator) + "\t");
			
			//generate senators 1-12
			Collections.shuffle(numbers);
			for(int senIdx=1; senIdx <= 12; senIdx++){
				System.out.print(numbers.get(senIdx) + "\t");
			}
			
			System.out.println("");
			voteIdx++;
		}//end while
		
		  
	}
	
	 static int showRandomInteger(int aStart, int aEnd, Random aRandom){
	    if (aStart > aEnd) {
	      throw new IllegalArgumentException("Start cannot exceed End.");
	    }
	    //get the range, casting to long to avoid overflow problems
	    long range = (long)aEnd - (long)aStart + 1;
	    // compute a fraction of the range, 0 <= frac < range
	    long fraction = (long)(range * aRandom.nextDouble());
	    int randomNumber =  (int)(fraction + aStart);    
	    return  randomNumber;
	  }

}
