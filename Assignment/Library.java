package Assignment;

import java.util.ArrayList;

public class Library {
	
private ArrayList<Book> books;
	
    public Library (ArrayList<Book> books){
    	super();
    	this.books = books;
    }

    public ArrayList<Book> getBooks () 
    {
        return books;
    }
    
    public Book getSpecificBook(int bookIndex)
    {
    	return books.get(bookIndex);
    }
    
    public void setBooks(ArrayList<Book> books){
    	this.books = books;
    }
    
    public void displayBooks()
    {
    	for (int i = 0; i < books.size(); i++) {
    		System.out.println("ID " +books.get(i).getBookID());
    		System.out.println("Title "+books.get(i).getTitle());
    	}
    	System.out.println("Displayed "+books.size()+" Books");
    }
    
    public void addBook(int ID, String title)
    {
    	books.add(new Book(ID,title));
    	System.out.println("Book ID " +ID+ " titled "+title+" was successfully added to the library.");
    	
    }
   
    public void loanBook (int bookIndex) {
    	
    		for (int i=0;i<books.size();i++)
    		{
    			if(books.get(i).getBookID()==bookIndex)
    			{
    				if(books.get(i).getOn_Loan()==false)
    		    	{
    				  books.get(i).setOn_Loan(true);
    				 System.out.println(books.get(i).getTitle() + " has been set to on loan");
    		    	}else
    		    	{
    			     System.out.println(books.get(i).getTitle()+" is currently on loan");
    		    	}
    			}    
    		}
    }
    public void returnBook(int bookIndex) {
    	for (int i=0;i<books.size();i++)
		{
			if(books.get(i).getBookID()==bookIndex)
			{
				if(books.get(i).getOn_Loan()==true)
		    	{
				  books.get(i).setOn_Loan(false);
				 System.out.println(books.get(i).getTitle() + " has been returned");
		    	}else
		    	{
			     System.out.println(books.get(i).getTitle() + " has already been returned");
		    	}
			}    
		}
}
	
	public void removeBook(int id) {
		
		boolean successful = false;
		for (int i=0;i<books.size();i++)
		{
			if((int)books.get(i).getBookID()==id)
			{
				books.remove(i);
				successful=true;
				System.out.println("Book "+id+" was successfully removed");
			}
		}
		
		if (!successful)
		{
			System.out.println("ERROR! Book ID "+id+" does not exist in the system.");
			}
		}
	
	public void editBook(int bookIndex, int jf, String gh) {
		for (int i = 0; i < books.size(); i++) {
			if((int)books.get(i).getBookID()==bookIndex) {
				
				books.get(i).setBookID(jf);
				
			}
            if((int)books.get(i).getBookID()==bookIndex) {
				
				books.get(i).setTitle(gh);
				
			}
            
            System.out.println("Book ID "+bookIndex+" successfully amended to "+jf+" and title edited to "+gh);			
            break;          	
		}
   }	
 }	
