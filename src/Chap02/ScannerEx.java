//예제 02-4
package Chap02;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String args[]) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요. ");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		System.out.println("이름은 " + name + ", ");
		
		String city = scanner.next();
		System.out.println("도시는 " + city + ", ");
		
		String age = scanner.next();
		System.out.println("나이는 " + age + ", ");
		
		String weight = scanner.next();
		System.out.println("체중은 " + weight + ", ");
		
		boolean isSingle = scanner.nextBoolean();
		System.out.println("독신 여부는 " + isSingle + "입니다. ");
		scanner.close();
	}
}
