package class01;

/**
 * 실행클래스
 */

public class FruitMain {

	public static void main(String[] args) {
		
		// 객체 한개 생성	   // 필드 초기화
		Fruit peach = new Fruit();
		peach.setName("복숭아");
		peach.setPrice(6500);
		peach.setQuantity(5);
		
		// 메소드
		printFruit(peach);
		
		// 과일 객체 5개 생성
		Fruit apple = new Fruit("사과" , 2000 , 5);
		Fruit mango = new Fruit("망고" , 1000 , 2);
		Fruit banna = new Fruit("바나나" , 2500 , 3);
		Fruit pineapple = new Fruit("파인애플" , 5000 , 1);
		Fruit orange = new Fruit("오렌지" , 6000 , 4);
		
		// 과일 객체 5개 전달해서 받아서 출력하는 메소드
		printFruit(apple , mango , banna , pineapple , orange);
		
		Fruit[] fruitArr = new Fruit[5];
		fruitArr[0] = new Fruit("사과" , 2000 , 5);
		fruitArr[1] = new Fruit("망고" , 1000 , 2);
		fruitArr[2] = new Fruit("바나나" , 2500 , 3);
		fruitArr[3] = new Fruit("파인애플" , 5000 , 1);
		fruitArr[4] = new Fruit("오렌지" , 6000 , 4);
		
		printFruit(fruitArr);
		
		
		// "사과" , 2000 , 5 apple
		// "망고" , 1000 , 2 mango
		// "바나나" , 2500 , 3 banna
		// "파인애플" , 5000 , 1 pineapple
		// "오렌지" , 6000 , 4 orange
		
	}

	private static void printFruit(Fruit peach) {
		System.out.println(peach.getName());
		System.out.println(peach.getPrice());
		System.out.println(peach.getQuantity());
	}
	
	private static void printFruit(Fruit apple , Fruit mango , Fruit banna , Fruit pineapple , Fruit orange) {
		System.out.printf(apple.getName() + "\t" + apple.getPrice() + "\t" + apple.getQuantity() + "\n");
		System.out.printf(mango.getName() + "\t" + mango.getPrice() + "\t" + mango.getQuantity() + "\n");
		System.out.printf(banna.getName() + "\t" + banna.getPrice() + "\t" + banna.getQuantity() + "\n");
		System.out.printf(pineapple.getName() + "\t" + pineapple.getPrice() + "\t" + pineapple.getQuantity() + "\n");
		System.out.printf(orange.getName() + "\t" + orange.getPrice() + "\t" + orange.getQuantity());
		System.out.println();
	}
	
	private static void printFruit(Fruit[] fruitArr) {
		for (int i = 0; i < fruitArr.length; i++) {
			System.out.println(fruitArr[i].getName() + "\t" + fruitArr[i].getPrice() + "\t" + fruitArr[i].getQuantity());
		}
		
		// 향상된 for문
		// for (Fruit fruit : fruitArr) {
			// System.out.println(fruit.getName() + "\t" + fruit.getPrice() + "\t" + fruit.getQuantity());
		// }
		
	}

}
