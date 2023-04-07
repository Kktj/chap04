package class02;

public class ProfessorMain {

	public static void main(String[] args) {
		
		// Professor type Array 선언
		Professor[] proArr = new Professor[6];
		proArr[0] = new Professor("92001", "590327-1839240", "이태규", 920, "교수", "1997");
		proArr[1] = new Professor("92002", "690702-1350026", "고희석", 910, "부교수", "2003");
		proArr[2] = new Professor("92301", "741011-2765501", "최성희", 910, "부교수", "2005");
		proArr[3] = new Professor("92302", "750728-1102458", "김태석", 920, "교수", "1999");
		proArr[4] = new Professor("92501", "620505-1200546", "박철재", 900, "조교수", "2007");
		proArr[5] = new Professor("92502", "740101-1830264", "장민석", 910, "부교수", "2005");
		
		// 교수들의 목록을 출력해주는 메소드를 만드세요
		printProfessor(proArr);
		
		// 910 학과 교수 중 입사년도가 2005년인 교수는
		getHireDate2005(proArr);
		
		// 선명규 교수 정보
		newProfessor(proArr);
		// 주민번호가 590327-1839240인 이태규 교수가 퇴직했다.
		// 새로 입사한 선명규 교수를 그 자리에 저장 하세요.
		// (빈 객체 생성 후 setter 메소드로 값 저장)
		// "96031" , "790208-1884203" , "선명규" , 920 , "부교수" , "2021"
		

	} // main e
	
	// 이태규 교수를 찾아서 새로운 교수로 변경(접근제한자 private -> public)
	private static void newProfessor(Professor[] proArr) {
		// 전체 배열에서 이태규 교수 찾기
		for (int i = 0; i < proArr.length; i++) {
			// 이태규 교수 객체이면
			if ((proArr[i].getJumin().equals("590327-1839240")) && (proArr[i].getName().equals("이태규"))) {
				Professor sun = new Professor();
				sun.setId("96031");
				sun.setJumin("790208-1884203");
				sun.setName("선명규");
				sun.setDepartment(920);
				sun.setGrade("부교수");
				sun.setHiredate("2021");
				// 기존 이태규 교수 자리에 새로운 선명규 교수 객체 저장
				proArr[i] = sun;
			}
		}
		
		// 바뀐 교수 명단 출력
		printProfessor(proArr);
	}

	// 910 학과 교수 중 입사년도가 2005년인 교수는
	private static void getHireDate2005(Professor[] proArr) {
		for (Professor professor : proArr) {
			if ((professor.getDepartment() == 910) && (professor.getHiredate().equals("2005")) ) {
				System.out.println(professor.getName());
				// System.out.printf("%s %s %s %d %s %s %n" , professor.getId() , professor.getJumin() , professor.getName() , professor.getDepartment() , professor.getGrade() , professor.getHiredate());
			}
		}
	}
	
	// 교수들의 목록을 출력해주는 메소드
	private static void printProfessor(Professor[] proArr) {
		for (Professor professor : proArr) {
			System.out.println(professor.getId() + "\t" + professor.getJumin() + "\t" + professor.getName() + "\t" + professor.getDepartment() + "\t" + professor.getGrade() + "\t" + professor.getHiredate());
		}
	}

} // class e
