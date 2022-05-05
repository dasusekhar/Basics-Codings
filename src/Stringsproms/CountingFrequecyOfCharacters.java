package Stringsproms;

public class CountingFrequecyOfCharacters {

	public static void main(String[] args) {
		String str="welcome totsts java";
		int count=0;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)=='o')
			{      
				count++;
			}
		}
		System.out.println("frequency of t is : "+count);

	}

}
