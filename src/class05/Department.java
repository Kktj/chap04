package class05;

public class Department {
	
	// 필드(멤버 변수 , 인스턴스 변수)
	private int id;
	private String name;
	private String office;
	
	// 기본 생성자(필드 초기화 역할)
	public Department() {
		
	}
	
	// 오버로딩 생성자(메소드 비슷하지만 메소드 아님)
	public Department(int id , String name , String office) {
		this.id = id;
		this.name = name;
		this.office = office;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}
		

}
