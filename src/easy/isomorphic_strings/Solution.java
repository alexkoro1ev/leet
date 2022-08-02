package easy.isomorphic_strings;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public boolean isIsomorphic(String s, String t) {
      return modifying(s).equals(modifying(t));
  }

    public String modifying(String s) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            }

            builder.append(map.get(s.charAt(i)));
            builder.append(" ");
        }

        return builder.toString();
    }
}
