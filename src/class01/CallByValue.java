package class01;

/**
 * 메소드간 파리미터 전달
 * - 콜 바이 벨류 (call by value) : 값 전달(값 복사)
 */

public class CallByValue {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		int sum = addNumbers(num1 , num2); // 다른 메소드 호출
		
		System.out.println("정수" + num1 + "더하기" + num2 + "은" + sum);

	}
	
	// 덧셈 메소드
	private static int addNumbers(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
}
