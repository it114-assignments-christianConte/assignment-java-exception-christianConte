public class Main 
{
	public Main()
	{
		
	}
	
	public static void main(String[] args) 
	{
		
	}
	
	public void method1(Integer _ext) throws MyException1, MyException1Child
	{
		switch (_ext) 
		{
		case 1:
			throw new MyException1("1");
		case 2:
			throw new MyException1Child("2");
		default:
			throw new IllegalArgumentException("default threw RuntimeException");
		}
	}
	
	public static void useMethod1(Integer _ext)
	{
		Main m = new Main();
		
		try 
		{
			m.method1(1);
		} 
		catch (MyException1 e) 
		{
			e.printStackTrace();
		}
		catch (MyException1Child e)
		{
			e.printStackTrace();
		}
	}
}
