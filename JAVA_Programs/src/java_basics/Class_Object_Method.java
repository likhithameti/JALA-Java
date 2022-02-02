package java_basics;

/*
 	 create a class:
 	 Class className{
 	 	// fields  and method
 	 	 }
 	 
 	 Object Creation
 	 className object_name = new className;
 	 
 	 Method:
 	 access-specifier return-type method_name(paramsList);
 	 
 	 public void sample(int x,int y);
 	 
 */

class Demo{
	Demo(){
		
	}
	public void printHello() {
		System.out.println("Hello");
	}
}
public class Class_Object_Method {
		public static void main(String args[]) {
			Demo d = new Demo();
			d.printHello();
		}
}
