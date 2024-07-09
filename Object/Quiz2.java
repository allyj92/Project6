package Object;

public class Quiz2 {
    public static void main(String[] args) {
        Student student4 = new Student("둘리",50000);

        Taxi taxi = new Taxi("3509");
        student4.takeTaxi(taxi);

        student4.showInfo();
        taxi.showInfo();

    }
}
