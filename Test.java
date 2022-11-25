
import src.School;


public class Test {

   
    public static void main(String[] args){    
    
        School school = new School("class.csv", "teacher.csv", "student.csv");
        System.out.println(school.subject_average("국어"));
        
    }

    // HW1 난이도 1
    public static void save_result(){
        // 과목별 1등 학생의 id, 이름, 반, 점수가 무엇인지 csv형태로 정리
    }

    // HW2 난이도 2
    public static void save_result_2(){
        // 반별 과목 및 전체 평균 비교
    }

    // HW3 난이도 3
    public static void save_result_3(){
        // 전체 평균점수 기준 1등부터 30등까지 나열
    }


}
