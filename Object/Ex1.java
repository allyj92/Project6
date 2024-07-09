package Object;

public class Ex1 {
    public static void main(String[] args) {
        // 1. 객체를 만든다
        // 만원을 가진 둘리라는 학생을 만든다
        Student student = new Student("둘리",10000);
        // 100 버스를 만든다
        Bus bus = new Bus(100);


        // 학생이 100번 버스에 탄다
        student.takeBus(bus);

        student.showInfo();
        bus.showInfo();
    }
   }

   class Bus {
       int busNumber; // 버스 번호
       int passengerCount; // 승객수
       int money; // 수입

       // 버스번호를 초기화하는 생성자
       public Bus(int busNumber) {
           this.busNumber = busNumber;
       }

       // 버스에 승객을 태우는 메소드
       public void take(int money) {
           this.money += money; // 버스 수입 증가
           passengerCount++; // 승객수 1명 증가
       }

       // 버스의 현재 상태
       public void showInfo() {
           System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount
                   + "명이고, 수입은 " + money + "입니다."
           );
       }

   }
   class Subway{
    String lineNumber; // 지하철 노선번호
       // int형은 0으로 초기화 되어 있음
    int passengerCount; // 승객수
    int money; // 수입

        // 지하철 노선번호를 초기화하는 생성자
       public Subway(String lineNumber) {
           this.lineNumber = lineNumber;
       }

       // 지하철에 승객을 태우는 메소드
       public void take(int money){

           this.money += money;
           passengerCount++;
       }

       // 지하철의 현재 상태
       public void showInfo() {
           System.out.println("지하철 " + lineNumber + "선의 승객은 " + passengerCount
                   + "명이고, 수입은 " + money + "입니다."
           );
       }


   }

   class Taxi{
       String taxiNumber; // 지하철 노선번호
       // int형은 0으로 초기화 되어 있음
       int passengerCount; // 승객수
       int money; // 수입

       // 지하철 노선번호를 초기화하는 생성자
       public Taxi(String taxiNumber) {
           this.taxiNumber = taxiNumber;
       }

       // 지하철에 승객을 태우는 메소드
       public void take(int money){

           this.money += money;
           passengerCount++;
       }

       // 지하철의 현재 상태
       public void showInfo() {
           System.out.println("택시 " + taxiNumber + "번의 승객은 " + passengerCount
                   + "명이고, 수입은 " + money + "입니다."
           );
       }
   }

   class Student{
    String studentName; // 학생이름
    int money; // 소지금

       // 학생이름과 가진돈을 초기화하는 생성자

       public Student(String studentName, int money) {
           this.studentName = studentName;
           this.money = money;
       }

       // 버스에 타서 요금을 지물하는 메소드
       public void takeBus(Bus bus){
           bus.take(1000); // 1000원 지불
           this.money -= 1000; // 가진 돈 1000원을 잃음
       }

       // 지하철에 타서 요금을 지불하는 메소드
       public void takeSubway(Subway subway){
           subway.take(1500); // 1500원 지불
           this.money -= 1500; // 가진돈 1500원을 잃음
       }

       // 택시에 타서 요금을 지물하는 메소드
       public void takeTaxi(Taxi taxi){

           if (this.money < 10000) {
               System.out.println("잔액 부족");
               return;
           }

           taxi.take(10000); // 1000원 지불
           this.money -= 10000; // 가진 돈 1000원을 잃음
       }

       public void showInfo(){
           System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
       }
   }


