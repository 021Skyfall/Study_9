package Study.CollectionFrameWork;

import java.util.*;

class Collection_Framework1 {
    private void example1() {
        ArrayList<String> list = new ArrayList<>();
        // ArrayList 생성 후 list 에 할당

        list.add("Java");
        list.add("C++");
        list.add("C#");
        // String 타입의 데이터를 리스트에 추가

        int size = list.size();
        // 저장된 총 객체 수 얻기

        String skill = list.get(0);
        // 0번 인덱스에 저장된 객체 얻기

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i +" : "+str);
        } // 저장된 객체 수 만큼 조회해서 저장된 문자열 타입 객체 출력

        for (String str: list) {
            System.out.println(str);
        } // for-each 문으로 순회

        list.remove(0); // 0번 인덱스 객체 삭제

        for (String str : list) {
            System.out.println(str);
        } // 다시 순회시 0번 인덱스 삭제 완료

        list.add("Hello"); // 리스트에 문자열 다시 추가

        for (String str:list) {
            System.out.println(str);
        } // 순회시 전에 있던 객체들의 순서가 1씩 당겨지고 마지막에 Hello 출력

        // 이런식으로 객체의 삭제, 삽입은 불편 ~> 편하게 하려면 LinkedList 사용

    }
}
class Collection_Framework2 {
    private void example() {
        LinkedList<String> list = new LinkedList<>();
        //Linked List 를 생성하여 list 에 할당

        list.add("Java");
        list.add("C++");
        list.add("C#");
        // Linked List 에 String 타입 데이터 추가

        int size = list.size();
        System.out.println(size);
        // 저장된 총 객체 수 얻기

        String skill = list.get(0);
        System.out.println(skill);
        // 0번 인덱스에 저장된 객체 얻기

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i+" : "+str);
        } // 순회하며 저장된 객체 순서대로 조회

        for (String str : list) {
            System.out.println(str);
        } // for-each 문으로 순회 가능

        list.remove(1);
        // 1번 인덱스 삭제
        list.add(0,"Hello"); // 0번 인덱스로 삽입
        for (String str : list) {
            System.out.println(str);
        } // 삭제후 추가후 바로 순회
    }
}
class Collection_Framework3 {
    private void example3() {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C#");
        list.add("C++");

        Iterator<String> iterator = list.iterator();
        // ArrayList 에서 Iterator 의 iterator() 메소드 호출


        while (iterator.hasNext()) { // 읽어올 다음 객체 있으면
            String str = iterator.next(); // next() 메소드를 통해 다음 객체를 읽어옴
            if (str.equals("Java")) {iterator.remove();} // if 문으로 해당하는 객체 삭제
        } // 이거랑 위에 쓴 for-each 랑 같은 거임 / 대신 얘는 Iterator 쓴 버전

        for (String str:list) {
            System.out.println(str);
        } // 삭제 됐는지 확인 용
    }
}
class Collection_Framework4 {
    private void example4() {
        HashSet<String> languages = new HashSet<>();
        // HashSet 생성

        languages.add("Java");
        languages.add("C#");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Python");
        languages.add("Ruby");
        languages.add("Java"); // 중복 값 투입, 이미 IDE 에서 런타임 에러 뜨긴하네

        Iterator<String> it = languages.iterator();
        // 반복자 생성 후 it에 할당

        while (it.hasNext()) {
            System.out.println(it.next());
        } // 반복자를 통해 HashSet 을 순회하며 각 요소 출력
        // ~> Java가 두 번 출력 됐지만 HashSet이 이를 받아들이지 않고 한번만 저장됨
    }
}
public class Collection_Framework {
    public static void main(String[] args) {
        TreeSet<String> workers = new TreeSet<>();
        // TreeSet 생성

        workers.add("Lee");
        workers.add("Kim");
        workers.add("Park");
        workers.add("Joe");
        // 막 넣었는데
        System.out.println(workers); // 자동으로 사전 편찬 순으로 오름차순 정렬됨 ㄷㄷ
        System.out.println(workers.first()); // 오름차순으로 정렬된 객체 중 첫번째
        System.out.println(workers.last()); // 마찬가지로 마지막 객체
        System.out.println(workers.higher("Lee")); // 매개변수 인자 문자열 다음 값 출력
        System.out.println(workers.lower("Lee")); // 마찬가지 이전 값 출력
        System.out.println();
        System.out.println(workers.subSet("Kim","Park"));
        System.out.println(workers.subSet("Joe","Park")); // 앞 문자열부터 뒤 문자열 이전 객체 까지 출력
    }
}
