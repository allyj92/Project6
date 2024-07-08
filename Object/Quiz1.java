package Object;
/*
 * 학생이 대중교통을 타고 학교에 가는 상황을 구현하세요.
 *
 * 학생 두 명을 생성하세요. (둘리,5000)(도우너,10000)
 * 둘리는 100번버스를 타고 학교에 갑니다.
 * 도우너는 2호선 지하철을 타고 학교에 갑니다.
 * 학생,버스,지하철의 현재 정보를 출력하세요.
 * */
public class Quiz1 {
    public static void main(String[] args) {
        Student student3 = new Student("둘리",5000);
        Bus bus = new Bus(100);
        student3.takeBus(bus);
        student3.showInfo();
        bus.showInfo();

        Student student4 = new Student("도우너", 10000);
        Subway subway = new Subway("2호선");
        student3.takeSubway(subway);
        student3.showInfo();
        subway.showInfo();



    }
}



