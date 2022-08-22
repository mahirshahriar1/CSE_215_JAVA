package helper;
import main.Book;
import java.util.Comparator;

public class PriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		Book b1 = o1;
		Book b2 = o2;

		if(b1.getPrice() < b2.getPrice()) {
			return -1;
		}
		else if(b1.getPrice() > b2.getPrice()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
