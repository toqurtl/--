package origin;

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

    
}
