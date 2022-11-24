import java.util.HashMap;

import src.Student;
import src.Class;
import src.Teacher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Test {

    public static HashMap<Integer, Class> class_map = new HashMap<Integer, Class>();
    public static HashMap<Integer, Student> student_map = new HashMap<Integer, Student>();
    public static HashMap<Integer, Teacher> teacher_map = new HashMap<Integer, Teacher>();

    public static void main(String[] args){    
    
        Test.read_data();
        System.out.println(student_map.size());

        

    }

    public static void read_data(){
        Test.read_class_data("class.csv");
        Test.read_teacher_data("teacher.csv");
        Test.read_student_data("student.csv");
    }

    public static void read_student_data(String file_name){        
        File csv = new File(file_name);
        BufferedReader br = null;
        String line = "";        
        try{
            br = new BufferedReader(new FileReader(csv));
            br.readLine();
            while((line=br.readLine())!=null){                
                String[] line_arr = line.split(",");
                int id = Integer.parseInt(line_arr[0]);                
                String name = line_arr[1];
                Student s = new Student(id, name);                
                int class_id = Integer.parseInt(line_arr[2]);
                s.c = Test.class_map.get(class_id);
                    
                s.score_map.put("kor", Double.parseDouble(line_arr[3]));
                s.score_map.put("eng", Double.parseDouble(line_arr[4]));
                s.score_map.put("mat", Double.parseDouble(line_arr[5]));
                s.score_map.put("sci", Double.parseDouble(line_arr[6]));
                                
                Test.student_map.put(id, s);

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
        try{
            br = new BufferedReader(new FileReader(csv));
            br.readLine();
            while((line=br.readLine())!=null){                
                String[] line_arr = line.split(",");
                int id = Integer.parseInt(line_arr[0]);
                String name = line_arr[1];
                int class_id = Integer.parseInt(line_arr[2]);
                Teacher t = new Teacher(id, name);
                t.c = Test.class_map.get(class_id);
                Test.teacher_map.put(t.id, t);
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

    public static void read_class_data(String file_name){        
        File csv = new File(file_name);
        BufferedReader br = null;
        String line = "";        
        try{
            br = new BufferedReader(new FileReader(csv));
            br.readLine();
            while((line=br.readLine())!=null){                
                String[] line_arr = line.split(",");
                int id = Integer.parseInt(line_arr[0]);
                String name = line_arr[1];
                Class c = new Class(id, name);
                Test.class_map.put(id, c);
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
}
