
import java.util.ArrayList;
import java.util.HashMap;
import src.School;
import src.Teacher;
import src.Class;

//csv
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class HW2 {
    
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

        //Output_CSV
        File csv = new File("hw2.csv");
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(csv,false)); //true 이어쓰기, false 덮어쓰기
            bw.write("   ,전체,");
            for(String subject_name: subject_name_list){
                bw.write(subject_name+",");
            }
            bw.newLine();
            for(Class c: school.class_map.values()){
                bw.write(c.name+"반,");
                bw.write(c.total_average_score()+",");
                for(String subject_name: subject_name_list){
                    bw.write(c.average_score(subject_name)+",");
                }
                bw.newLine();
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
