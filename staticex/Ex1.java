package staticex;

public class Ex1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "둘리";
        System.out.println(student1.studentName + "학번 : " + student1.StudentId);

        Student student2 = new Student();
        student2.studentName = "또치";
        System.out.println(student2.studentName + "학번 : " + student2.StudentId);

        Student student3 = new Student();
        student3.studentName = "도우너";
        System.out.println(student3.studentName + "학번 : " + student3.StudentId);

        System.out.println(Student.count);
    }
}

class Student{
    static int count = 0; // 학생의 수 (공통 속성)
    int StudentId; // 학번
    String studentName; // 이름

    public Student(){
        count++;
        StudentId = count;
    }

}

