package NumbersCodes;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElments {

	public static void main(String[] args) {
		int array[]= {10,20,30,30};
		/*
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
				  System.out.println("duplicate elements are  :"+array[i]);
				}
			}
		}
		*/
	  Set<Integer> set=new HashSet<>();
	  for(int i=0;i<array.length;i++)
	  {
		  if(set.contains(array[i]))
		  {
			  System.out.println("duplicate elements are "+array[i]);
			  
		  
	  }
	  
	  
		 

	}
	}
}


