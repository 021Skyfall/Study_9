package Frame;

import java.util.Arrays;

public class EnumWorking {}
//    public static final int SPRING = 1;
//    public static final int SUMMER = 2;
//    public static final int FALL = 3;
//    public static final int WINTER = 4;
//    // 열거형 사용 전 전역 상수 정의 방식
//    // 중복의 위험 ↓
//    public static final int DJANGO = 1;
//    public static final int SPRING = 2;
//    public static final int NEST = 3;
//    public static final int EXPRESS = 4;
//    // 전혀 다른 개체로 정의 하고 싶어도 계절의 SPRING 과 중복됨

//    // 인터페이스로 상수를 구분 한다면?
//    interface Seasons {
//        int SPRING = 1, SUMMER = 2, FALL = 3, WINTER = 4;
//    }
//    interface  Frameworks {
//        int DJANGO = 1, SPRING = 2, NEST = 3, EXPRESS = 4;
//    }
//    // 에러 없이 구분은 가능하지만 타입 안정성이라는 문제 발생
//    // 이는 상수에 주어진 숫자는 그냥 순서 나타내려고 입력한 것이고 의미가 있는 값이 아니지만
//    public static void main(String[] args) {
//        if (Seasons.SPRING == Frameworks.SPRING) {
//            System.out.println(true);
//        } else System.out.println(false);
//    }
//    // 전혀 다른 개념으로 가져가고 싶은데 비교 연산자를 사용해도 에러가 안나고 비교가 가능해짐
//    // 이게 안정성 떨어진다는 것
//    // ~> 열거하기 위해 주어진 숫자로 비교가 가능하다는 뜻임

      // 이를 해결하기 위해 객체로 생성하는 방법도 있음
//      static class Seasons {
//        public static final Seasons SPRING = new Seasons();
//        public static final Seasons SUMMER = new Seasons();
//        public static final Seasons FALL   = new Seasons();
//        public static final Seasons WINTER = new Seasons();
//      }

//    public static void main(String[] args) {
//        Seasons seasons = Seasons.SPRING;
//        switch (seasons) { // << 타입 안맞는다고 예외 발생
//            case Seasons.SPRING:
//                System.out.println("봄");
//                break;
//            case Seasons.SUMMER:
//                System.out.println("여름");
//                break;
//            case Seasons.FALL:
//                System.out.println("가을");
//                break;
//            case Seasons.WINTER:
//                System.out.println("겨울");
//                break;
//        }
//    }
//
//    class Frameworks {
//        public static final Frameworks DJANGO  = new Frameworks();
//        public static final Frameworks SPRING  = new Frameworks();
//        public static final Frameworks NEST    = new Frameworks();
//        public static final Frameworks EXPRESS = new Frameworks();
//    }
//
//     해결은 됐는데 또 이건 사용자가 정의한 타입이라 보는 바와 같이 switch 문에 활용 불가
    // 그리고 코드도 엄청 김 귀찮잖아?
    // 그래서 enum 쓰면 됨

    enum Season {SPRING, SUMMER, FALL, WINTER}
    enum Frameworks {DJANGO, SPRING, NEST, EXPRESS}

class Check {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season) {
            case SPRING:
                System.out.println("봄");
                break;
            case SUMMER:
                System.out.println("여름");
                break;
            case FALL:
                System.out.println("가을");
                break;
            case WINTER:
                System.out.println("겨울");
                break;
        }
        System.out.println(Season.SPRING); // SPRING 출력
        Season anySeason = Season.SPRING; // Season 타입의 참조변수에 할당
        System.out.println(anySeason); // 위에 SPRING 을 호출하고 변수명 선언 해줘서 마찬가지로 SPRING 출력

        System.out.println(Season.SPRING.name()); // 상수 문자열 리턴
        System.out.println(Season.SUMMER.ordinal()); // 상수 인덱스 리턴
        System.out.println(Season.FALL.compareTo(Season.WINTER)); // compareTo 메소드의 인자와 비교하여 인덱스 차이 값 리턴
        System.out.println(Season.valueOf("SPRING")); // 해당 문자열의 Enum 객체 리턴 <~ 왜 쓰는거지
        System.out.println(Season.WINTER == Season.valueOf("FALL")); // 아 이런식으로 비교해서 boolean 출력할 때 쓰는 듯
        // 보통 이건 어따쓰지?싶은것들은 대부분 boolean 출력하기 위함이더리
        System.out.println(Arrays.toString(Season.values())); // Enum 객체를 배열로 만듦

    }

}
    // 간편하고 보기도 좋음
    // switch 문에도 활용 가능

// Enum 의 메소드

//    String   name()	            열거 객체가 가지고 있는 문자열을 리턴하며, 리턴되는 문자열은 열거타입을 정의할 때 사용한 상수 이름과 동일합니다.
//    int	   ordinal()	        열거 객체의 순번(0부터 시작)을 리턴합니다.
//    int	   compareTo(비교값)	    주어진 매개값과 비교해서 순번 차이를 리턴합니다.
//  열거 타입   valueOf(String name)	주어진 문자열의 열거 객체를 리턴합니다.
//  열거 배열   values()	            모든 열거 객체들을 배열로 리턴합니다.
