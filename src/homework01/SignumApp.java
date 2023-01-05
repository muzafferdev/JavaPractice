package homework01;

public class SignumApp {
	
	public static void main(String[] args) {
		
		int result = SignumApp.signum(0);
		System.out.println(result);
	}
	
	public static int signum(int n) {
		
		final int equalsToZero = 0;
		final int positive = 1;
		final int negative = -1;
		
		int result = equalsToZero;
		
		if (n < 0) {
			result = negative;
		}
		else if (n > 0) {
			result = positive;
		}
		
		return result;
	}
}
