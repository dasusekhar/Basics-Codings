
public class IntereviewAskedPersistent {

	public static void main(String[] args) {
		  long   id=2345356;
		  long temp=0;
		long i,j;
		  for( i=id;i>0;i++)
		  {
			  for( j=i+1;j>0;j++)
			  {
				  
				  if(i>j)
				  temp=i;
				  i=j;
				  j=temp;
			  }
			  
		  }
		  System.out.println(i);
		  
		  
		 
		  
		  
		  

	}

}
