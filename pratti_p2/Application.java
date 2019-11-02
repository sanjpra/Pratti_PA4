import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException { //add exception
        //use of DuplicateCounter by calling both the remove and write methods
        DuplicateCounter duplicateCounter = new DuplicateCounter(); 

        //input file = problem2.txt
        //output file = unique_word_counts.txt
        
        System.out.println("Starting program!"); 
        

        duplicateCounter.count("problem2.txt"); //input file
        duplicateCounter.write("unique_word_counts.txt"); //output file

        System.out.println("Check the output file!"); 
        

    }

}
