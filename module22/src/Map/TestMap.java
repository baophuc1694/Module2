package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Toan", 30);
        hashMap.put("Quoc", 35);
        hashMap.put("Scalet", 28);
        hashMap.put("Hai", 27);
        System.out.println("Hiển thị các danh mục trong hashMap: ");
        System.out.println(hashMap + "\n");
//        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
//        System.out.println("Hiển thị các mục theo thứ tự tăng dần của key");
//        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Toan", 30);
        linkedHashMap.put("Quoc", 35);
        linkedHashMap.put("Scalet", 28);
        linkedHashMap.put("Hai", 27);
        System.out.println("\nThe age for " + "Lewis is" + linkedHashMap.get("Lewis"));
    }
}
