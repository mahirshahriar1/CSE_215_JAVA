package main;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Invoice {

	private ArrayList<Book> books;
	private LocalDateTime date;

	public Invoice() {
		books = new ArrayList<Book>();
		date = LocalDateTime.now();
	}

	public ArrayList<Book> getBook() {
		return books;
	}

	public LocalDateTime getDateTime() {
		return date;
	}

	public int getNumberOfBooks() {
		return books.size();
	}

	public void addBook(Book book) {
		books.add(book);
	}

	public double getFinalPrice() {	
		double authorDiscount;
		double bookDiscount;
		double genreDiscount;
		double max;

		bookDiscount = calculateBookDiscountPrice();
		genreDiscount = calculateGenreDiscountPrice();

		if(isAuthorDiscountEligible()) {
			authorDiscount = calculateAuthorDiscountPrice();
		}
		else {
			authorDiscount = 0;
		}

		if(authorDiscount > bookDiscount) {
			if(authorDiscount > genreDiscount) {
				max = authorDiscount;
			}
			else {
				max = genreDiscount;
			}
		}
		else {
			if(bookDiscount > genreDiscount) {
				max = bookDiscount;
			}
			else {
				max = genreDiscount;
			}
		}

//		System.out.println("Author Discount:" + authorDiscount);
//		System.out.println("Book Discount:" + bookDiscount);
//		System.out.println("Genre Discount:" + genreDiscount);
		return (calculatePrice() - max);
	}

	public double calculatePrice() {
		double price = 0;
		Iterator<Book> itr = books.iterator();

		while(itr.hasNext()) {
			price = price + itr.next().getPrice();
		}
		return price;
	}

	public double calculateAuthorDiscountPrice() {
		ArrayList<Author> authors = new ArrayList<Author>();
		Author author;

		Iterator<Book> itrBook = books.iterator();
		while(itrBook.hasNext()) {
			authors.add(itrBook.next().getWriter());
		}

		ArrayList<Author> authorFilter = new ArrayList<Author>();

		Iterator<Author> itrAuthor = authors.iterator();
		while(itrAuthor.hasNext()) {
			author = itrAuthor.next();
			if(!authorFilter.contains(author)) {
				authorFilter.add(author);
			}
		}

		ArrayList<Integer> frequencyOfAuthor = new ArrayList<Integer>();
		itrAuthor = authors.iterator();
		Iterator<Author> itrAuthorFilter = authorFilter.iterator();

		int i;
		while(itrAuthorFilter.hasNext()) {
			author = itrAuthorFilter.next();
			i = 0;
			for(int j = 0; j < authors.size(); j++) {
				if(author.equals(authors.get(j))) {
					i++;
				}
			}
			frequencyOfAuthor.add(i);
		}

		double price = 0;
		double discountFromAuthor = 0;
		int count = 0;

		Iterator<Integer> itrFrequency = frequencyOfAuthor.iterator();
		while(itrFrequency.hasNext()) {
			if(itrFrequency.next() >= 3) {
				count++;
			}
		}

		double[] discounts = new double[count];
		int k = 0;
		itrAuthor = authors.iterator();
		itrFrequency = frequencyOfAuthor.iterator();
		itrBook = books.iterator();

		for(int j = 0; j < authorFilter.size(); j++) {
			author = authors.get(j);
			if(frequencyOfAuthor.get(j) >= 3) {
				for(int m = 0; m < books.size(); m++) {
					if(authorFilter.get(j).equals(books.get(m).getWriter())) {
						price = price + books.get(m).getPrice();
					}
				}
				discounts[k++] = (price * 0.45);
				price = 0;
			}
		}

		for(int n = 0; n < discounts.length; n++) {
			discountFromAuthor = discountFromAuthor + discounts[n];
		}

		return discountFromAuthor;
	}

	public double calculateBookDiscountPrice() {
		double discount = 0;
		Iterator<Book> itr = books.iterator();
		Book book;

		while(itr.hasNext()) {
			book = itr.next();
			discount = discount + (book.getPrice() * (book.getPercentageDiscount() / 100));
		}
		return discount;
	}

	public double calculateGenreDiscountPrice() {
		double discount = 0;
		Iterator<Book> itr = books.iterator();
		Book book;

		while(itr.hasNext()) {
			book = itr.next();
			discount = discount + (book.getPrice() * (book.getGenre().getGenreDiscount()));
		}
		return discount;
	}

	public boolean isAuthorDiscountEligible() {
		ArrayList<Author> authors = new ArrayList<Author>();
		Author author;

		Iterator<Book> itrBook = books.iterator();
		while(itrBook.hasNext()) {
			authors.add(itrBook.next().getWriter());
		}

		ArrayList<Author> authorFilter = new ArrayList<Author>();

		Iterator<Author> itrAuthor = authors.iterator();
		while(itrAuthor.hasNext()) {
			author = itrAuthor.next();
			if(!authorFilter.contains(author)) {
				authorFilter.add(author);
			}
		}

		ArrayList<Integer> frequencyOfAuthor = new ArrayList<Integer>();
		itrAuthor = authors.iterator();
		Iterator<Author> itrAuthorFilter = authorFilter.iterator();

		int i;
		while(itrAuthorFilter.hasNext()) {
			author = itrAuthorFilter.next();
			i = 0;
			for(int j = 0; j < authors.size(); j++) {
				if(author.equals(authors.get(j))) {
					i++;
				}
			}
			frequencyOfAuthor.add(i);
		}

		Iterator<Integer> itrFrequency = frequencyOfAuthor.iterator();
		while(itrFrequency.hasNext()) {
			if(itrFrequency.next() >= 3) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
		String formatDateTime = getDateTime().format(format); 
		String dateTime = "purchase date: " + formatDateTime + "\n";
		String str = "";
		double price = calculatePrice();
		double priceAfterDiscount = getFinalPrice();

		for(int i = 0; i < books.size(); i++) {
			if(i == books.size() - 1) {
				str = str + (i + 1) + ". " + books.get(i).getName() + ":" + books.get(i).getPrice();
			}
			else {
				str = str + (i + 1) + ". " + books.get(i).getName() + ":" + books.get(i).getPrice() + "\n";
			}
		}	

		return dateTime + str + "\n" + "price: " + price + "\n" + "price after discount: " + priceAfterDiscount;
	}
}
