package staticex;

public class Quiz1 {

    public static void main(String[] args) {
        Card card1 = new Card();
        card1.showInfo();
        Card card2 = new Card();
        card2.showInfo();
        Card card3 = new Card();
        card3.showInfo();
    }
}

class Card{
    static int serialNum = 100; // 카드의 수 (공통속성)
    int cardNo; // 카드번호

    public Card(){
       this.cardNo = serialNum;
       serialNum++;
    }

    public void showInfo(){System.out.println("카드번호: " + cardNo);}

}
