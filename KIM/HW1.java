import src.School;
import src.Student;
import java.util.HashMap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class HW1 {
    public static void main(String[] args){

        //[1]Input    
        School school = new School("class.csv", "teacher.csv", "student.csv");
        HashMap<Integer, Student> temp = school.student_map;
        int kor_id = 0;
        double kor_socre = 0.0;  
        int eng_id = 0;
        double eng_socre = 0.0;
        int math_id = 0;
        double math_socre = 0.0;
        int sci_id = 0;
        double sci_socre = 0.0;
        
  		//[2]Process 
        for(int i=1;i<temp.size();i++){
        Student student = temp.get(i);
            if (kor_socre < student.score_map.get("국어")) {
            kor_id = student.id;
            kor_socre = student.score_map.get("국어");
            }
            if (eng_socre < student.score_map.get("영어")) {
            eng_id = student.id;
            eng_socre = student.score_map.get("영어");
            }
            if (math_socre < student.score_map.get("수학")) {
            math_id = student.id;
            math_socre = student.score_map.get("수학");
            }
            if (sci_socre < student.score_map.get("과학")) {
            sci_id = student.id;
            sci_socre = student.score_map.get("과학");
            }
        }
        
		//[3]Output
        System.out.print("    학생Id"+" 학생이름"+" 반id"+" 반이름"+" 점수");
        System.out.println();
        for(int i=1;i<temp.size();i++){
        Student student = temp.get(i);
            if (kor_id == student.id) {
            System.out.println("국어: " + student.id + "     " + student.name + "     " + student.c.id + "     " + student.c.name + "   " + kor_socre);
            }
        }
        for(int i=1;i<temp.size();i++){
        Student student = temp.get(i);
            if (eng_id == student.id) {
            System.out.println("영어: " + student.id + "     " + student.name + "     " + student.c.id + "     " + student.c.name + "   " + eng_socre);
            }
        }
        for(int i=1;i<temp.size();i++){
        Student student = temp.get(i);
            if (math_id == student.id) {
            System.out.println("수학: " + student.id + "     " + student.name + "     " + student.c.id + "     " + student.c.name + "   " + math_socre);
            }
        }
        for(int i=1;i<temp.size();i++){
        Student student = temp.get(i);
            if (sci_id == student.id) {
            System.out.println("과학: " + student.id + "     " + student.name + "     " + student.c.id + "     " + student.c.name + "   " + sci_socre);
            }
        }

		//[4]Output_CSV
        File csv = new File("hw1.csv");
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(csv,false)); //true 이어쓰기, false 덮어쓰기
            bw.write("과목,"+"학생Id,"+"학생이름,"+"반id,"+"반이름,"+"점수,");
            bw.newLine();
            for(int i=1;i<temp.size();i++){
                Student student = temp.get(i);
                    if (kor_id == student.id) {
                bw.write("국어," + student.id + "," + student.name + "," + student.c.id + "," + student.c.name + "," + kor_socre);
                }
            }
            bw.newLine();
            for(int i=1;i<temp.size();i++){
                Student student = temp.get(i);
                    if (eng_id == student.id) {
                bw.write("영어," + student.id + "," + student.name + "," + student.c.id + "," + student.c.name + "," + eng_socre);
                }
            }
            bw.newLine();
                for(int i=1;i<temp.size();i++){
                Student student = temp.get(i);
                    if (math_id == student.id) {
                bw.write("수학," + student.id + "," + student.name + "," + student.c.id + "," + student.c.name + "," + math_socre);
                }
            }
            bw.newLine();
                for(int i=1;i<temp.size();i++){
                Student student = temp.get(i);
                    if (sci_id == student.id) {
                bw.write("과학," + student.id + "," + student.name + "," + student.c.id + "," + student.c.name + "," + sci_socre);
                }
            }    
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{                
                if(bw!=null){
                    bw.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }      
    }   
}