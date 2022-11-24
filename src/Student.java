package src;
import java.util.LinkedHashMap;

public class Student {
    public int id;
    public String name;
    LinkedHashMap<String, Integer> score_map = new LinkedHashMap<String, Integer>();

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int average_score(){
        int avg = 0;
        for(int a: score_map.values()){
            avg+=a;
        }
        return avg / score_map.size();
    }

}
