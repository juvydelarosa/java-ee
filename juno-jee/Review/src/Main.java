
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//------------for String
		String str1 = new String();
		str1 = "Raniel";
		
		String str2 = new String("Juvy");
		System.out.println(str1.length() + " " + str2.length());
		

		
		
		//------------for StringClass
		StringClass str3 = new StringClass();
		str3.str = "Raniel2";
		
		StringClass str4 = new StringClass("Juvy2");
		
		System.out.println(str3.classLength() + " " + str4.classLength());
		
		
	}

}
