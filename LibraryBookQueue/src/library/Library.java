/**
 * 
 */
package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Name: Oziel Guerra
 * Student Number: T00638044
 * Assignment Number: 03
 * Due Date: February 04, 2020
 * 
 * This program implements a LinkedOrderedQueue and a Book object to 
 * simulate a library that organizes their books based on year, 
 * oldest books being in the beginning of the list
 */
public class Library {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {

		Book tempBook;
		LinkedOrderedQueue<Book> orderedQueue = new LinkedOrderedQueue<Book>();
		File bookFile = new File("books.txt");
		Scanner scan = new Scanner(bookFile);
		
		while(scan.hasNextLine())
		{
			tempBook = new Book(scan.next(), scan.nextInt());
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
		
		
		scan.close();
		
	}

}
