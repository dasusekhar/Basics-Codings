package NumbersCodes;

public class LargestNumber {

	public static void main(String[] args) {
		 int array[]= {10,20,30,60,50};
		 for(int i=0;i<array.length;i++)
		 {
			 for(int j=i+1;j<array.length;j++)
			 {
				 if(array[i]>array[j])
				 {
					 int temp=array[i];
					 array[i]=array[j];
					 array[j]=temp;
				 }
			 }
		 }
		 System.out.println(array[1]);

	}

}
