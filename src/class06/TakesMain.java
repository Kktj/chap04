package class06;

/**
 * 실행클래스
 */

public class TakesMain {

	public static void main(String[] args) {
		
		TakesData td = new TakesData();
		Takes[] takArr = td.takArr;
		
		// initData(takArr);
		
		// 1. 전학생 성적 출력 (toString)메소드 이용)
		printTakes(takArr);
		
		// 2. 성적이 "A+"인 학생의 id를 반환받아서 출력하세요
		String[] names = getAplus(takArr);
		for (String string : names) {
			System.out.println(string);
		}
		
	}

	private static String[] getAplus(Takes[] takArr) {
		String names = "";
		for (Takes takes : takArr) {
			if (takes.getScore().equals("A+")) {
				names += takes.getId() + ",";
			}
		}
		String[] arrName = names.split(",");
		return arrName;	
		
	}

	private static void printTakes(Takes[] takArr) {
		
		for (Takes takes : takArr) {
			System.out.println(takes.getId() + "\t" + takes.getSubject() + "\t" + takes.getScore());
		}
		
	}
	
	// 성적 데이터 생성
	private static void initData(Takes[] takArr) {
		// 성적 객체를 생성하면서 배열에 바로 저장
		
		
	}

}
