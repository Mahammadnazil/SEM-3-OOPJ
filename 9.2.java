class demo{
	int x=10;
	demo(){
		System.out.println("parent constructor");
	}
	void display(){
		System.out.println("parant method");

	}
}
class New extends demo{
	int x=5;
	New(){
		super();
	}
	void print(){
		System.out.println(super.x);
		System.out.println(x);
		super.display();
	}
}
public class lab9_2{
	public static void main(String[]args){
		New n=new New();
		n.print();
	}
}