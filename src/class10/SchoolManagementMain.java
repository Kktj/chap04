package class10;

import class10.vo.Professor;
import class10.vo.Student;
import class10.vo.Department;
import class10.vo.Takes;
import class10.vo.MakeData;

/**
 * 학사 행정 실행 클래스
 * - 특징으로는 두 개의 객체를 조인해서 결과를 뽑아낸다.(학생정보 + 학과정보)
 */

public class SchoolManagementMain {
	
	public static void main(String[] args) {
		
		MakeData md = new MakeData();
		Student[] students = md.students;
		Department[] departments = md.departments;
		Takes[] takArr = md.takArr;
		Professor[] proArr = md.proArr;
		
		 // 컴퓨터공학과 교수들을 모두 조회
		 String searchDept = "컴퓨터공학과";
		 int dId = 0; // 컴퓨터공학과의 id 저장용 변수
		 System.out.println("================== 컴퓨터 공학과 교수 ==================");
		 for (Department department : departments) {
			if (department.getName().equals(searchDept)) {
				dId = department.getId(); // 컴퓨터 공학과의 id 추출 920
			}
					
		}
		 for (Professor professor : proArr) {
			if (professor.getDepartment() == dId) {
				System.out.println(professor.getId() + "\t" + professor.getJumin() + "\t" + professor.getName() + "\t" + professor.getGrade() + "\t" + professor.getHiredate());
			}
		}
		 System.out.println();
		 
		 // 학생 데이터 , 성적 데이터 이용해서 출력
		 System.out.println("======================== 학생 , 성적 데이터 이용 출력 ========================");
		 for (Student student : students) {
			for (Takes takes : takArr) {
				if (student.getId().equals(takes.getId())) {
					System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getJumin() + "\t" + student.getYear() + "\t" + student.getAddress() + "\t" + student.getDepartment() + "\t" + takes.getSubject() + "\t" + takes.getScore());
				}
			}
		}
		 System.out.println();
			
		// 코드 초기화
		int code = 0;
		System.out.println("========================= 학생 , 학과 데이터 이용 출력 ==========================");
		for (Student student : students) {
			code = student.getDepartment();
			for (Department department : departments) {
				if (code == department.getId()) {
					System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getJumin() + "\t" + student.getYear() + "\t" + student.getAddress() + "\t" + code + "\t" + department.getName());
				} // if e
			} // for e
		} // for e
	} // main e

} // class e
