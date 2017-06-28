/*Problem Statement try to compile and run this*/

public class Test {

	static {
		print(10);
	}

	static void print(int x) {
		System.out.println(x);
		System.exit(0);
	}
}

// When you try to compile this , it will compile successfully.
// When you try to run this, hwoever it will give a runtime error because the
// main method will not be found in the class