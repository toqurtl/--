
import java.util.ArrayList;
import java.util.HashMap;

import src.School;
import src.Teacher;
import src.Class;

public class HW2_answer {
    
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
}
