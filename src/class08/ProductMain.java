package class08;


public class ProductMain {

	public static void main(String[] args) {
		
		// 데이터를 생성해주는 객체 생성
		ProductData pd = new ProductData();
		Product[] products = pd.products;
		
		// [문제.1] 전체 상품 목록 출력
		printProduct(products);
		
		// [문제.2] 세탁기의 가격을 조회하시오
		String tempStr = "세탁기";
		getWashPrice(tempStr , products);
		
		// [문제.3] 구매한 모든 제품의 총액과 평균 가격을 main 메소드에서 출력하세요.
		int sum = getTotalAmount(products);
		double avg = getAvg(products);
		System.out.printf("구매하신 제품의 총액은 %d 원이며 평균 구매 가격은 %.2f 원입니다." , sum , avg);
		System.out.println();
		
		// [문제.4] 제품 중에서 100만원이 넘는 제품의 목록 , 수량 , 합계 금액 출력
		getProductGrather100(products);

	}

	private static void getProductGrather100(Product[] products) {
		int count = 0;
		int sum = 0;
		System.out.println("가격이 100만원 이상인 제품은 다음과 같습니다.");
		for (Product product : products) {
			if (product.getPrice() >= 1000000) {
				sum += product.getPrice(); // 100만원이 넘는 구매 제품의 금액 합산
				count ++; // 100만원이 넘는 구매 제품 갯수 합산
				System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
				
			}
		}
		System.out.printf("100만원 이상인 제품의 수량은 : %s개 이며 합계 금액은 : %s 원입니다." , count , sum);
	}

	private static double getAvg(Product[] products) {
		int sum = 0;
		double avg = 0.0;
		for (Product product : products) {
			sum += product.getPrice() ; 
			
		}
		avg = (sum * 1.0) / products.length;
		return avg;
	}	

	private static int getTotalAmount(Product[] products) {
		int sum = 0;
		for (Product product : products) {
			sum += product.getPrice();
			
		}
		return sum;
	}
	
	// 세탁기 가격 구하는 메소드(제품명을 파라미터로 받고 있음)
	private static void getWashPrice(String tempStr, Product[] products) {
		for (Product product : products) {
			if (product.getName().equals(tempStr)) {
				System.out.println("세탁기의 가격은 : " + product.getPrice());
			}
		}
	}

	private static void printProduct(Product[] products) {
		for (Product product : products) {
			System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
		}
	}

}
