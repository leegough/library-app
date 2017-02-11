package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

	public class LibraryTester {
		
		public static void main(String args[]){

			Library lib = new Library(HelperUtilities.generateBooks());
			Scanner sc = new Scanner(System.in);
			
			displayMenu(lib, sc);
		}

	public static void displayMenu(Library i, Scanner s) {
		System.out.println("--- Library Menu ---");
		System.out.println("--- (1) Display Books ---");
		System.out.println("--- (2) Add Book ---");
		System.out.println("--- (3) Remove Book ---");
		System.out.println("--- (4) Edit Book ---");
		System.out.println("--- (5) Loan Book ---");
		System.out.println("--- (6) Return Book ---");
		System.out.println("--- (7) EXIT ---");
		
		try {
		
		int option = s.nextInt();
		s.nextLine();
		
		switch(option){
		case 1: i.displayBooks();
		        break;
		
		case 2: System.out.println("Enter an ID");
			    int id = s.nextInt();
			    s.nextLine();
			    System.out.println("Enter a title");
		        String title = s.nextLine();
			    i.addBook(id, title);
		        break;
		        
		case 3: System.out.println("Enter an ID to remove");
		        int idToRemove = s.nextInt();
		        i.removeBook(idToRemove);
		        break;
		        
		case 4: System.out.println("Please enter the ID of the book you wish to edit:");
		        int oldID = s.nextInt();
		        System.out.println("Enter new amended ID:");
		        int newID = s.nextInt();
		        s.nextLine();
		        System.out.println("Enter a title");
		        String newtitle = s.nextLine();
		        i.editBook(oldID, newID, newtitle);
	            break;
		       
		case 5: System.out.println("Enter an ID you wish to loan");
		        int idToLoan = s.nextInt();		       
                i.loanBook(idToLoan);		        		        
                s.nextLine();
                break;
                
		case 6:	System.out.println("Enter an ID you wish to return");
		        int idToReturn = s.nextInt();
                i.returnBook(idToReturn);
                s.nextLine();
                break;
		
		case 7: System.out.println("Program has been successfully edited");
		        System.exit(1);
		        break;
		
		default: System.out.println("ERROR: Invalid input");
		         break;
		
		}
		
		displayMenu(i, s);
		
		} catch (InputMismatchException e) {
		    System.out.print("Invalid input. Please select a number!\n"); //try to find out specific reason.
		    Library lib = new Library(HelperUtilities.generateBooks());
			Scanner sc = new Scanner(System.in);
			
			displayMenu(lib, sc);
		}	
	
	  }
	

	}

	
	
	