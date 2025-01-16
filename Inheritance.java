package name;
public class Inheritance extends Parameters{

	public static void main(String[] args) {
		Inheritance I = new Inheritance();
		I.div(4, 7);
		I.add(5,8);
		Inheritance.sub(5,2);
		I.mul(5, 2);
		}
	public void div(int a, int b) {
		int d;
		d=a/b;
		System.out.println("Division of two numbers:"+" "+d);
	}

}
