
public class Fiboncci {
public static void main(String [] args)
{
	int k,a=0,b=1;
	k=0;
	while(k<15)
	{
		k=a+b;
		a=b;
		b=k;
		System.out.println(k);
		
	}
}

}
