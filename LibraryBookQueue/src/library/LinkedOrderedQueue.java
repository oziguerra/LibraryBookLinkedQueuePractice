/**
 * 
 */
package library;

/**
 * @author Ozi_g
 *
 */
public class LinkedOrderedQueue<T extends Comparable<T>> extends LinkedQueue<T> 
{
	public LinkedOrderedQueue()
	{
		super();
	}
	
	
	/**
	 * Enqueues an element in the order it should be at
	 * @param element T to be added to the queue in the correct position
	 */
	@Override
	public void enqueue(T element)
	{
		//element to be added to the queue
		LinearNode<T> temp = new LinearNode<T>(element);
		//keeps track of where the iterator is, always starts at beginning of queue
		LinearNode<T> current = head;
		//behind of the current iterator
		LinearNode<T> previous = null;
		//Do not need to know if it is a book, this is why we use comparable
		
		//checks where the temp node will go depending on the elements year value
		while(current != null && element.compareTo(current.getElement()) > 0)
		{
			previous = current;
			current = current.getNext();
	
		}
		
		//add temp at beginning
		if(previous == null)
		{
			temp.setNext(head);
			head = temp;
		}
		//adds temp where appropriate
		else
		{
			previous.setNext(temp);
			temp.setNext(current);
		}
		
		
	}
	
	//Removes an element based on the name
	public void remove(T elementToRemove) throws EmptyCollectionException
	{
		LinearNode<T> current = head;
		LinearNode<T> previous = null;
		boolean bookToRemoveFound = false;
		//checks for empty queue
		if(head == null)
		{
			throw new EmptyCollectionException("queue");
		}
		else
		{
			//iterates through the queue to find element to be removed
			while(current != null  && !bookToRemoveFound)
			{
				if(current.getElement().equals(elementToRemove))
				{
					System.out.println(elementToRemove.toString() + " removed");
					if(previous == null)
					{
						head = head.getNext();
					}
					else
					{
						previous.setNext(current.getNext());
					}
					
					bookToRemoveFound = true;
				}
				else
				{
					previous = current;
					current = current.getNext();
				}
				
		
			}
			//Book not in the list
			if(!bookToRemoveFound)
			{
				System.out.println("The book " + elementToRemove.toString() + " was not found");
			}
		}
		
	}
	

}
