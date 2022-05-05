package Stringsproms;

public class RemovingWhiteSpaces {

	public static void main(String[] args) {
		String str=" ja va  st ar ";
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);

	}

}
