package Reverse_Demo;

public class reversestring 
{
	public static void main(String[] args)
	{
		String InputValue = "INDIA";
		char[] chars = InputValue.toCharArray();
		int length = chars.length;
		System.out.println("The char lenght is: " +length);
		for (int a = length-1; a>=0; a--)
		{
			System.out.print(chars[a]);
		}
	}
}
