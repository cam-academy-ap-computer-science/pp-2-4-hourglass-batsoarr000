/*
I am hoping to create a for loop system that activates through a constant.
constant-for loop-for loop-...
working from inside the hour glass out
Class constant changes height and levels in the hour glass
*/

public class Hourglass {
	public static final int TIMECHANGE = 1;
	public static void main(String[] args) {
		top();
		middle1();
		middle2();
		middle3();
		middlefa();
		middle();
		middlefb();
		middle6();
		middle4();
		middle5();
		bottom();
	}
	public static void top() {
		for(int i = 1; i <= 1; i++) {
			System.out.print("|");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("\"\"\"\"\"\"\"\"\"\"");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("|");
			}
		}
	}
	public static void middle1() {
		for(int i = 1; i <= 1; i++) {
			System.out.print(" \\");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::::::::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("/");
			}
		}
	}
	public static void middle2() {
		for(int i = 1; i <= 1; i++) {
			System.out.print("  \\");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::::::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("/");
			}
		}
	}
	public static void middle3() {
		for(int i = 1; i <= 1; i++) {
			System.out.print("   \\");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("/");
			}
		}
	}
	public static void middlefa() {
		for(int i = 1; i <= 1; i++) {
			System.out.print("    \\");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("/");
			}
		}
	}
	public static void middle() {
		for(int i = 1; i <= TIMECHANGE; i++) {
			System.out.print("     ");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("||");
			}
		System.out.println();
		}
	}
	public static void middlefb() {
		for(int i = 1; i <= 1; i++) {
			System.out.print("    /");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("\\");
			}
		}
	}
	public static void middle6() {
		for(int i = 1; i <= 1; i++) {
			System.out.print("   /");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("\\");
			}
		}
	}
	public static void middle4() {
		for(int i = 1; i <= 1; i++) {
			System.out.print("  /");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::::::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("\\");
			}
		}
	}
	public static void middle5() {
		for(int i = 1; i <= 1; i++) {
			System.out.print(" /");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::::::::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("\\");
			}
		}
	}
	public static void bottom() {
		for(int i = 1; i <= 1; i++) {
			System.out.print("|");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("\"\"\"\"\"\"\"\"\"\"");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("|");
			}
		}
	}
}