
public class DebuggingExercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker m = new Marker();
		
		for(int i=100; i>=40; i -= 20){
			System.out.print(i);
			m.printGrade(i);
		}

	}

}
