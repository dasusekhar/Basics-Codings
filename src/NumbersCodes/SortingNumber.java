package NumbersCodes;

import java.util.Arrays;

public class SortingNumber {
	public static void main(String [] args)
	{
		int array[]= {10,4,8,6,2,17,13,9};
	/*
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		*/
		
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
					//if you want to reverse order we chang only  < this symbol it
					// it wil prints reverse order
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				  
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
		System.out.println(array[i]);
		}
		
	}

}
