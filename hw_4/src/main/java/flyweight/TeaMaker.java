package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeaMaker {
    protected Map<String, Tea> teaMap =
            new HashMap<>(Map.of("karak", new KarakTea(), "red", new RedTea()));

    public Tea make(String teaType) {
        if (!teaMap.containsKey(teaType)) {
            teaMap.put(teaType, new KarakTea());
        }
        return teaMap.get(teaType);
    }
}
