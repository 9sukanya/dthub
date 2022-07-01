//using final keyword



package a3;



public class Finalkeyword 
{
   final int a=123;
   
   public void m1()
   {
	   System.out.println(""+a);
   }
   
   public static void main(String[] args)
   {
	   Finalkeyword f=new Finalkeyword();
	   f.m1();
}
}