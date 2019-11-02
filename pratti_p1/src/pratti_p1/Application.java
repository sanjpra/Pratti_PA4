package pratti_p1;

import java.io.*; 


public class Application {

	public static void main(String[] args) throws IOException{
		DuplicateRemover duplicateRemover = new DuplicateRemover(); 
		
		System.out.println("Starting program"); 
		
		duplicateRemover.remove("problem1.txt");
		
		duplicateRemover.write("unique_words.txt");

		System.out.println("Check the output file!"); 
	}

}
