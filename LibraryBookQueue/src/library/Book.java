package library;

public class Book implements Comparable<Book>{

	private String bookTitle;
	private int publicationYear;
	
	public Book()
	{
		this(0, "Empty book");
	}
	
	public Book(int pYear, String bTitle) 
	{
		publicationYear = pYear;
		bookTitle = bTitle;
	}
	
	/**
	 * If this book is older, returns negative
	 * If this book is newer, returns positive
	 * If books were published the same year, returns 0
	 * @param book to be compared against
	 */
	@Override
	public int compareTo(Book book) {
		
		
		return (publicationYear  - book.getPublicationYear());
	}
	
	//Getters and Setters
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}
		
		if(o == null)
		{
			return false;
		}
		
		if(!(o instanceof Book))
		{
			return false;
		}
		
		Book book = (Book) o;
		return  (this.bookTitle == book.getBookTitle() && this.publicationYear == book.getPublicationYear());
		
	}

	
	
	

}
