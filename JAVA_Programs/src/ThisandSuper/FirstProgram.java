package ThisandSuper;

public class FirstProgram {
	int a = 10;
	public void print() {
		System.out.println("The Value of A : "+this.a);
	}
	public static void main(String args[]) {
		FirstProgram fs = new FirstProgram();
		fs.print();
	}
}
