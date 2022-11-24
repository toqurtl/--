package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import src.Teacher;
import src.Student;
import src.Class;

public class Utils {
    
    public static HashMap<Integer, Class> class_map = new HashMap<Integer, Class>();
    public static HashMap<Integer, Student> student_map = new HashMap<Integer, Student>();
    public static HashMap<Integer, Teacher> teacher_map = new HashMap<Integer, Teacher>();


    public static void read_student_data(String file_name){        
        File csv = new File(file_name);
        BufferedReader br = null;
        String line = "";
        HashMap<String, Student> student_map = new HashMap<String, Student>();
        try{
            br = new BufferedReader(new FileReader(csv));
            br.readLine();
            while((line=br.readLine())!=null){                
                String[] line_arr = line.split(",");
                int id = Integer.parseInt(line_arr[0]);
                String name = line_arr[1];
                Student s = new Student(id, name);

                

            }            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{                
                if(br!=null){
                    br.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }        

    }

    public static void read_teacher_data(String file_name){        
        File csv = new File(file_name);
        BufferedReader br = null;
        String line = "";
        HashMap<String, Teacher> teacher_map = new HashMap<String, Teacher>();
        try{
            br = new BufferedReader(new FileReader(csv));
            br.readLine();
            while((line=br.readLine())!=null){                
                String[] line_arr = line.split(",");
                int id = Integer.parseInt(line_arr[0]);
                String name = line_arr[1];
                String 
                Teacher s = new Teacher(id, name);

                

            }            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{                
                if(br!=null){
                    br.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return teacher_map;

    }

    public static HashMap<String, Student> read_student_data(String file_name){        
        File csv = new File(file_name);
        BufferedReader br = null;
        String line = "";
        HashMap<String, Student> student_map = new HashMap<String, Student>();
        try{
            br = new BufferedReader(new FileReader(csv));
            br.readLine();
            while((line=br.readLine())!=null){                
                String[] line_arr = line.split(",");
                int id = Integer.parseInt(line_arr[0]);
                String name = line_arr[1];
                Student s = new Student(id, name);

                

            }            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{                
                if(br!=null){
                    br.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return student_map;

    }
}
