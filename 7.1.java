public class Lab7_1{
	public static void main(String[] args) {
		String str = "Hello";
		String str2 = "Welcome";
		String str3 = "Hello World";
		int a = 5;
		int b = 5;
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.concat(str2));
		System.out.println(str3.indexOf("World"));
		System.out.println(str.equals(str3));
		System.out.println(a+b);
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(b);
		System.out.println(s1+s2);
		System.out.println(str.toString());
		String str4  = "     Hello    ";
		System.out.println(str4.trim());
		String str5 = "Hello World";
		System.out.println(str5.substring(1));
		System.out.println(str5.substring(1,5));
	}
}