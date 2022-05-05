import java.lang.reflect.Array;

public class Anagrams {
	
  public static void main(String [] args)
  {
	  int arrray[]= {6,3,7,2,8};
	  int temp=0 ,sum=0;
	  for(int i=0;i<arrray.length;i++)
		  {
		  for(int j=i+1;i<arrray.length;j++)
		  {
			  if(arrray[i]>arrray[j])
			  {
				  temp=arrray[i];
				  arrray[i]=arrray[j];
				  arrray[j]=temp;
				  sum=sum+temp;
			  }
			  if(sum==9)
			  System.out.println("success");
			  
			  
		  }
		  
		  }
	 
	  ;
  }

}
