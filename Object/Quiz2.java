package Object;

public class Quiz2 {
    public static void main(String[] args) {

    }
}

class Taxi {
    String taxiNumber;
    int money;

    // 택시번호 생성자
    public Taxi(String taxiNumer) {
        this.taxiNumber = taxiNumer;
    }

    // 택시 수입
    public void takeMoney(int money) {
        this.money = money;
    }


    // 택시 번호, 택시 수입 의 정보를 출력하는 메서드
    public void showInfo() {
        System.out.println("택시번호 " + taxiNumber + "의 수입은 " + money + "입니다.");
    }
}

// 학생 클래스 구현
class Student2{
    String name;
    int money;

    // 학생 클래스 생성자

    public Student2(String name, int money) {
        this.name = name; //  학생 이름
        this.money = money; // 요금 지출
    }

    // 학생 지출 메서드
    public void takeTaxi(Taxi taxi){
        if(money < 10000){
            System.out.println("돈이 부족해서 택시를 탈 수 없습니다.");
        }

        taxi.takeMoney(10000); // 택시에 지출됨
        this.money = this.money -10000; // 10000원 잃음
    }
    public void showInfo(){System.out.println(name + "님의 남은 돈은 " + money + "입니다.");}
}