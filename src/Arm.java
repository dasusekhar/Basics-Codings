
public class Arm {

	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int r,sum=0;
		while(n>0)
		{
			r=n%10;
			n=n%10;
			sum=sum+r*r*r;
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("this is a armstron number ");
		}else
		{
			System.out.println("this is not a armstrong number ");
		}

	}

}
