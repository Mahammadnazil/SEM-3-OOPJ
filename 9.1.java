class A{
	public void display()
	{
		System.out.println("method of A");
	}
}
class B extends A{
	public void display()
	{
		System.out.println("method of B");
	}
}
public class lab9_1
{
	 public static void main(String[] args) {
		B b=new B();
		b.display();
	}
}