package homework01;

public class NumberUtil {
	
	public static void main(String[] args) {
		
		System.out.println(mid(15,20,25));
		System.out.println(mid(15,20,20));
		System.out.println(mid(15,15,20));
		System.out.println(mid(10,10,20));
		
	}
	
	public static int mid(int x, int y, int z) {
		
		int mid;
		
		if (y <= x && x <= z || z <= x && x <= y ) {
			mid = x;
		}
		else if (x <= y && y <= z || z <= y && y <= x) {
			mid = y;
		}
		else {
			mid = z;
		}
		
		return mid;
	}
}
