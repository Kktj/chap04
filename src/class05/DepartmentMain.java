package class05;

/**
 * 실행클래스
 */


public class DepartmentMain {

	public static void main(String[] args) {
		
		// DepartmentData 객체 생성
		DepartmentData dd = new DepartmentData(); // DepartmentData 객체의 주소가 dd 저장
		Department[] departments = dd.departments; // DepartmentData 객체의 필드를 갖고옴
		
		// 기초 데이터 생성
		// initData(depArr);
		
		// 학과 목록을 출력하세요
		printDepartment(departments);
		
		// 학과 코드(id)가 "923"인 학과의 코드(id) , name , office를 출력하세요
		getDepartment(departments);
		
		// 컴퓨터공학과의 교실을 조회해서 main메소드에서 출력하세요.
		String strOffice = getOffice(departments);
		System.out.println("컴퓨터공학과의 교실은 : " + strOffice + "입니다");
		

	} // main e
	
	// 컴퓨터공학과 교실 조회하는 메소드
	private static String getOffice(Department[] departments) { // getOffice s
		String offices = "";
		for (Department department : departments) {
			if (department.getName().equals("컴퓨터공학과")) {
				offices = department.getOffice();
			}
		}
		return offices;
		
	} // getOffice e
	
	// 학과코드 923인 name , office 출력하는 메소드
	private static void getDepartment(Department[] departments) { // getDepartment s
		for (Department department : departments) {
			if (department.getId() == 923) {
				System.out.println(department.getId() + "\t" +department.getName() + "\t" +department.getOffice());
			}
		}
		
	} // getDepartment e

	private static void printDepartment(Department[] departments) { // printDepartment s
		for (Department department : departments) {
			System.out.println(department.getId() + "\t" + department.getName() + "\t" + department.getOffice());
		}
	} // printDepartment e

	private static void initData(Department[] depArr) { // initData s
		
		
		
	} // initData e

} // class e
