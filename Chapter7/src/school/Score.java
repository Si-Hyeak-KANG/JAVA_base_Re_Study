package school;

public class Score {

	int studentId;  						//학번
	Subject subject;						//과목
	int point;								//점수
	
	public Score(int studentId, Subject subject, int point) {
		
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public Subject getSubjet() {
		return subject;
	}

	public void setSubjet(Subject subjet) {
		this.subject = subjet;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public String toString() {
		return "학번:" + studentId + ", " + subject.getSubjectName() + ":" + point;
	}
}
