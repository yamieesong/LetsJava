package manager.entity;

/**
 * List<Student>
 * 
 * Student 학생 클래스
 * Tip)우클릭>Source>Generate Constructor using Fields
 */
public class Student {

	/**학생코드*/
	private int stdNo;
	/**학생이름*/
	private String name;
	/**학년*/
	private String grade;
	/**평균점수*/
	private int score;
	/**입력일시*/
	private String insertDt;
	/**수정일시*/
	private String updateDt;
	
	public Student(int stdNo, String name, String grade, int score, String insertDt, String updateDt) {
		this.stdNo = stdNo;
		this.name = name;
		this.grade = grade;
		this.score = score;
		this.insertDt = insertDt;
		this.updateDt = updateDt;
	}
	
	public Student(String name, String grade, int score) {
		this(0,name,grade,score,null,null);					//위에서 받은 값을 재활용
	}
	
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getInsertDt() {
		return insertDt;
	}
	public void setInsertDt(String insertDt) {
		this.insertDt = insertDt;
	}
	public String getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(String updateDt) {
		this.updateDt = updateDt;
	}
}
