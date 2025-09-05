package Day9_AdavanceOOp;
abstract class Student {
	abstract void CalculateGrade(int marks);
}
class HighSchoolStudent extends Student {
	public void CalculateGrade(int marks) { 
		if (marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 75) { 
			System.out.println("Grade B");
		}
		else {
			System.out.println("Grade C");
		}
	}
}
public class StudentGradeDemo {
	public static void main(String[] args) {
		HighSchoolStudent s = new HighSchoolStudent();
		s.CalculateGrade(97);
	}
}
