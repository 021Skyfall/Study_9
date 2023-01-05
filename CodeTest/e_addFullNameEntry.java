package CodeTest;

import java.util.HashMap;

public class e_addFullNameEntry {
    public HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        //TODO..
        String a = hashMap.get("firstName");
        String b = hashMap.get("lastName");
        hashMap.put("fullName",a+b);
        return hashMap;
    } // 그냥 각각 값 얻은 다음에 더해주면 되는데 너무 어렵게 생각했음
}
