class student{
	int rollno;
	String name;
	static int count=0;
	student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
		count++;
	}
	public void display(){
		System.out.println("rollno:"+this.rollno);
		System.out.println("name:"+this.name);
	}
}
	public class lab8_1{
		public static void main(String[] args) {
			student s1=new student(101,"nazil");
			student s2=new student(102,"mahir");
			s1.display();
			s2.display();
			System.out.println(student.count);
		}
	}
