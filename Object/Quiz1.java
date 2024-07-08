package Object;

//

public class Quiz1 {
    public static void main(String[] args) {
        Student student1 = new Student("둘리",5000);
        Student student2 = new Student("도우너",10000);


        // 100 버스를 만든다
        Bus bus = new Bus(100);
        // 2호선 지하철을 만든다
        Subway subway = new Subway("2호선");
       // 둘리 10번 버스 도우너 2호선
        student1.takeBus(bus);
        student2.takeSubway(subway);

        student1.showInfo();
        student2.showInfo();
        bus.showInfo();
        subway.showInfo();


    }


    }

