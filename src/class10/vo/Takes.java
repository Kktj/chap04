package class10.vo;

public class Takes {
	
	private String id;
	private String subject;
	private String score;
	
	// 기본 생성자(필드 초기화 역할)
	public Takes() {
		
	}
	
	// 오버로딩 생성자(메소드 처럼 보이지만 메소드 아님)
	public Takes(String id , String subject , String score) {
		this.id = id;
		this.subject = subject;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
		

}
