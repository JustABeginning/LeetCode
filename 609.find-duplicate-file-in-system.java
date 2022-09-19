import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] dir_list = path.split(" ");
            for (int i = 1; i < dir_list.length; i++) {
                String[] file_cont = dir_list[i].split("\\(");
                file_cont[1].replace(",", "");
                List<String> list = map.getOrDefault(file_cont[1], new ArrayList<String>());
                list.add(dir_list[0] + "/" + file_cont[0]);
                map.put(file_cont[1], list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (String key : map.keySet())
            if (map.get(key).size() > 1)
                res.add(map.get(key));
        return res;
    }
}
