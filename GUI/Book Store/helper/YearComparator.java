package helper;
import main.*;
import java.util.Comparator;

public class YearComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		Book b1 = o1;
		Book b2 = o2;

		if(b1.getYearOfPublish() < b2.getYearOfPublish()) {
			return -1;
		}
		else if(b1.getYearOfPublish() > b2.getYearOfPublish()) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
