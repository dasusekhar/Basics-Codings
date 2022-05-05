
public class PrimeNumber {

	public static void main(String[] args) {
		String str="welcome";
		String reverse=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("original string is :"+str);
		System.out.println("reverse String is  :"+reverse);

	}

}
