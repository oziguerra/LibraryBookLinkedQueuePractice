/**
 * Name: Oziel Guerra
 * Student Number: T00638044
 * Assignment Number: 03
 * Due Date: February 04, 2020
 * 
 * This program implements a LinkedOrderedQueue and a Book object to 
 * simulate a library that organizes their books based on year, 
 * oldest books being in the beginning of the list. 
 * Test cases:
 * - Remove book at beginning of list
 * - Remove book middle of list
 * - Remove book end of list
 * - Try to remove a book that is not in the list
 *  (using enqueue)
 * - Add book in beginning of list
 * - Add book in middle of list
 * - Add book in end of list
 */
package library;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


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
		//shows all elements added
		System.out.println("Initial ordered queue (Books added in random order): ");
		System.out.println(orderedQueue + "\n");
		
		//Test remove in the beginning, somewhere in the middle, at the end, not found
		System.out.println("Removing books test: ");
		//remove in the middle
		orderedQueue.remove(new Book("Thelittleprince", 1943));
		//remove the first one
		orderedQueue.remove(new Book("LinuxCommandLineandShellScriptingBible", 2017));
		//remove the last one
		orderedQueue.remove(new Book("SecurityinComputing", 2016));
		//Book does not exist
		orderedQueue.remove(new Book("ExampleNonExistent", 0));
		
		//print queue
		System.out.println("\nOrdered queue after removing books:");
		System.out.println("\n" + orderedQueue + "\n");
		
		//Test add in the beginning, somewhere in the middle, at the end
		System.out.println("Adding new books test ");
		//add in beginning
		orderedQueue.enqueue(new Book("BeginningBook", 20));
		//add somewhere in the middle
		orderedQueue.enqueue(new Book("MiddleBook", 2010));
		//add in the end
		orderedQueue.enqueue(new Book("LastBook", 3000));
		
		//Print queue
		System.out.println("Queue after adding new books: ");
		System.out.println(orderedQueue + "\n");
		
		scan.close();
		
	}

}
