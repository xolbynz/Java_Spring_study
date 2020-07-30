package spring;

import spring.ui.ExamConsole;
import spring.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Exam exam = new NewlecExam();
		
		ExamConsole console= new InlineExamConsole(exam);
		console.print();
		
	
	}

}
