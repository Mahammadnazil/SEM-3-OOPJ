class Time{
	int hour;
	int minute;
	Time(int hour, int minute)
	{
		this.hour = hour;
		this.minute = minute;
	}
	public Time addition(Time t1, Time t2)
	{
		int newMin = t1.minute + t2.minute;
		int newHour = t1.hour + t2.hour;
		if(newMin>=60)
		{
			newHour = newHour + newMin/60;
			newMin = newMin%60;
		}
		return new Time( newHour, newMin);
	}
	public void display(){
		System.out.println(hour + ":" + minute);
	}
}
public class Lab6_1{
	public static void main(String[] args) {
		Time t1 = new Time(12,56);
		Time t2 = new Time(54,21);
		Time t3 = t1.addition(t1,t2);
		t3.display();
	}
}