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
        //value 객체로 순회

        // or
//        int x = 0;
//        for (Character key: hashMap.keySet()) { // 바로 key 값으로 순회 가능
//            Integer value = hashMap.get(key); // 그런 다음 해당 키의 value 객체만 뽑아옴
//            if (value%2 == 0) {
//                x += value;
//            }
//        }
//        return x;
//    } // key 로 객체 순회

        // 혹은 iterator 로 순회 후 value 값 뽑아와도 됨
        Set<Map.Entry<Character,Integer>> entrySet = hashMap.entrySet();
        // 해시맵의 모든 앤트리 객체를 Set 으로 변환해서 리턴
        Iterator<Map.Entry<Character,Integer>> it = entrySet.iterator();
        // Set 으로 변환된 entrySet 을 다시 이터레이터 사용 하게 it 로 할당
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next().getValue();
            // Entry 타입의 it.next 의 int 값으로 정해진 value 만 가져옴 getValue() 의 값은 무조건 int
            if (num % 2 == 0) sum += num;
        }
        return sum;

    }
}

