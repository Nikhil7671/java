package stringHandling;

public class Demo2 {
	
	public static void main(String[] args) {
		
		String str1 = "Good";
		String str2 = "Morning";
		
		String str3 = str1+" " + str2;
		
		
		System.out.println(str3);
		
		str3 = "Good"+str2;
		System.out.println(str3);
		
		String str4 =str1.concat(str3);
		System.out.println(str4);
		
		System.out.println(str4.charAt(5));
		
		System.out.println(str3.length());
		
		String str5 = "new";
		System.out.println(str5.toUpperCase());
		System.out.println(str5);
		
		String  str6 = str5.toUpperCase();
		System.out.println(str6);
		
		String str7 ="      Nikhil      ";
		
		System.out.println(str7.trim());//removes leading and trailing spaces
		
		String str8 = "Nikhil Kale";
		
		for(int i=0;i<str8.length();i++) {
			
			System.out.print(str8.charAt(i));
			
		}
		
		System.out.println();
		
		String str9 = "Nikhil Kale";
		
		System.out.println(str8.equals(str9));
		
		String str10= "Nikhil";
		String str11 ="nikhil";
		
		System.out.println(str10.equalsIgnoreCase(str11));
		
	}

}
