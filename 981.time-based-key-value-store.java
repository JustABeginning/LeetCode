import java.util.HashMap;
import java.util.TreeMap;

class TimeMap {
    private HashMap<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<String, TreeMap<Integer, String>>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> tmp = map.getOrDefault(key, new TreeMap<Integer, String>());
        tmp.put(timestamp, value);
        map.put(key, tmp);
    }

    public String get(String key, int timestamp) {
        String ans = "";
        if (map.containsKey(key)) {
            TreeMap<Integer, String> tmp = map.get(key);
            if (tmp.containsKey(timestamp))
                ans = tmp.get(timestamp);
            else {
                Integer tfl = tmp.floorKey(timestamp);
                if (tfl != null)
                    ans = tmp.get(tfl);
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
