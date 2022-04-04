import java.io.IOException;

public class ForLoopDemo {
	public static void main(String[] args) throws IOException {
		int row = 5;
		if (row <= 0) {
			throw new IllegalArgumentException("Row value should be greater than zero");
		}
		for (row = 5; row >= 1; row--) {
			for (int column = 0; column < row; column++) {
				System.out.println("*");
			}
			System.out.println("\n");
		}
		
	}
}
