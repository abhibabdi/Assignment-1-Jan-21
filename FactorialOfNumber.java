class FactorialOfNumber{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int res = 1;
		for( i = 1; i <= num; i++)
		{
          res = res * i;
		}
	   System.out.println("Factorial of " + num + "is :" res);
	}
}