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
    int cardNum;
    static int count = 100;
    public Card(){
        count ++;
        cardNum = count;
    }

    public void showInfo(){
        System.out.println("카드 번호 : " + cardNum);
    }
}
