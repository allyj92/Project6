package scope;

// 인스턴스 변수, 클래스 변수 / 전역변수, 지역변수
// 구분에 따라 변수의 유효범위를 작성하세요

class Person{
    // 인스턴스변수는 객체를 생성한 후부터 사용 가능
    // 전역변수는 클래스 안에서 어디서나 사용 가능
    String personName; // 인스턴스 변수
    int personAge; // 인스턴스 변수
    static char gender = 'F'; // 클래스 변수 // 처음 시작될때부터 형성됨

    public void setPersonName(String name){
        this.personName = name; // name ==> 지역 변수 // 함수 내에서만 사용가능
    }
}