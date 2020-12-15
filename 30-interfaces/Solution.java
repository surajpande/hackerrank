interface BaseI {
	void method();
}
class BaseC
{
	public void method()
	{
		System.out.println("Inside BaseC:: method");
	}
}
class Implc extens BaseC implement BaseI
{
	public static void main(String []s)
	{
		(new Implc()).method();
	}
}
