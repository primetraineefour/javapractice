package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jay
 */
public class MapDemo {

    public static void main(String[] args) {
         Map<Integer, String> map = new HashMap<>();
         map.put(1, "bmw");
         map.put(6, "Audi");
         map.put(4, "Honda");

         String value1 = map.get(1);
        System.out.println(value1);

        map.put(5, "Merc");

        System.out.println(map.get(4));

    }
}
