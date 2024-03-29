import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class DuplicateCounter {
	//Hash Map in this one

    Map<String, Integer> wordCounter = new HashMap<String, Integer> ();

    public void count (String dataFile) throws IOException { //add exception
    	
    	
    	//use File Reader to read a FILE
    	//you can use buffered reader to read lines

        BufferedReader reader = new BufferedReader(new FileReader(dataFile)); 
        String lines = reader.readLine(); 

        while(lines != null) { 
            String temp[] = lines.split(" "); 
            
            for(String i: temp) { 
                if(!wordCounter.containsKey(i)) { 
                    wordCounter.put(i,1); 
                } else { 
                    int count = wordCounter.get(i);
                    wordCounter.put(i, count + 1); 
                }
            } lines = reader.readLine(); 
        }
        reader.close();
    }

    public void write (String dataFile) throws FileNotFoundException { //add exception

        PrintWriter writer = new PrintWriter(dataFile); 
        for(HashMap.Entry<String, Integer> entry : wordCounter.entrySet()) { 
            writer.println(entry.getKey() + " : " + entry.getValue()); 

        }
        writer.close(); 
    }

}
