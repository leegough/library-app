package Assignment;

public class Book {
	
	//Instance variables
	private int BookID;
	private String Title;
	private String Author;
	private boolean On_Loan;
	private int Number_of_Loans;

	public Book(int BookID, String Title) {
		this.BookID = BookID;
		this.Title = Title;
	}

	//Constructor
	public Book(int BookID, String Title, String Author, boolean On_Loan, int Number_of_Loans){
		this.BookID = BookID;
		this.Title = Title;
		this.Author = Author;
		this.On_Loan = On_Loan;
		this.Number_of_Loans = Number_of_Loans;
	}

	//Mutator methods
	public void setBookID(int BookID){
		this.BookID = BookID;
	}
	public void setTitle(String Title){
		this.Title = Title;
	}
	public void setAuthor(String Author){
		this.Author = Author;
	}
	public void setOn_Loan(boolean On_Loan){
		this.On_Loan = On_Loan;
	}
	public void setNumber_of_Loans(int Number_of_Loans){
		this.Number_of_Loans = Number_of_Loans;
	}
	
	//Accessor methods
	public int getBookID(){
		return BookID;
	}
	public String getTitle(){
		return Title;
	}
	public String getAuthor(){
		return Author;
	}
	public boolean getOn_Loan(){
		return On_Loan;
	}
	public int getNumber_of_Loans(){
		return Number_of_Loans;
	}
}