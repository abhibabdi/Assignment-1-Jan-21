class DecimalToBinary{
	public static void main(String[] args) {
		int dec = 12;
		int arr[];
		arr = new int[10];
		int k,i;
		
		for(i = 1, k = 0; dec >= 1; i++, k++)
		{
			if(dec % 2 == 1)
				arr[k] = 1;
			else
				arr[k] = 0;
			dec = dec/2;
		}
	
		for(k = k - 1; k >= 0; k--)
		{
			System.out.print(arr[k]);
		}
	}
}