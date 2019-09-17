import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Printer {

    public <K, V> Map<K, V> getElements(Map<K, V> map, int toIndex) {
        Map<K, V> out = new LinkedHashMap<>();
        int i = 0;
        Iterator<Map.Entry<K, V>> iter = map.entrySet().iterator();
        while (iter.hasNext() && i < toIndex) {
            Map.Entry<K, V> entry = iter.next();
            out.put(entry.getKey(), entry.getValue());
            i++;
        }
        return out;
    }
}
