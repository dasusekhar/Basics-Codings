package Stringsproms;

public class SortingAlphabetical {

	public static void main(String[] args) {
		String str="dasusekharyadav";
		char array[]=str.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
					//if we want to sort reverse alphabetical we just change <  
				{
					char  temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println(new String(array));
		
		

	}

}
