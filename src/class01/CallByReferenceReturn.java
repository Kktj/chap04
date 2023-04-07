package class01;

/**
 * 메소드간 파라미터 전달(배열 , 객체와 같은 여러개 값을 담는 객체의 주소값 전달) 
 * - 콜바이 레퍼런스(call by reference) : 참조 주소값 복사-복수
 */

public class CallByReferenceReturn {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		int[] newNumbers = addTen(numbers);
		
		// addTen(numbers); // 메소드 호출하고 반환된 값을 받음
		
		// 서로 틀리지만 바라보는 곳은 같음 그래서 변화된 값 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// for (int i = 0; i < numbers.length; i++) {
		// System.out.println(newNumbers[i]);
	}
	////전달받은 배열의 요소에 10을 더해주는 메소드
									// 위에 파라미터 변수이름과 다른 이름도 가능
	private static int[] addTen(int[] arr) {
		
		int[] nums = null; // 메모리 공간 미확보
		nums = new int[arr.length]; // 5칸짜리 새로운 배열이 만들어짐
		
		nums[0] = arr[0] + 10;
		nums[1] = arr[1] + 10;
		nums[2] = arr[2] + 10;
		nums[3] = arr[3] + 10;
		nums[4] = arr[4] + 10;
		System.out.println(nums[0]);
		
		
//		arr[0] = arr[0] + 10;
//		arr[1] = arr[1] + 10;
//		arr[2] = arr[2] + 10;
//		arr[3] = arr[3] + 10;
//		arr[4] = arr[4] + 10;
		//System.out.println(arr[0] + "\n" + arr[1] + "\n" );

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 10;
			System.out.println(arr[i]);
		}
		return nums; // 값 반환
	}

}
