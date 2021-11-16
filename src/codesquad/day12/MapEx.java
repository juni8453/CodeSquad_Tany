package codesquad.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class MapEx {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");

        // 향상된 for문으로 map 데이터 꺼내기
        for (String key :
             map.keySet()) {
            System.out.println("key : " + key + " " + "value : " + map.get(key));
        }

        // Iterator로 map 데이터 꺼내기
        Iterator<String> keys = map.keySet().iterator();
        while(keys.hasNext()) {
            String key = keys.next();
            System.out.println("key : " + key + " " + "value : " + map.get(key));
        }

        System.out.println(map.get("people"));
        System.out.println(map.containsKey("people"));
        System.out.println(map.remove("people"));
        System.out.println(map.size());
    }
}
