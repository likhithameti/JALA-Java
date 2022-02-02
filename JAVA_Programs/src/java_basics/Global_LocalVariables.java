package java_basics;

public class Global_LocalVariables {
	static int globalVariable = 10;
	public static void main(String args[]) {
		int globalVariable  = 12;
		System.out.println("Local : "+globalVariable);
		System.out.println("Global : "+Global_LocalVariables.globalVariable);
	}
}
