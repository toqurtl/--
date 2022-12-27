
// import src.Class;
import src.School;
//import src.Student;
//import src.Teacher;
import java.util.Scanner;


public class JJ_Test_1 {  // 테스트라는 클래스를 생성

    // for문 쓰는법 -> 두개
    // 일반적인 for문
    // Hashmap, ArrayList -> COllection -> Collection을 for문돌
    //Hashmap, ArrayLIst -> 이것을 선언하는 것-> 이 안에 어떤 메소드들
    // Input/OUtput -> csv를 읽고 쓰는 것
   
    // HW0
    // 제 코드를 이해하십쇼
    // school 생성자-> csv파일을 읽어서 hashmap다가 다 집어넣는게


    // HW1 난이도 1
    // 과목별 1등 학생의 id, 이름, 반, 점수가 무엇인지 csv형태로 정리
    // public static void save_result(){ // save_result라는 매소드 생성
        
        public static void main(String[] args) {
        School school = new School("class.csv", "teacher.csv" , "student.csv");

        double stuhigh = 0;
        int Max_IDstudent = 0;
        String InputClassName = null;
        String Max_NMstudent = null;
        String Max_CLstudent = null;

        Scanner sc = new Scanner(System.in);
		System.out.print("과목을 입력하세요 : ");
		InputClassName = sc.nextLine();
        double stuone = school.student_map.get(1).score_map.get(InputClassName);

        for (int i=1; i<31; i++){
            double Valuestudent = school.student_map.get(i).score_map.get(InputClassName);
            int IDstudent = school.student_map.get(i).id;

            // System.out.println("국어점수의 비교점수는 " + Valuestudent + "입니다");
             if(stuone <= Valuestudent){
                stuhigh = Valuestudent;
                stuone = Valuestudent;
                Max_IDstudent = IDstudent;
             }  
         }
         sc.close(); // 스캐너 항상 클로즈 

        Max_NMstudent = school.student_map.get(Max_IDstudent).name;
        Max_CLstudent = school.student_map.get(Max_IDstudent).c.name;
        double test1 = school.subject_average(InputClassName); // School의 subject_average 함수가 호출되어야 함

    System.out.println(InputClassName + "과목의 평균값은 " + test1 + "입니다"); // 학생의 평균값 도출
    System.out.println(InputClassName + "의 최고점수는 " + stuhigh + "입니다");
    System.out.println(InputClassName + "의 최고점수를 받은 학생의 id, 이름, 반은 : ID " + Max_IDstudent + ", " + Max_NMstudent + ", " + Max_CLstudent + "반 입니다");


// openCSV 써야하는게 맞는가
    
}
        /* 
        // student csv 파일에는 30명의 학생이 1번부터 30번의 아이디를 부여받았음, 
        // 과목은 국어, 영어, 수학, 과학 4과목
        // 각 과목별 1등 학생을 선별하기 위해서는 각 과목별 점수 중 가장 큰 점수를 확인해야함(해쉬값에서 밸류값만 선별 후 가장 높은 밸류 선택)
        // student map의 key와 value 값을 활용하되, value 값이 가장 큰 key 값을 찾아냄
        // (Collections.max 활용하였으나 에러 발생....)
        // 가장 큰 key 값을 바탕으로 학생의 id, 이름, 반, 점수 불러오기
        // 가장 높은 벨류의 키 값을 확인하여 학생의 이름 확인
        // 학생의 이름을 확인 한 후 이를 바탕으로 학생의 id, 이름, 반, 점수 저장
        // 저장값을 csv 파일로 저장
        */


    // HW2 난이도 2
    public static void save_result_2(){
        // 반별 과목 및 전체 평균 비교



        
    }
    // HW3 난이도 3
    // 전체 평균점수 기준 1등부터 30등까지 나열
    public static void save_result_3(){
        String InputClassName = null;
        School school = new School("class.csv", "teacher.csv" , "student.csv");
        Scanner sc = new Scanner(System.in);
        sc.close(); // 스캐너 항상 클로즈
		InputClassName = sc.nextLine();
        double test1 = school.subject_average(InputClassName); // School의 subject_average 함수가 호출되어야 함
        System.out.println(InputClassName + "과목의 평균값은 " + test1 + "입니다"); // 학생의 평균값 도출

        // 30명 중에 1등 뽑고 1명 지우고 29명 하고 하는 식으로 진행행 / arraylist
        
    }


}
