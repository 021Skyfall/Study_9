package CodeTest;

import java.util.HashMap;


public class g_select {
    //String 타입을 요소로 가지는 배열과 <String, Integer> 타입을 요소로 가지는 HashMap을 입력받아,
    // 배열의 각 요소들을 HashMap의 키로 했을 때 그 값을 추출하여 만든 새로운 HashMap을 리턴해야 합니다.
    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        HashMap<String, Integer> a = new HashMap<>(); // 리턴할 새로운 HashMap 생성
        for (String str : arr) { // arr 배열을 순회
            if (hashMap.containsKey(str)) { // 하나씩 조회한 값이 hashMap 에 포함 되어 있으면
                a.put(str, hashMap.get(str));
                // 새로 만든 hashmap 인 a 에 입력
                // 단, arr 의 요소를 하나씩 키로 받고,
                // 기존에 존재하던 hashMap 의 value 를 hashMap 의 키와 arr 각 요소와 같은 것만 return
            }
        }
        return a;
    }
}
