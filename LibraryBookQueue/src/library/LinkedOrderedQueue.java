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
		LinearNode<T> temp = new LinearNode<T>(element);
		LinearNode<T> current = head;
		LinearNode<T> previous = null;
		//Do not need to know if it is a book, this is why we use comparable
		
		while(current != null && element.compareTo(current.getElement()) > 0)
		{
			previous = current;
			current = current.getNext();
	
		}
		
		//add at beginning
		if(previous == null)
		{
			temp.setNext(head);
			head = temp;
		}
		else
		{
			previous.setNext(temp);
			temp.setNext(current);
		}
		
		
	}
	
	public void remove(T elementToRemove)
	{
		LinearNode<T> current = head;
		LinearNode<T> previous = null;
		boolean bookToRemoveFound = false;
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
		
		if(!bookToRemoveFound)
		{
			System.out.println("The book " + elementToRemove.toString() + " was not found");
		}
	}
	

}
