
import java.util.ArrayList;
import java.util.HashMap;

import src.School;
import src.Teacher;
import src.Class;


public class Test {

    // for문 쓰는법 -> 두개
    // 일반적인 for문
    // Hashmap, ArrayList -> COllection -> Collection을 for문돌

    //Hashmap, ArrayLIst -> 이것을 선언하는 것-> 이 안에 어떤 메소드들

    // Input/OUtput -> csv를 읽고 쓰는 것
   
    public static void main(String[] args){   
        School school = new School("class.csv", "teacher.csv", "student.csv");
        ArrayList<String> subject_name_list = new ArrayList<String>();
        subject_name_list.add("국어");
        subject_name_list.add("영어");
        subject_name_list.add("수학");
        subject_name_list.add("과학");
        System.out.print("   ,전체,");
        for(String subject_name: subject_name_list){
            System.out.print(subject_name+",");
        }
        System.out.println(); 
        for(Class c: school.class_map.values()){
            System.out.print(c.name+"반,");
            System.out.print(c.total_average_score()+",");
            for(String subject_name: subject_name_list){
                System.out.print(c.average_score(subject_name)+",");
            }
            System.out.println();         
            
        }

        
    }

    public static String fuck(int a){

        return "test"+a;
    }

    // HW0
    // 제 코드를 이해하십쇼
    // school 생성자-> csv파일을 읽어서 hashmap다가 다 집어넣는게

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
