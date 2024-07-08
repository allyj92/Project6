package staticex;

/*
 * static 변수의 getter(),setter() 메소드 만들기
 * */

public class Ex2 {
    public static void main(String[] args) {
        Student2 student1 = new Student2();
        student1.studentName = "둘리";
        System.out.println(Student2.getCount());

        Student2 student2 = new Student2();
        student2.studentName = "도우너";
        System.out.println(Student2.getCount());
    }
}

class Student2{
    private static int count = 0;
    int studentID;
    String studentName;

    public Student2(){ // 생성자
        count++;
        studentID  = count;
    }

    public static int getCount(){return count;}

    public static void getCount(int cnt){
        Student2.count = cnt;
//        studentName= "둘리"; //에러남. studentName은 인스턴스가 생성될 때 만들어지는 멤버변수이기때문에
    }
}

