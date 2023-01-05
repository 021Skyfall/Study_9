package CodeTest;

import java.util.ArrayList;

public class a_removeFromBackOfNew {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        //TODO..
//        마지막 인덱스 지운다음에 새로운 ArrayList 생성
//        내가 푼거
//        if (arrayList.size() == 0) { return null; }
//        arrayList.remove(arrayList.size()-1);
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.addAll(arrayList); // 여기서 addAll 에 런타임 에러
//        return arr;

//        IDE 에서 1차 변형 해준거
//        if (arrayList.size() == 0) { return null; }
//        arrayList.remove(arrayList.size()-1);
//        ArrayList<Integer> arr = new ArrayList<>(arrayList); // 이렇게 합쳐져서 바로 복사됨, 근데 arr에 런타임 에러
//        return arr;
        
//        IDE 에서 2차 변형 해준거
        if (arrayList.size() == 0) { return null; }
        arrayList.remove(arrayList.size()-1);
        return new ArrayList<>(arrayList); // 이렇게 기존 어레이리스트 넣고 바로 생성 가능 ㄷㄷ
    }
}
