import java.util.*;

public class Computer {

    public List<String> splitExcept(String line, String regexWithout, String regexBy) {
        if (Objects.isNull(line) || line.trim().length() == 0) return Collections.emptyList();
        List<String> out = new ArrayList<>();
        Collections.addAll(out, line.replaceAll(regexWithout, "").trim().split(regexBy));
        return out;
    }

    public Map<String, Integer> countRepeatable(List<String> items){
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String item : items) map.compute(item, (k, v) -> v == null ? 1 : ++v);
        return map;
    }

}
