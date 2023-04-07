package class01;

/**
 * 메소드간 파라미터 전달(배열 , 객체와 같은 여러개 값을 담는 객체의 주소값 전달
 * - 콜바이 레퍼런스(call by reference) : 참조 주소값 복사-복수
 * - 콜바이 벨류 : 단수
 */

public class CallByReference {

	public static void main(String[] args) {
		int[] numbers = { 1 , 2 , 3 , 4 , 5 };
		// int 자료형 변수 5개 선언해서 1,2,3,4,5 저장
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		// 타,개,순에 의하여 printArray 이름을 같게 할 수 있음
		printArray(numbers); // 배열 출력 메소드 호출
		printArray2(num1 , num2 , num3 , num4 , num5);
	}
	
		
									// 파라미터(매개변수)
	private static void printArray2(int num1, int num2, int num3, int num4, int num5) {
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
	}



	// 배열을 전달 받아서 출력해주는 메소드
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}

}
