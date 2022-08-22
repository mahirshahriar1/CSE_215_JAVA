package helper;
import java.util.Comparator;
import main.*;

public class DiscountPriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		Book b1 = o1;
		Book b2 = o2;
		
		if(b1.getPercentageDiscount() < b2.getPercentageDiscount()) {
			return -1;
		}
		else if(b1.getPercentageDiscount() > b2.getPercentageDiscount()) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
