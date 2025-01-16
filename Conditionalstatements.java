package name;

public class Conditionalstatements {

	public static void main(String[] args) {
		int a=4;
		int b=3;
		if(a<b) {
		System.out.println("a is less than b");
		if(a>0) {
			System.out.println("a is positive");
		}
		else {
			System.out.println("a is negative");
		}
			}
		else if(a>b && a>0) {
			System.out.println("a is less than b and a is negative");
		}
		else {
			System.out.println("a is greater than b");
		}

	}
}
