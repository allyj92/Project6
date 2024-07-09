//package Object;
//
//public class Quiz3 {
//    public static void main(String[] args) {
//        Customer customer1 = new Customer("둘리",4000,10000);
//        Menu menu = new Menu();
//        Menu cafeAmericano = new Menu();
//
//
//        System.out.println(customer1.customerProperty+"원을 가진 "
//                + customer1.name+"는 "
//                + "에서 " + customer1.coffePrice+"원을 내고 "
//                + cafeAmericano.getAmericano()+"를 샀습니다." );
//    }
//}
//
//class Customer{
//
//    String name;
//    int customerProperty;
//
//    public Customer(String name, int customerProperty) {
//        this.name = name;
//        this.customerProperty = customerProperty;
//    }
//
//    public void customerSpending(int coffePrice){
//        this.customerProperty -= coffePrice;
//    }
//}
//
//class Cafe{
//    String cafeName;
//    int cafeProfit;
//
//
//
//    public Cafe(String cafeName,int cafeProfit) {
//        this.cafeName = cafeName;
//        this.cafeProfit = cafeProfit;
//
//    }
//
//    // 카페 이익금
//    public void cafeTake(Customer customer){
////        this.cafeProfit += customer.coffePrice;
//    }
//
//
//}
//
//class Menu{
//
//    private String Americano = "아메리카노";
//    private String latte = "라떼";
//
//
//
//    public String getAmericano() {
//        return Americano;
//    }
//
//    public String getLatte() {
//        return latte;
//    }
//
//    @Override
//    public String toString() {
//        return "Menu{" +
//                "Americano=" + Americano +
//                ", latte=" + latte +
//                '}';
//    }
//}
