import java.util.ArrayList;

public class Fib {
	public static void main(String[] args) {
		ArrayList<Integer> fibNumbers = new ArrayList<>();
		for (int i = 0; i <= 10; i++) {
			if (i == 0 || i == 1) {
				fibNumbers.add(i);
			} else {
				int lastNumOne = fibNumbers.get(i - 1);
				int lastNumTwo = fibNumbers.get(i - 2);
				fibNumbers.add(lastNumOne + lastNumTwo);
			}
		}
		System.out.println(fibNumbers);
	}
}
