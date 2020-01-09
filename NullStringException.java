class StringEx extends Exception
{
	public StringEx(String Message)
	{
		super(Message);
	}
}

	class NullStringException
	{
		public static void main(String s[])
		{
			try
			{
				func(null);
			}
			catch(StringEx e)
			{
				System.out.println("Exception Caught");
				System.out.println(e.getMessage());
			}
		}
		static void func(String str) throws StringEx
		{
			if(str == null)
				throw new StringEx("String is Null ");
		}
	}