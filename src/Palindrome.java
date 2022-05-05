
public class Palindrome {

	public static void main(String[] args) {
		 int n=121,r,sum=0;
		 int t=n;
		 while(n>0)
		 {
			 r=n%10;
			 n=n/10;
			 sum=sum*10+r;
		 }
		 System.out.println(sum);
if(t==n)
{
	System.out.println("this is a palindrome ");
}
else
{
  System.out.println("this is not a palindrome");
}
	}

}
