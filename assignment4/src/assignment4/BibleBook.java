package assignment4;

public class BibleBook {
	private String book;
	private int chapters;
	private String summary;
	
	public void Biblebook(String book, int chapters, String summary)
	{
		this.book = book;
		this.chapters = chapters;
		this.summary = summary;

	}
	public class Driver
	{
	public static void main(String[] args)
	{
		BibleBook book1 = new BibleBook("Matthew", 28, "Orderly telling of the story of Jesus Christ with detailed genealogies.");
		BibleBook book2 = new BibleBook("Luke", 24, "Compassionate perspective on the events during the life and death of Jesus. Focus on stories that involve the poor and the ill.");
		BibleBook book3 = new BibleBook("Mark", 16, "Focus on the miracles and conflicts during the life and death of Jesus Christ.");	

		book1.display();
		System.out.print(false);
		
		//System.out.print("Book name: " + book1.book + "(" + book1.chapters + ") - " + book1.summary +);
	}
	//public static book1.display()
	//{
		//System.out.println("Book name: " + book1.book + "(" + book1.chapters + ") - " + book1.summary +);
	//}

}
}
