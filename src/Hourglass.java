/*
I am hoping to create a for loop system that activates through a constant.
constant-for loop-for loop-...
working from inside the hour glass out
*/

public class Hourglass {
	public static final int TIMECHANGE = 1; 
	public static void main(String[] args) {
		top();
	}
	public static void top() {
		for(int i = 1; i >= 1; i++);
			System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
			middle1();
			System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
	}
	public static void middle1() {
		for(int j = 1; j >= 1; j++);
			System.out.println(" \\::::::::/");
			middle2();
			System.out.println(" /::::::::\\");
	}
	public static void middle2() {
		System.out.println("  \\::::::/  ");
		middle3();
		System.out.println("  /::::::\\  ");
	}
	public static void middle3() {
		System.out.println("   \\::::/");
		middlef();
		System.out.println("   /::::\\");
		
	}
	public static void middlef() {
		System.out.println("    \\::/");
		System.out.println("     ||");
		System.out.println("    /::\\");
		
	}

}
