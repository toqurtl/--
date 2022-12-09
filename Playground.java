import java.util.HashMap;

public class Playground {
    public static void main(String[] args){

        int a = 5;

        Person p = new Person(1,20, "inseok");

        HashMap<String, Integer> a_map = new HashMap<String, Integer>();
        a_map.put("a", 1);
        a_map.put("b", 2);
        a_map.put("c", 3);

        HashMap<Integer, Person> test_map = new HashMap<Integer, Person>();
        Person p1 = new Person(1, 20, "inseok");
        Person p2 = new Person(2, 40, "fuck");
        test_map.put(1, p1);
        test_map.put(2, p2);

        System.out.println(test_map.get(2));
        int bc = 3;        

    }
}
