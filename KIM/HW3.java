import java.util.HashMap;
import src.School;
import src.Student;
import src.Class;

//csv
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class HW3{

	public static void main(String[] args){
		School school = new School("class.csv", "teacher.csv", "student.csv");
		HashMap<Integer, Student> temp = school.student_map;

        double sum = 0.0;
        double avg = 0.0;
        double maxavg = 0.0;
        int max_id = 0;

        File csv = new File("hw3.csv");
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(csv,false)); //true 이어쓰기, false 덮어쓰기
            bw.write("등수,"+"학생Id,"+"학생이름,"+"반id,"+"반이름,"+"평균점수,"+"국,"+"영,"+"수,"+"과,");
            bw.newLine();
            for(int rank=1;rank<6;rank++){
                for(int i=1;i<=temp.size();i++){
                    if (temp.get(i) != null) {    
                        Student student = temp.get(i);
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
                bw.write(rank
                    + "," + student.id 
                    + "," + student.name
                    + ","+ student.c.id 
                    + "," + student.c.name 
                    + ","+ maxavg
                    + "," + student.score_map.get("국어")
                    + "," + student.score_map.get("영어")
                    + "," + student.score_map.get("수학")
                    + "," + student.score_map.get("과학"));
        
                // 최고 등수의 학생 temp에서 삭제
                temp.remove(max_id);
                bw.newLine();
                // 최고 등수 아이디 0으로
                max_id = 0;
                // 최고 등수 평균 0으로
                maxavg = 0;
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