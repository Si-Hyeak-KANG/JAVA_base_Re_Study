package school;

public class Score {

	int studentId;  						//�й�
	Subject subject;						//����
	int point;								//����
	
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

	public Subject getSubject() {
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
		return "�й�:" + studentId + ", " + subject.getSubjectName() + ":" + point;
	}
}
