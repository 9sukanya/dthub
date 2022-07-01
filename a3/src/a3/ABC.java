//using this keyword in method


package a3;

public class ABC 
{
	
	public void m1()
	{
	    this.m3();
		System.out.println("first method");	
	}	
	public void m2()
	{
		this.m1();
		System.out.println("second method");
		this.m1();
		this.m3();
	}
	public void m3()
	{
		System.out.println("third method");
	}
	public static void main(String[] args) 
	{
		ABC obj=new ABC();
		obj.m2();
	}
}