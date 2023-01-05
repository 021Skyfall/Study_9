package CodeTest;

import java.util.ArrayList;
import java.util.Iterator;

public class c_sumAllElements {
    public int sumAllElements(ArrayList<Integer> arrayList) {
        //TODO..
        if (arrayList.size() == 0) { return 0; }
        Iterator<Integer> it = arrayList.iterator();
        int x = 0;
        while (it.hasNext()) { // 얘로 다음 값이 있는지 없는지 boolean 으로 나타내줌
            x += it.next(); // .next() 는 바로 다음 요소를 호출 해주는 것
        }
        return x;
    }
}
