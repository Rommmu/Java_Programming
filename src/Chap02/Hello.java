//예제 02-1
package Chap02;

public class Hello {
	
	public static int sum (int n, int m) {
		return n + m;
	}
	
	public static void main(String[] args) {
		int i = 10;
		int s;
		char a;
		
		s = sum(i, 10);
		a = '?';
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}
}
