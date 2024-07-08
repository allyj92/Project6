package Object;
/*
 * 학생이 대중교통을 타고 학교에 가는 상황 구현하기
 * */
public class Ex1 {
    public static void main(String[] args) {
        Student student = new Student("둘리",10000);
        Bus bus = new Bus(100); // 100번 버스를 만든다
        student.takeBus(bus); // 학생이 100번 버스를 탄다
        student.showInfo(); // 학생의 정보를 확인한다
        bus.showInfo();// 버스의 정보를 확인한다
    }
}
// 버스 클래스
class Bus{
    int busNumber; // 버스 번호
    int passengerCount; // 승객수
    int money; // 수입

    // 버스번호를 초기화하는 생성자
    public Bus(int busNumber){this.busNumber = busNumber;}

    // 버스에 승객을 태우는 메소드
    public void take(int money){
        this.money = this.money + money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println("버스 " + busNumber + "번의 승객은 " +
                passengerCount +"명이고, 수입은 " + money + "입니다." );
    }
   }

   // 지하철 클래스
class Subway{
    String lineNumber; // 지하철 노선번호
    int passengerCount; // 승객수
    int money; // 수입

    // 지하철 노선번호를 초기화하는 생성자
    public Subway(String lineNumber){ this. lineNumber = lineNumber;}

    // 지하철에 승객을 태우는 메소드
    public void take(int money){
        this.money = this.money + money;
        passengerCount++;
    }

    public void showInfo(){
        System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money+"입니다.");


    }

   }

// 학생클래스 구현하기
class Student{
    String studentName; // 학생이름
    int money; // 소지금
    public Student(String studentNmae, int money) {
        this.studentName = studentNmae;
        this.money = money;
    }
    // 버스에 타서 요금을 지불하는 메소드
    public void takeBus(Bus bus){
        bus.take(1000); // 1000원 지불
        this.money = this.money -1000; // 가진돈 1000원을 잃음
    }

    // 지하철에 타서 요금을 지불하는 메소드
    public void takeSubway(Subway subway){
        subway.take(1500);
        this.money = this.money-1500;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
    }
}
