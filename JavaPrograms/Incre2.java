 class Incre2
{
	public static void main(String[] args)
	{
		int a =1;
		int b = 1;
		int c = 1;
		a =++a + b++ + ++c ;
		b= ++b + a++ + c++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
}