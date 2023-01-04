package Frame.CollectionFrameWork;

import java.util.*;

class Map1 {
    void exam1() {
        HashMap<String,Integer> hashMap = new HashMap<>();
        // HashMap 은 <키, 값> 타입을 따로 지정해주어야 함

        hashMap.put("피카츄",88);
        hashMap.put("라이츄",97);
        hashMap.put("파이리",64);
        hashMap.put("꼬부기",25);
        hashMap.put("야도란",43);
        hashMap.put("버터풀",61);
        // Entry(= 키 + 값) 객체 저장

        System.out.println("총 entry 수 : "+hashMap.size());
        // 총 Entry 수

        System.out.println("파이리 : "+hashMap.get("파이리"));
        // 특정 객체의 값 찾기

        Set<String> keySet = hashMap.keySet();
        // key 를 요소로 가지는 set 을 map 순회를 위해 생성
        Iterator<String> keyIterator = keySet.iterator();
        // while 순회를 위한 반복자 할당

        while (keyIterator.hasNext()) {
            String key = keyIterator.next(); // 키 순회
            Integer value = hashMap.get(key); // 값 순회 (반복자 생성해서 하면 와일 안에도 래퍼 클래스 넣네)
            System.out.println(key + " : " + value);
        }
        System.out.println();
        hashMap.remove("버터풀");
        // 객체 삭제

        Set<java.util.Map.Entry<String,Integer>> entrySet = hashMap.entrySet();
        //Entry 객체를 요소로 가지는 Set 생성 ~> 순회하기 위함

        Iterator<java.util.Map.Entry<String ,Integer>> entryIterator = entrySet.iterator();
        // 마찬가지로 while 순회를 위해 반복자 생성
        while (entryIterator.hasNext())  {
            java.util.Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey(); // Map.Entry 인터페이스의 메소드
            Integer value = entry.getValue(); // 마찬가지
            System.out.println(key + " : " + value);
        }
        // 객체 삭제 확인

        hashMap.clear();
        // 객체 전체 삭제
        System.out.println(hashMap.size());
        // 객체 삭제 확인


    }
}
public class Map {
    public static void main(String[] args) {
        Hashtable<String, Integer> map = new Hashtable<>();

        map.put("qwe",123);
        map.put("asd",456);
        map.put("zxc",789);

        System.out.println(map);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("아이디와 비밀번호를 입력해 주세요.");
            System.out.println("아이디");
            String id = scanner.nextLine();

            System.out.println("비밀번호");
            int password = Integer.parseInt(scanner.nextLine());

            if (map.containsKey(id)) {
                if (map.containsValue(password)) {
                    System.out.println("로그인 완료");
                    break;
                } else System.out.println("비밀번호가 일치하지 않습니다.");
            } else System.out.println("아이디가 일치하지 않습니다.");

        }
    }
}