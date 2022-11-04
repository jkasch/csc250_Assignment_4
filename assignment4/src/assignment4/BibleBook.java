package assignment4;

public class BibleBook {
	private String book;
	private int chapters;
	private String summary;
	
	public BibleBook(String book, int chapters, String summary)
	{
		this.book = book;
		this.chapters = chapters;
		this.summary = summary;

	}
	public void display()
	{
		System.out.println("Book name: " + book + "(" + chapters + " chapters) - " + summary);
	}

}
