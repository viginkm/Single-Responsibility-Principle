package single;

public class Book  {
	
	Bookpersistence bookpersistence   ;
	int pages;
	String author;
	
	
	
	public Book(int pages, String author) {
		super();
		this.pages = pages;
		this.author = author;
		this.bookpersistence = new Bookpersistence();
		
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

	public void save() {
		// TODO Auto-generated method stub
		
		this.bookpersistence.save(this);
		
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		
		
		return "Book [pages=" + pages + ", author=" + author + "]";
	}
	
	
	

}
