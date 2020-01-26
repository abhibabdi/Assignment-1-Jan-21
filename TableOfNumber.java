class TableOfNumber{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int limit = Integer.parseInt(args[1]);
		int res =0;
		for(i = 1; i <= limit; i++)
		{
          res = res + num;
          System.out.println(num + "*" + i + "=" res);
		}
	}
}