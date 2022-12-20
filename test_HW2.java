import java.util.HashMap;
import src.School;
import src.Student;
import src.Class;


public class test_HW2{

	public static void main(String[] args){
		School school = new School("class.csv", "teacher.csv", "student.csv");
		HashMap<Integer, Student> temp = school.student_map;

		double sum = 0.0;
		double avg = 0.0;
		double totalkorean = 0.0;
		double totalenglish = 0.0;
		double totalmath = 0.0;
		double totalscience = 0.0;

		double first_totalkorean = 0.0;
		double first_totalenglish = 0.0;
		double first_totalmath = 0.0;
		double first_totalscience = 0.0;
		int first_class = 0;

		double second_totalkorean = 0.0;
		double second_totalenglish = 0.0;
		double second_totalmath = 0.0;
		double second_totalscience = 0.0;
		int second_class = 0;

		double third_totalkorean = 0.0;
		double third_totalenglish = 0.0;
		double third_totalmath = 0.0;
		double third_totalscience = 0.0;
		int third_class = 0;
		

		for(Student s :temp.values()){
			//전체 과목 별 평균
			totalkorean += s.score_map.get("국어");
			totalenglish += s.score_map.get("영어");
			totalmath += s.score_map.get("수학");
			totalscience += s.score_map.get("과학");
			//1반 과목 별 평균
			if (s.c.id == 1){
				first_totalkorean += s.score_map.get("국어");
				first_totalenglish += s.score_map.get("영어");
				first_totalmath += s.score_map.get("수학");
				first_totalscience += s.score_map.get("과학");
				first_class = first_class + 1;
			//2반 과목 별 평균
			} else if (s.c.id == 2){
				second_totalkorean += s.score_map.get("국어");
				second_totalenglish += s.score_map.get("영어");
				second_totalmath += s.score_map.get("수학");
				second_totalscience += s.score_map.get("과학");
				second_class = second_class + 1;
			//3반 과목 별 평균
			} else if (s.c.id == 3){
				third_totalkorean += s.score_map.get("국어");
				third_totalenglish += s.score_map.get("영어");
				third_totalmath += s.score_map.get("수학");
				third_totalscience += s.score_map.get("과학");
				third_class = third_class + 1;
			}
		}
		
		//전체 평균
		System.out.print("     국어 "+" 영어 "+" 수학 "+" 과학");
		//System.out.printf("%.2f ", totalkorean/30);
		//System.out.printf("%.2f ", totalenglish/temp.size());
		//System.out.printf("%.2f ", totalmath/temp.size());
		//System.out.printf("%.2f ", totalscience/temp.size());
		//1반 학생 평균
		System.out.println();
		System.out.print("1반 ");
		System.out.printf("%.2f ", first_totalkorean/first_class);
		System.out.printf("%.2f ", first_totalenglish/first_class);
		System.out.printf("%.2f ", first_totalmath/first_class);
		System.out.printf("%.2f ", first_totalscience/first_class);
		//2반 학생 평균
		System.out.println();
		System.out.print("2반 ");
		System.out.printf("%.2f ", second_totalkorean/second_class);
		System.out.printf("%.2f ", second_totalenglish/second_class);
		System.out.printf("%.2f ", second_totalmath/second_class);
		System.out.printf("%.2f ", second_totalscience/second_class);
		//3반 학생 평균
		System.out.println();
		System.out.print("3반 ");
		System.out.printf("%.2f ", third_totalkorean/third_class);
		System.out.printf("%.2f ", third_totalenglish/third_class);
		System.out.printf("%.2f ", third_totalmath/third_class);
		System.out.printf("%.2f", third_totalscience/third_class);


	

	}
}




