package CodeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class b_arrayToArrayList {
    public List<String> arrayToArrayList(String[] arr) {
        //TODO..
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(arr));
        if(arrayList.size() == 0) { return null; }
        return arrayList;
    } // List.of(arr) 은 null 값이 먼저 들어올 경우 있으면 안됨 java 9부터 지원
}
