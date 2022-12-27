
// import src.Class;
import src.School;
//import src.Student;
//import src.Teacher;
import java.util.Scanner;
import java.util.ArrayList;




    // HW3 난이도 3
    // 전체 평균점수 기준 1등부터 30등까지 나열

public class JJ_Test_3 {  // 테스트라는 클래스를 생성

        public static void main(String[] args) {
        School school = new School("class.csv", "teacher.csv" , "student.csv");
 
        double test_Ko = school.subject_average("국어"); 
        double test_Ma = school.subject_average("수학"); 
        double test_En = school.subject_average("영어"); 
        double test_Sc = school.subject_average("과학");

        double test_avg_all = ((test_Ko + test_Ma + test_En + test_Sc) / 4);

        System.out.println(school.class_map.values());

        ArrayList<Double> avgs = new ArrayList<>(); // ArrayList 생성 @@@@@
        avgs.add(test_avg_all);


        String InputClassName = null;
        Scanner sc = new Scanner(System.in);
        sc.close(); // 스캐너 항상 클로즈
		InputClassName = sc.nextLine();
        double test1 = school.subject_average(InputClassName); // School의 subject_average 함수가 호출되어야 함
        System.out.println(InputClassName + "과목의 평균값은 " + test1 + "입니다"); // 학생의 평균값 도출

        // 30명 중에 1등 뽑고 1명 지우고 29명 하고 하는 식으로 진행행 / arraylist
        
    }


}

