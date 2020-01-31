/**
 * 
 */
package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Ozi_g
 *
 */
public class Library {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//Test if classes work
		LinkedQueue<Book> linkedQuereUnordered = new LinkedQueue<Book>();
		File bookFile = new File("books.txt");
		Scanner scan = new Scanner(bookFile);
		
		while(scan.hasNextLine())
		{
			
		}
		
		//Test LinkedOrderedQueue
		
		LinkedOrderedQueue<Book> orderedQueue = new LinkedOrderedQueue<Book>();
	}

}
