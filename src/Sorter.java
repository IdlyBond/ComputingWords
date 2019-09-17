import java.util.*;

public class Sorter {

    public <K> void sort(Map<K, Integer> map){
        if(map.isEmpty()) return;
        List<Map.Entry<K, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(((o1, o2) -> {
            if(o1.getValue() > o2.getValue()) return 1;
            else if(o1.getValue() < o2.getValue()) return -1;
            else return 0;
        }));
        map.clear();
        for (Map.Entry<K, Integer> item: list) map.put(item.getKey(), item.getValue());
    }

    public <K, V> void reverse(Map<K, V> map){
        if(map.isEmpty()) return;
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        Collections.reverse(list);
        map.clear();
        for (Map.Entry<K, V> item: list) map.put(item.getKey(), item.getValue());
    }
}
