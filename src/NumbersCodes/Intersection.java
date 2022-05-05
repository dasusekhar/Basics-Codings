package NumbersCodes;

import java.util.HashSet;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		int array[]= {1,3,4,5};
		int array2[]= {2,4,6,7};
		Set<Integer>set=new HashSet<>();
		for(int i=0;i<array.length;i++)
		{
			set.add(array[i]);
		}
		for(int j=0;j<array2.length;j++)
		{
			if(set.contains(array2[j]))
					{
				
				System.out.println(array2[j]);
					}
		}
		
		

	}

}
