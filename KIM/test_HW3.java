import java.util.HashMap;
import src.School;
import src.Student;
import src.Class;


public class test_HW3{

	public static void main(String[] args){
		School school = new School("class.csv", "teacher.csv", "student.csv");
		HashMap<Integer, Student> temp = school.student_map;
		
        double sum = 0.0;
        double avg = 0.0;
        double maxavg = 0.0;
        int max_id = 0;

    
        for(int rank=1;rank<6;rank++){

            for(int i=1;i<=temp.size();i++){

                if (temp.get(i) != null) {    
                    //학생정보
                    Student student = temp.get(i);
                    //전과목 평균 점수
                    double score = sum + student.score_map.get("국어") + student.score_map.get("영어") + student.score_map.get("수학") + student.score_map.get("과학");
                    avg = score/4;


                    if (maxavg<avg) {
                        maxavg = avg;
                        max_id = i;
                    }

                    else{

                    }
                }
            }    


        Student student = temp.get(max_id);
        System.out.println(rank + "등" 
            + " 학생ID:"+ student.id 
            + " 학생이름:" + student.name
            + " 반ID:"+ student.c.id 
            + " 반이름:" + student.c.name 
            + " 평균점수:"+ maxavg
            + " 국:" + student.score_map.get("국어")
            + " 영:" + student.score_map.get("영어")
            + " 수:" + student.score_map.get("수학")
            + " 과:" + student.score_map.get("과학"));

        // 최고 등수의 학생 temp에서 삭제
        temp.remove(max_id);
        // 최고 등수 아이디 0으로
        max_id = 0;
        // 최고 등수 평균 0으로
        maxavg = 0;

        }

    }
    
}   
    
