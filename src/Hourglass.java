/*
I am hoping to create a for loop system that activates through a constant.
constant-for loop-for loop-...
working from inside the hour glass out
Class constant changes height and levels in the hour glass
*/

public class Hourglass {
	public static final int TIMECHANGE = 1;
	public static void main(String[] args) {
		bottom();
		topup();
		middle();
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
		for(int i = 1; i <= TIMECHANGE; i++) {
			System.out.print(" ");
		}
		for(int i = 1; i <= 1; i++) {
			System.out.print("\\");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::::::::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("/");
			}
		}
		for(int i = 1; i <= TIMECHANGE; i++) {
			System.out.print("  ");
		}
		for(int i = 1; i <= 1; i++) {
			System.out.print("\\");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::::::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("/");
			}
		}
		for(int i = 1; i <= TIMECHANGE; i++) {
			System.out.print("   ");
		}
		for(int i = 1; i <= 1; i++) {
			System.out.print("\\");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("/");
			}
		}
		for(int i = 1; i <= TIMECHANGE; i++) {
			System.out.print("    ");
		}
		for(int i = 1; i <= 1; i++) {
			System.out.print("\\");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("/");
			}
		}
		for(int i = 1; i <= 5; i++) {
			System.out.print(" ");
		}
		for(int j = 1; j <= TIMECHANGE; j++) {
			System.out.print("||");
			}
			System.out.println();
		for(int i = 1; i <= 4; i++) {
			System.out.print(" ");
		}
		for(int i = 1; i <= 1; i++) {
			System.out.print("/");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("\\");
			}
		}
		for(int i = 1; i <= 3; i++) {
			System.out.print(" ");
		}
		for(int i = 1; i <= 1; i++) {
			System.out.print("/");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("\\");
			}
		}
		for(int i = 1; i <= 2; i++) {
			System.out.print(" ");
		}
		for(int i = 1; i <= 1; i++) {
			System.out.print("/");
			for(int j = 1; j <= TIMECHANGE; j++) {
				System.out.print("::::::");
			}
		for(int h = 1; h <= 1; h++) {
			System.out.println("\\");
			}
		}
		for(int i = 1; i <= TIMECHANGE; i++) {
			System.out.print(" ");
		}
		for(int i = 1; i <= 1; i++) {
			System.out.print("/");
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
	public static void topup() {
		
        for(int line = 0; line <= 3; line++) {
                 for(int j = 1; j <= line; j++) {
                 System.out.print(" ");
                  }
                  for(int j = 1; j <= 1; j++) {
                  System.out.print("\\");
                  }
                  for(int j = 0; j <= 7 - 2 * line; j+= 1) {
                  System.out.print(":");
                  }
                  for(int j = 1; j <= 1; j++) {
                  System.out.print("/");
                  }
                  System.out.println();
                  }
                  } 
                  public static void middle() {
                  System.out.print("    ");
                  System.out.println("||");
                  }
	}
