package CodeTest;

import java.util.*;

public class d_addEvenValues {
    public int addOddValues(HashMap<Character, Integer> hashMap) {
//<Character, Integer> 타입을 요소로 가지는 HashMap 을 입력받아
// 짝수 값(Value) 끼리 모두 더한 값을 리턴해야 합니다.
//        Collection<Integer> value = hashMap.values();
//        // Collection 으로 hashmap 의 value 객체만 형변환 후 불러옴
//        int x = 0;
//        for (int i : value) {
//            if(i%2 == 0) {
//                x += i;
//            }
//        }
//        return x;
        // or
        int x = 0;
        for (Character key: hashMap.keySet()) { // 바로 key 값으로 순회 가능
            Integer value = hashMap.get(key); // 그런 다음 그 중에 value 객체만 뽑아옴
            if (value%2 == 0) {
                x += value;
            }
        }
        return x;
//    } // for-each 를 이용한 Map key 객체 순회
        // 혹은 iterator 로 순회 후 value 값 뽑아와도 됨
    }
}

