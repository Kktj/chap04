package class03;

public class StudentMain { // class s

	public static void main(String[] args) { // main s
		
		Student[] stuArr = new Student[8];
		
		// 학생 데이터를 생성 메소드
		initData(stuArr);
		
		// 학생 목록을 출력하는 메소드
		printStudent(stuArr);
		
		// 여학생들의 명단을 출력하세요
		printWomanStudent(stuArr);
		
		// 서울에 사는 3학년 학생들의 이름을 구해주는 메소드를 만들고
		// 반환받은 이름을 main 메소드에서 출력하세요
		getSeoulStudent(stuArr);
		String[] strName = getSeoulStudent(stuArr); // 반환받은 문자열 배열 저장
		for (String string : strName) {
			System.out.println(string);
		}
		
		
	} // main e
	
	// 서울 사는 3학년 학생들 이름을 구해서 반환하는 메소드
	private static String[] getSeoulStudent(Student[] stuArr) {
		String arrName = "";
		for (Student student : stuArr) {
			if ((student.getAddress().equals("서울")) && (student.getYear() == 3)) {
				arrName += student.getName() + ",";
			}	
		}
		String[] resultName = arrName.split(",");
		return resultName;
}

	private static void printWomanStudent(Student[] stuArr) {
		System.out.println("===================== 여학생 명단 ======================");
		for (Student student : stuArr) {
			if (student.getJumin().substring(7,8).equals("2")) {
				System.out.println(student.getId() + "\t" + student.getJumin() + "\t" + student.getName() + "\t" + student.getYear() + "\t" + student.getAddress() + "\t" + student.getDepartment());
			}
		}
}

	// 학생 목록을 출력해주는 메소드
	private static void printStudent(Student[] stuArr) {
	
		for (Student student : stuArr) {
			System.out.println(student.getId() + "\t" + student.getJumin() + "\t" + student.getName() + "\t" + student.getYear() + "\t" + student.getAddress() + "\t" + student.getDepartment());
		}
		System.out.println();
}

	// 학생 데이터를 생성해주는 메소드
	private static void initData(Student[] stuArr) { // initData s
		
		stuArr[0] = new Student("1292001", "900424-1825409", "김광식", 3, "서울", 92);
		stuArr[1] = new Student("1292002", "900305-1730021", "김정현", 3, "서울", 20);
		stuArr[2] = new Student("1292003", "891021-2308302", "김현정", 4, "대전", 55);
		stuArr[3] = new Student("1292301", "890902-2704012", "김현정", 2, "대구", 78);
		stuArr[4] = new Student("1292303", "910715-1524390", "박광수", 3, "광주", 54);
		stuArr[5] = new Student("1292305", "921011-1809003", "김우주", 4, "부산", 88);
		stuArr[6] = new Student("1292501", "900825-1506390", "박철수", 3, "대전", 73);
		stuArr[7] = new Student("1292502", "911011-1809003", "백태성", 3, "서울", 95);
		
		
	} // initData e

} // class e
