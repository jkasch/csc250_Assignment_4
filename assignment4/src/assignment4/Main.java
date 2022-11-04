package assignment4;

public class Main {

	public static void main(String[] args)
		// TODO Auto-generated method stub
		{
			BibleBook book1 = new BibleBook("Matthew", 28, "Orderly telling of the story of Jesus Christ with detailed genealogies.");
			BibleBook book2 = new BibleBook("Luke", 24, "Compassionate perspective on the events during the life and death of Jesus. Focus on stories that involve the poor and the ill.");
			BibleBook book3 = new BibleBook("Mark", 16, "Focus on the miracles and conflicts during the life and death of Jesus Christ.");	
			book1.display();
			book2.display();
			book3.display();
		}

}
