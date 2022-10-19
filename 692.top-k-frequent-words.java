import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.Map.Entry;

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 0, c = 0; i < words.length; i++) {
            c = map.getOrDefault(words[i], 0);
            map.put(words[i], c + 1);
        }
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
        Comparator<Entry<String, Integer>> comp = new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
                return e2.getValue() - e1.getValue();
            }
        };
        Collections.sort(list, comp);
        List<String> ret = new ArrayList<String>(k);
        int c = 0;
        for (Entry<String, Integer> e : list) {
            ret.add(e.getKey());
            c++;
            if (c == k)
                break;
        }
        return ret;
    }
}
