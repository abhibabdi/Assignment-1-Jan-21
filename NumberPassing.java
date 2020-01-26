class NumberPassing{
	public static void main(String[] args) {
		int first = Integer.parseInt(args[0]);
		if(first < 40)
		{
			System.out.println("FAILING");
			System.exit(0);
		}
		int second = Integer.parseInt(args[1]);
		if(second < 40)
		{
			System.out.println("FAILING");
			System.exit(0);
		}
		int third = Integer.parseInt(args[2]);
		if(third < 40)
		{
			System.out.println("FAILING");
			System.exit(0);
		}
		int sum;
		sum = first + second +third;
		if(sum >= 125)
		System.out.println("PASSING");
		else
		System.out.println("FAILING");	
	}
}