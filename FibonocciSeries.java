class FibonocciSeries{
	public static void main(String[] args) {
		int a = 0,b = 1,last = 89,i;
		int res = 0;
		System.out.print(b+" ");
		for(i = 1; res < last; i++)
		{
			res = a + b;
			a = b;
			b = res;
			System.out.print(b+" ");
		}
	}
}