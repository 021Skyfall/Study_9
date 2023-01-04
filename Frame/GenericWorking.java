package Frame;

class GenericWorking1 {
    private String item; // 구체적인 타입 지정

    GenericWorking1(String item) { // 외부로부터 받아올 값을 현재 클래스로 넣어주는 생성자
        this.item = item;                // 걍 생성자는 외부로 부터 받아온 값이 어디로 가야할지 주소 찍어주는 거라 보면 됨
    }                                    // 그리고 그 받아온 값은 이 클래스의 item 값이 되는거고
                                          // 그래서 this 찍어서 받아온 값과 = 쓰는거

    public String getItem() {
        return item;
    } // 얘로 외부에서 매개변수로 입력된 item 의 값을 외부에서 읽을 때 쓰는거
     // ~> 이게 그러니까 구찮게 이렇게 하는게 각자 할일 정해놓고 거기서만 놀게 하려고 하는 것
    // 더 귀찮아지기 싫으니까 밑작업하는 느낌이지 뭐

    public void setItem(String item) {
        this.item = item;
    } // 아 지금 보니까 세터는 위에 생성자를 바깥에서 터치 못하게 변경하면 << 캡슐화
      // 매겨변수로 입력되고 자시고 터치가 불가능하니까 값이 아예 안바뀌잖어 애초에 매개변수 인자를 받아올 수도 없고
      // 얘로만 값을 받아올래요~
      // 하는게 세터네
    // 여튼 제네릭 하는 중인데 ㅋㅋㅋ

}
// 위 와 같은 상황에서 이 클래스의 기능은 유지하면서 다른 타입의 데이터를 받아오고 싶다하면
// 그때 쓰는게 제네릭
// 제네릭을 안쓰면?
//class GenericWorkingInteger {private int item ...}
// 등등 이렇게 새로 클래스를 만들고 원하는 타입의 객체로 다시 정의해야됨
// 일일히 ㄷㄷㄷ

// 제네릭 사용법
class Basket<T> { // << 제네릭 클래스 / <T> = 타입 매개변수 선언
    private T item;

//    public Basket(T item) {
//        this.item = item;
//    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
public class GenericWorking {
    public static void main(String[] args) {
//        Basket<String> basket = new Basket<String>("쟈가쟝");
//        System.out.println(basket.getItem()); // 문자열로
//
//        Basket<Integer> basket1 = new Basket<Integer>(1);
//        System.out.println(basket1.getItem()); // 정수로

        Basket<Flower> flowerBasket = new Basket<>(); // << Flower를 타입 매개변수로 입력
        flowerBasket.setItem(new Rose()); // Rose는 상속 받는 관계이기 때문에 Flower를 타입 매개변수로 쓰는 Basket의 기능을 이용 할 수 있음
//        flowerBasket.setItem(new RosePasta()); // Flower의 상속을 받지 않는 클래스는 오류
        Space<Earth> earthSpace = new Space<>(); // Sun의 하위 클래스인 Earth 가능
//        Space<Pluto> plutoSpace = new Space<>(); // 임의 지정해서 상위나 하위가 아닌 영 다른 클래스는 오류

    }
}

class Flower {}
class Rose extends Flower{}
//class RosePasta Flower{}

// 이렇듯 제네릭 클래스를 인스턴스화 할 때 타입 매개변수로 쓸 수 있는 것에 제한이 없지만
// 내가 임의로 제한 할 수 있음

class Sun {}
class Earth extends Sun {}
class Pluto {}

//class Space<T> { 타입 매개변수에 제한이 없음
    class Space<T extends Sun> { // Sun 클래스와 그 하위 클래스만을 타입 매개변수로 갖게끔 설정
    private T star;

    public T getStar() {
        return star;
    }

    public void setStar(T star) {
        this.star = star;
    }
} // 결과는 위에
// << 마찬가지로 인터페이스도 동일한 방식으로 임의 조정 가능함