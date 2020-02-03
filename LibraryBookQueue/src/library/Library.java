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
		
		File bookFile = new File("books.txt");
		Book tempBook;
		//Test LinkedOrderedQueue
		
		LinkedOrderedQueue<Book> orderedQueue = new LinkedOrderedQueue<Book>();
		File bookFileOrdered = new File("books.txt");
		Scanner scanOrdered = new Scanner(bookFile);
		
		while(scanOrdered.hasNextLine())
		{
			tempBook = new Book(scanOrdered.next(), scanOrdered.nextInt());
			orderedQueue.enqueue(tempBook);
		}
		
		System.out.println(orderedQueue);
		
		//Test remove in the beginning, somewhere in the middle, at the end, not found
		orderedQueue.remove(new Book("Thelittleprince", 0));
		orderedQueue.remove(new Book("TheMythicalMan-Month", 0));
		orderedQueue.remove(new Book("SecurityinComputing", 0));
		orderedQueue.remove(new Book("ExampleNonExistent", 0));
		
		System.out.println(orderedQueue);
		
		//Test add in the beginning, somewhere in the middle, at the end
		
		
		scanOrdered.close();
		
	}

}
