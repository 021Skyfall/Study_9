package CodeTest;

import java.util.*;

public class f_getElementOfListEntry {
    public String getElementOfListEntry(HashMap<String, List<String>> hashMap, String key, int index) {
        //List를 value로 가지는 HashMap, key, 인덱스를 입력받아,
        // key에 해당하는 키(key)가 존재하는 경우, index가 가리키는 List의 요소를 리턴해야 합니다.

        if (!hashMap.containsKey(key)) { return null;} // 존재하지 않는 키값 null
        List<String> v = hashMap.get(key); // hashMap 에서 해당 키의 value 를 v 에 할당
        // List<String> 은 hashMap value 의 타입임
        if (index < 0 || index >= v.size()) { return null; } 
        // hashMap 의 value 는 List 로 되어 있고 그 길이가 구하고자하는 index 보다 작거나 크면 null 리턴
        return v.get(index);
        // List 인 v 의 값 중 인수인 index 에 해당하는 인덱스 호출

    }

}

