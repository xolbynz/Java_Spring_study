package spring.ui;

import spring.Exam;

public class InlineExamConsole implements ExamConsole {
	
	private Exam exam;
	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("total is %d, avg is %f",exam.total(),exam.avg());

	}

public InlineExamConsole() {
	// TODO Auto-generated constructor stub
}
	public InlineExamConsole(Exam exam) {
		super();
		this.exam = exam;
	}
	
	public Exam setExam() {
		
		return exam;
		
	}
	
	

}
