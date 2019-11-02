package pratti_p1;
import java.io.*; 
import java.util.*; 

public class DuplicateRemover {

	ArrayList<String> uniqueWords = new ArrayList<String>(); 
	
	
	public void remove(String dataFile) throws IOException { //add exception!
		
		//use File Reader to read a FILE
		//you can use buffered reader to read lines
		

		BufferedReader reader = new BufferedReader(new FileReader(dataFile)); 
		
		String lines = reader.readLine(); 
		
		while(lines != null) { 
			String tempArray[] = lines.split(" "); 
			
			for(String i : tempArray) {
				if(!uniqueWords.contains(i)) { 
					uniqueWords.add(i); 
				}
	
			}
			lines = reader.readLine(); 
		}
		
		reader.close(); //terminate this method operations
		
	}
	
	
	public void write(String dataFile) throws FileNotFoundException { //add exception!!
		// use print writer or buffered input?
		
		
		PrintWriter writer = new PrintWriter(dataFile); 
		
		for(String i: uniqueWords) { 
			writer.println(i); 
			
		}
		writer.close(); //terminate this method operations
		
	}
}
