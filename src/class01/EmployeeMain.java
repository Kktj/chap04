package class01;

/**
 * 실행클래스
 */

public class EmployeeMain { // class s

	public static void main(String[] args) { // main s
		
		// Employee type Array 선언(10칸)
		Employee[] empArr = new Employee[10];
		empArr[0] = new Employee("A" , 28 , 400 , "KR" , 10 , "정규");
		empArr[1] = new Employee("B" , 27 , 600 , "KR" , 15 , "정규");
		empArr[2] = new Employee("C" , 26 , 280 , "JP" , 1 , "비정규");
		empArr[3] = new Employee("D" , 25 , 360 , "JP" , 2 , "비정규");
		empArr[4] = new Employee("E" , 23 , 270 , "RU" , 1 , "정규");
		empArr[5] = new Employee("F" , 27 , 390 , "AM" , 4 , "정규");
		empArr[6] = new Employee("G" , 31 , 330 , "SI" , 3 , "정규");
		empArr[7] = new Employee("H" , 35 , 280 , "CA" , 2 , "비정규");
		empArr[8] = new Employee("I" , 38 , 450 , "FR" , 10 , "정규");
		empArr[9] = new Employee("J" , 45 , 600 , "JP" , 15 , "정규");
		
		// 1. 배열을 받아서 전사원 목록을 출력해주는 메소드
		System.out.println("1. 전 사원들의 목록");
		printEmployee(empArr);
		System.out.println();
		
		// 2. 정규직 평균급여를 구해주는 메소드 생성(결과 반환)
		double avg = getSalAvg(empArr);
		// 출력 결과 : 2. 정규직 직원들의 평균 급여는 : 434.29		// round=static
		System.out.println("2. 정규직 직원들의 평균 급여는 : " + Math.round(avg * 100) / 100.0);
		System.out.println();
		
		// 3. 한국 사원들의 평균 급여
		double avg1 = korGetSalAvg(empArr);
		// 3-1 출력 결과 : 500.0
		System.out.println("3. 한국 사원들의 평균 급여는 : " + Math.round(avg1 * 100) / 100.0);
		
		
	} // main e
	
	// 한국 사원들의 평균급여를 구해주는 메소드 생성
	private static double korGetSalAvg(Employee[] empArr) {
		int sum = 0;
		int count = 0;
		double korSalAvg = 0.0;
		for (Employee emp1 : empArr) {
			if (emp1.getLocal().equals("KR")) {
				sum += emp1.getSalary();
				count ++;
			}
		}
		korSalAvg = (double) sum / count;
		return korSalAvg;
}


	// 전 사원의 목록 출력 메소드
	private static void printEmployee(Employee[] empArr) {
		// 일반 for문
		for (int i = 0; i < empArr.length; i++) {
			System.out.println(empArr[i].getName() + "\t" + empArr[i].getAge() + "\t" + empArr[i].getSalary() + "\t" + empArr[i].getLocal() + "\t" + empArr[i].getTerms() + "\t" + empArr[i].getGubun());
		}
		// 향상된 for문
		for (Employee employee : empArr) {
			System.out.println(employee.getName() + "\t" + employee.getAge() + "\t" + employee.getSalary() + "\t" + employee.getLocal() + "\t" + employee.getTerms() + "\t" + employee.getGubun());
		}
	}
	
	// 정규직 평균급여를 구해주는 메소드 생성
	private static double getSalAvg(Employee[] empArr) {
		int sum = 0;
		int count = 0;
		double salAvg = 0.0;
		for (Employee emp : empArr) {
			if (emp.getGubun().equals("정규")) {
				sum += emp.getSalary();
				count ++;
				
			}
		}
		salAvg = (double) sum / count;
		return salAvg;
	}

} // class e
