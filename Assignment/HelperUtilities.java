package Assignment;

import java.util.ArrayList;

	public class HelperUtilities {
		
		private static String[] names = {
			"Harry Potter and the Philosopher's Stone", "Harry Potter and the Chamber of Secrets", 
			"Harry Potter and the Prisoner of Azkaban", "Harry Potter and the Goblet of Fire",
			"Harry Potter and the Order of the Phoenix", "Harry Potter and the Half-Blood Prince",
			"Harry Potter and the Deathly Hallows"
	};

	private static int[] ids ={
			1000, 1001, 1002, 1003, 1004, 1005, 1006
	};

	public static ArrayList<Book> generateBooks()
	{
		ArrayList<Book> books = new ArrayList<Book>();
		
		for (int i=0;i<names.length;i++)
		{
			books.add(new Book(ids[i],names[i]));
		}
		
		return books;
	}

	}