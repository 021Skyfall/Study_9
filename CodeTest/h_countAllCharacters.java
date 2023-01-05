package CodeTest;

import java.util.HashMap;

public class h_countAllCharacters {
//    문자열을 입력받아 문자열을 구성하는 각 문자(letter)를 키로 갖는 HashMap을 리턴해야 합니다.
//      각 키의 값은 해당 문자가 문자열에서 등장하는 횟수를 의미하는 int 타입의 값이어야 합니다.
    public HashMap<Character, Integer> countAllCharacter(String str) {
        //TODO..
        if (str.isEmpty()) {
            return null;
        } // 빈 문자열 null 리턴
        HashMap<Character, Integer> hashMap = new HashMap<>(); // 해쉬맵 생성
        for (int i = 0; i < str.length(); i++) { // 받아올 문자열 길이 만큼 반복
            char x = str.charAt(i);
            // 반복되는 횟수 만큼 문자열을 charAt 메소드로 하나 씩 분리해 X에 할당
            if (hashMap.containsKey(x)) { // 잘라진 문자열에 해당하는 키가 여러개면
                int v = hashMap.get(x); // 해당 value 를 따로 뽑아서
                hashMap.put(x,v + 1); // +1 을 한 다음에 value 에 저장
            } else {
                hashMap.put(x,1); // 중복이 없다면 1로 저장
            }
            // else는 조건과 관계 없이 실행 될 것이고 왜? 처음 hashMap 에는 값이 아예 없으니까
            // 무조건 false ~> else로 들어감
            // 그 다음 중복이 있으면 맨 처음 꺼는 else 로 들어갔다가 if 에 걸려서 true 가 실행됨
            // ~> 이렇게 되면 키가 중복되지 않는 hashmap 특성상 뒤의 v+1 만 실행되는 거나 마찬가지
            // 그럼 해당 키의 value 가 중복되는 만큼 1씩 증가함
            // 그래서 결국 banana 를 넣고 돌리고 나서 나오는 hashmap 의 값은
            // b =1 a =3 n =2 가 됨
        }
        return hashMap;
    }
}
