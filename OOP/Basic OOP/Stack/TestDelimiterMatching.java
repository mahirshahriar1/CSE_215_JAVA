package Stack;

public class TestDelimiterMatching {

	public static void main(String[] args) {
		DelimiterMatching obj=new DelimiterMatching();
		
		System.out.println(obj.isDelimiterMatching("[[(])]"));

		System.out.println(obj.isDelimiterMatching("[]"));
		
		System.out.println(obj.isDelimiterMatching("[]("));
	}

}
