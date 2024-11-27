class Student{
	long enroll;
	String name;
	String gender;
	float spi;
	static int count=0;

Student(long enroll, String name, String gender, float spi){
	this.enroll=enroll;
	this.name=name;
	this.gender=gender;
	this.spi=spi;
	count++;
}
public void display(){
	System.out.println("Enroll is "+ this.enroll);
	System.out.println("Name is "+ this.name);
	System.out.println("Gender is "+ this.gender);
	System.out.println("SPI is "+ this.spi);
}
}
public class Lab5_1{
	public static void main(String[] args) {
		Student s1 = new Student (230202011,"Karan Pankhania", "Male",7.77F);
		Student s2 = new Student (230202012,"Priyansh Parekh", "Male",9.78F);
		s1.display();
		s2.display();
	}
}