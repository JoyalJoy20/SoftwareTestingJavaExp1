package example;

public class Book {
	private String title;
	private String author;
	private int isbn;
	
	public Book(String title,String author,int isbn)
	{
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	public void setauthor(String author)
	{
		this.author=author;
	}
	public String getauthor()
	{
		return author;
	}
	public void setisbn(int isbn)
	{
		this.isbn=isbn;
	}
	public int getisbn()
	{
		return isbn;
	}
	
	public void addBook()
	{
		
	}
	public void removeBook()
	{
		
	}
	

}
