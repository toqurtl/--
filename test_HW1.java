import src.School;
import src.Student;
import src.Class;
import java.util.HashMap;
import java.io.File;

public class test_HW1 {

    public static void main(String[] args){

        //[1]Input    
        School school = new School("class.csv", "teacher.csv", "student.csv");
        HashMap<Integer, Student> temp = school.student_map;

  		//[2]Process    
        //국어  
        int rank_id_kor = 1; //첫번째 학생 id
        for(int i=2;i<temp.size();i++){ //비교 대상 학생 id
            int student_id_kor = temp.get(i).id; 
            Student pre_student_kor = temp.get(rank_id_kor);
            Student new_student_kor = temp.get(student_id_kor);
            double pre_score_kor = pre_student_kor.score_map.get("국어"); //점수
            double new_score_kor = new_student_kor.score_map.get("국어");
            if(pre_score_kor<new_score_kor){
                rank_id_kor = student_id_kor;
            } 
            else{
            }           
        }
        //영어
        int rank_id_eng = 1; //첫번째 학생 id
        for(int i=2;i<temp.size();i++){ //비교 대상 학생 id
            int student_id_eng = temp.get(i).id; 
            Student pre_student_eng = temp.get(rank_id_eng);
            Student new_student_eng = temp.get(student_id_eng);
            double pre_score_eng = pre_student_eng.score_map.get("영어"); //점수
            double new_score_eng = new_student_eng.score_map.get("영어");
            if(pre_score_eng<new_score_eng){
                rank_id_eng = student_id_eng;
            } 
            else{
            }           
        }
        //수학
        int rank_id_math = 1; //첫번째 학생 id
        for(int i=2;i<temp.size();i++){ //비교 대상 학생 id
            int student_id_math = temp.get(i).id; 
            Student pre_student_math = temp.get(rank_id_math);
            Student new_student_math = temp.get(student_id_math);
            double pre_score_math = pre_student_math.score_map.get("수학"); //점수
            double new_score_math = new_student_math.score_map.get("수학");
            if(pre_score_math<new_score_math){
                rank_id_math = student_id_math;
            } 
            else{
            }           
        }
        //수학
        int rank_id_sci = 1; //첫번째 학생 id
        for(int i=2;i<temp.size();i++){ //비교 대상 학생 id
            int student_id_sci = temp.get(i).id; 
            Student pre_student_sci = temp.get(rank_id_sci);
            Student new_student_sci = temp.get(student_id_sci);
            double pre_score_sci = pre_student_sci.score_map.get("과학"); //점수
            double new_score_sci = new_student_sci.score_map.get("과학");
            if(pre_score_sci<new_score_sci){
                rank_id_sci = student_id_sci;
            } 
            else{
            }           
        }
        


		//[3]Output

        System.out.print("   학생id"+" 학생이름"+" 반id"+" 반이름"+" 점수");
        System.out.println();
		System.out.print("국어 "+ rank_id_kor);
        Student pre_student_kor = temp.get(rank_id_kor);
        String rank_id_name_kor = pre_student_kor.name;
        double rank_id_score_kor = pre_student_kor.score_map.get("국어");
        int rank_id_class_kor = pre_student_kor.c.id;
        String rank_id_classname_kor = pre_student_kor.c.name;
		System.out.print("  "+rank_id_name_kor);
		System.out.print("  "+rank_id_class_kor);
        System.out.print("  "+rank_id_classname_kor);
        System.out.print("  "+rank_id_score_kor);

        System.out.println();
        System.out.print("영어 " + rank_id_eng);
        Student pre_student_eng = temp.get(rank_id_eng);
        String rank_id_name_eng = pre_student_eng.name;
        double rank_id_score_eng = pre_student_eng.score_map.get("영어");
        Class rank_id_class_eng = pre_student_eng.c;		
        String rank_id_classname_eng = rank_id_class_eng.name;
        System.out.print("  "+rank_id_name_eng);
        System.out.print("  "+rank_id_class_eng);
        System.out.print("  "+rank_id_classname_eng);
        System.out.print("  "+rank_id_score_eng);

        System.out.println();
        System.out.print("수학 " + rank_id_math);
        Student pre_student_math = temp.get(rank_id_math);
        String rank_id_name_math = pre_student_math.name;
        double rank_id_score_math = pre_student_math.score_map.get("수학");
        Class rank_id_class_math = pre_student_math.c;		
        String rank_id_classname_math = rank_id_class_math.name;
        System.out.print("  "+rank_id_name_math);
        System.out.print("  "+rank_id_class_math);
        System.out.print("  "+rank_id_classname_math);
        System.out.print("  "+rank_id_score_math);

        System.out.println();
        System.out.print("과학 " + rank_id_sci);
        Student pre_student_sci = temp.get(rank_id_sci);
        String rank_id_name_sci = pre_student_sci.name;
        double rank_id_score_sci = pre_student_sci.score_map.get("과학");
        Class rank_id_class_sci = pre_student_sci.c;		
        String rank_id_classname_sci = rank_id_class_sci.name;
        System.out.print("  "+rank_id_name_sci);
        System.out.print("  "+rank_id_class_sci);
        System.out.print("  "+rank_id_classname_sci);
        System.out.print("  "+rank_id_score_sci);

    }
}