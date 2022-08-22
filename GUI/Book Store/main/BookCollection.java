package main;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JOptionPane;

import helper.*;

public class BookCollection implements Serializable{

	private static ArrayList<Book> books = new ArrayList<Book>();

	public BookCollection() {
		
		
	}
	public void clear()
	{
		books.clear();
	}
	
	public void fillBooks()
	{		
		File filee=new File("Books.dat");
		if(filee.exists())
		{
		 try{
	            FileInputStream file=new FileInputStream("Books.dat");
	            ObjectInputStream inputFile=new ObjectInputStream(file);
	            
	            boolean endOfFile=false;
	     
	            while(!endOfFile)
	            {
	                try{
	                	books.add((Book)inputFile.readObject());
	                }catch(EOFException e)
	                {
	                     endOfFile=true;
	                }catch(Exception f)
	                {
	                      JOptionPane.showMessageDialog(null, f.getMessage());
	                }             
	                
	            }
	            inputFile.close();
	        }catch(IOException e)
	        {
	            JOptionPane.showMessageDialog(null, e.getMessage());
	        }
		}
	}
	
	public void saveBooks()
	{
				
		File filee=new File("Books.dat");
		try {
		if(!filee.exists())
			filee.createNewFile();
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "could not create file");
		}
		try{
            FileOutputStream file=new FileOutputStream("Books.dat");
            ObjectOutputStream outputFile=new ObjectOutputStream(file);
        
            for(int i=0;i<books.size();i++)
            {
               outputFile.writeObject(books.get(i));
            	
            }
            
            outputFile.close();
             JOptionPane.showMessageDialog(null, "Successfully Saved");
        }catch(IOException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
		clear();
		
	}

	public void addBook(Book book) {
		books.add(book);		

	}

	public void removeBook(Book book) {
		books.remove(book);
	}

	public Book getBook(String isbn) {
		Iterator<Book> itr = books.iterator();
		Book temp, book;
		while(itr.hasNext()) {
			book = itr.next();
			if(book.getIsbn().equals(isbn)) {
				temp = book;
				books.remove(book);
				return temp;
			}
		}
		return null;
	}

	public static ArrayList<Book> getBookCollection() {
		return books;
	}

	public void resetBooks() {
		books.clear();
	}

	public int getNumberOfBooks() {
		return books.size();
	}

	public void sortByIsbn() {
		Collections.sort(books, new IsbnComparator());
	}

	public void sortByYearOfPublish() {
		Collections.sort(books, new YearComparator());
	}
	public void sortByDiscountPrice() {
		Collections.sort(books, new DiscountPriceComparator());
	}
	

	public void sortByPrice() {
		Collections.sort(books, new YearComparator());
	}

	public void getAuthorsOfSpecifiedAgeRange(int start, int end) {
		Author author;
		ArrayList<Author> temp = new ArrayList<Author>();

		Iterator<Book> itrBook = books.iterator();
		while(itrBook.hasNext()) {
			author = itrBook.next().getWriter();
			if(author.getAge() > start && author.getAge() < end) {
				if(!temp.contains(author)) {
					temp.add(author);
				}
			}
		}

		Iterator<Author> itrAuthor = temp.iterator();
		while(itrAuthor.hasNext()) {
			author = itrAuthor.next();
			System.out.println(author.getName() + ", " + author.getAge());
		}
	}

	public void printCheapestBook() {
		Collections.sort(books, new PriceComparator());
		Iterator<Book> itr = books.iterator();
		double lowestPrice = books.get(0).getPrice();
		Book book;

		while(itr.hasNext()) {
			book = itr.next();
			if(book.getPrice() == lowestPrice) {
				System.out.println(book.getName() + ", " + book.getPrice());
			}
			else {
				break;
			}
		}
	}

	public void getHighestBookDiscountInfo() {
		Collections.sort(books, new DiscountPriceComparator());
		double highestDiscount = books.get(getNumberOfBooks() - 1).getPercentageDiscount();
		Iterator<Book> itr = books.iterator();
		Book book;

		while(itr.hasNext()) {
			book = itr.next();
			if(book.getPercentageDiscount() == highestDiscount) {
				System.out.println(book.getName() + ", " + book.getPrice() + ", " + book.getPercentageDiscount());
			}
		}
	}

	public void printBooksSubGenreAndPublishYear(String subGenre, int publishYear) {
		Book book;
		Iterator<Book> itr = books.iterator();
		
		while(itr.hasNext()) {
			book = itr.next();
			if((book.getGenre().getSubGenre().equals(subGenre)) && (book.getYearOfPublish() > publishYear)) {
				System.out.println(book.getName() + ", " + book.getWriter().getName());
			}
		}
	}

	public void printBookCollection() {
		Iterator<Book> itr = books.iterator();
		int i = 1;
		while(itr.hasNext()) {
			System.out.println(i + ". " + itr.next().getName());
			i++;
		}
	}

	public String printBookInfo(Book b) {
		String str = "";
		Iterator<Book> itr = books.iterator();
		Book book;
		while(itr.hasNext()) {
			book = itr.next();
			if(book.equals(b)) {
				System.out.println(book.getName());
				str = str + "Name:" + book.getName() + "\n" + "Price:" + book.getPrice() + "\n" +
						"Author Name:" + book.getWriter().getName() + "\n" + "Book Discount:" + book.getPercentageDiscount() + "\n" + 
						"Genre:" + book.getGenre().getGenre() + "\n" + "ISBN:" + book.getIsbn() + "\n" + 
						"Year of Publish:" + book.getYearOfPublish();
				break;
			}
		}

		if(str.equals("")) {
			return "";
		}
		return str;
	}

	@Override
	public String toString() {
		return "";
	}
}
