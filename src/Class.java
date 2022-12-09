package src;

import java.util.HashMap;

public class Class {
    public int id;
    public String name;
    public Teacher teacher;
    public HashMap<Integer, Student> student_map = new HashMap<Integer, Student>();

    public Class(int id, String name){
        this.id = id;
        this.name = name;
    }

    public double average_score(String subject_name){
        double avg = 0;
        for(Student s: this.student_map.values()){
            avg += s.score_map.get(subject_name);
        }
        return avg / this.student_map.size();
    }

    public double total_average_score(){
        double avg = 0;
        for(Student s: this.student_map.values()){
            avg += s.average_score();
        }
        return avg / this.student_map.size();
    }

}
