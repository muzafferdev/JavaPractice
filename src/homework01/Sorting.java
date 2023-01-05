package homework01;

public class Sorting {
	
	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
    	
    	System.out.println("Sıralama için int türünden 3 sayı giriniz: ");
    	
    	int x = sc.nextInt();
    	int y = sc.nextInt();
    	int z = sc.nextInt();
    	
    	sortingMinToMax(x, y, z);
	}
	
	public static void sortingMinToMax(int x, int y, int z) {
		
		int min = Math.min(x, Math.min(y, z));
		
		int max = Math.max(x, Math.max(y, z));
		
		
//		Üç tane sayının ortancası sayıların toplamından sayıların en küçüğünün ve en büyüğünün toplamını
//		çıkartmakla bulunabilir.
		
		int median = x + y + z - (min + max);
		
		if (min == max && min == median) {
			System.out.printf("%d = %d = %d%n", min, median, max);
		}
		else if (min == median) {
			System.out.printf("%d = %d < %d%n", min, median, max);
		}
		else if (max == median) {
			System.out.printf("%d < %d = %d%n", min, median, max);
		}
		else {
			System.out.printf("%d < %d < %d%n", min, median, max);
		}
		
	}
}
