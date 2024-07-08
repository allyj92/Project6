package Object;

public class Quiz3 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("둘리", 10000);
        customer1.buyAmericanoCoffe(new Cafe("별다방"));


        Customer customer2 = new Customer("또치", 20000);
        customer2.buyLatteCoffe(new Cafe("별다방"));
    }
}

// 손님 클래스
class Customer {
    String name;
    int money;

    public Customer(String name, int money) {
        this.name = name;
        this.money = money;
    }



    // 아메리카노 구매 메서드
    public void buyAmericanoCoffe(Cafe cafe) {
        int americanoPrice = 4000;
        if (money < americanoPrice) {
            System.out.println("잔액 부족");
            return;
        }
        cafe.sellAmericano();
        this.money -= americanoPrice;
        System.out.println(money + "원을 가진 " + name + "는 " + cafe.CafeName + " 카페에서 " + americanoPrice + "원을 내고 아메리카노를 샀습니다.");

    }

    // 라떼 구매 메서드
    public void buyLatteCoffe(Cafe cafe) {
        int lattePrice = 4500;
        if (money < lattePrice) {
            System.out.println("잔액 부족");
            return;
        }
        cafe.sellLatte();
        this.money -= lattePrice;
        System.out.println(money + "원을 가진 " + name + "는 " + cafe.CafeName + " 카페에서 " + lattePrice + "원을 내고 라떼를 샀습니다.");

    }
}

// 카페 클래스
class Cafe {
    String CafeName;
    int money;
    int americanoPrice = 4000;
    int lattePrice = 4500;

    public Cafe(String CafeName) {
        this.CafeName = CafeName;
    }

    public void showInfo() {
        System.out.println("카페 " + CafeName + "의 수입은 " + money + "입니다.");
    }

    // 아메리카노를 파는 메서드
    public void sellAmericano() {
        money += americanoPrice;
    }

    // 라떼를 파는 메서드
    public void sellLatte() {
        money += lattePrice;
    }
}