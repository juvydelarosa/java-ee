import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class SplitAck {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br;
		BufferedWriter wr;
		
		try {
			br = new BufferedReader(new FileReader("C:/Users/IBM_ADMIN/Downloads/GM-InboundFilesfrom11-14-to11-16/nov 15/OMACKORDER_01480041_          _DSP_20161115235035529"));
			wr = new BufferedWriter(new FileWriter("C:/Users/IBM_ADMIN/Downloads/GM-InboundFilesfrom11-14-to11-16/nov 15/gmordack1.txt"));
			
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		    String text = everything.substring(40);
		    
		    List<String> strings = new ArrayList<String>();
		    int index = 0;
		    
		    while (index < text.length()) {
		    	//System.out.println(index);
		    	everything = text.substring(index, Math.min(index + 640,text.length()));
		    	System.out.println(everything);
		        //strings.add(text.substring(index, Math.min(index + 641,text.length())));
		    	if(!everything.isEmpty())
		    		wr.write(everything + "\n");
		        index += 640;
		    }
		    
		    wr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
	    //System.out.println("finished");
	    
	}

}
