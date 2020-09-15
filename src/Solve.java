import java.util.LinkedHashMap;
import java.util.Map;

public class Solve {
public static void main(String args[]){

    String st="Bubble";
    System.out.println(printFirstNon( st));
}

    // First Character Nonrepeated

    public static char printFirstNon(String str) {
         str = str.toLowerCase().replaceAll("\\s+", "");
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (Character ch : str.toCharArray())
            map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);

        for (Map.Entry<Character, Integer> en : map.entrySet()) {
            if (en.getValue() == 1)
                return en.getKey();
        }

        throw new RuntimeException("not found");
    }
}
