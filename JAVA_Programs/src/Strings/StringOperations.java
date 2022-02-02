package Strings;

public class StringOperations {
	public static void main(String args[]) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = "HEllo";
		
		// concatenate
		String pair = s1+" "+s2;
		System.out.println(pair);
		
		// length
		int len = pair.length();
		System.out.println("Pair Length : "+len);
		
		// equal
		if(s1.equals(s3))
			System.out.println("Both strings are equal");
		else
			System.out.println("Strings are not equal");
		
		// equal Ignore case
		if(s1.equalsIgnoreCase(s3))
				System.out.println("Both strings are equal");
		else
				System.out.println("Strings are not equal");
		
		// methods
		boolean start = pair.startsWith("Hel");
		
		boolean end = pair.endsWith("rld");
		
		System.out.println(start+" "+end);
		
		// replace 
		String newstr = pair.replace("Hello","Likhith");
		System.out.println("New String : "+newstr);
		
		// upper case & lower case
		System.out.println("Lower case : "+pair.toLowerCase());
		System.out.println("Upper case : "+pair.toUpperCase());
		
		// Trimming string
		String notTrim = "  Likhith Trim  ";
		System.out.println("Trimmed String : "+notTrim.trim());
		
		// Regular Expression
		String sample = "Demo";
		String regex = "Demo";
		System.out.println("Demo matched : "+sample.matches(regex));
		
		// Number to String
		int ele = 39;
		String eleStr = String.valueOf(ele);
		System.out.println(eleStr);
	}

}
