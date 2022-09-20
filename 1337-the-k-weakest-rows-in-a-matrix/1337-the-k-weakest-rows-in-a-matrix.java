import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.LinkedHashMap;
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r=mat.length,c=mat[0].length;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<r;i++){
            int count=0;
            for(int j=0;j<c;j++){
                if(mat[i][j]==1)
                    count++;
                else
                    break;
            }
            map.put(i,count);
        }
        // Sorting HashMap by values
        Set<Entry<Integer,Integer>> entries=map.entrySet();
        List<Entry<Integer,Integer>> list=new ArrayList<Entry<Integer,Integer>>(entries);
        Comparator<Entry<Integer,Integer>> valueCompare=new Comparator<Entry<Integer,Integer>>(){
            @Override
            public int compare(Entry<Integer,Integer> e1, Entry<Integer,Integer> e2){
                return (e1.getValue()-e2.getValue());
            }
        };
        Collections.sort(list,valueCompare);
        LinkedHashMap<Integer,Integer> sortedMap=new LinkedHashMap<Integer,Integer>(list.size());
        for(Entry<Integer,Integer> entry:list)
            sortedMap.put(entry.getKey(),entry.getValue());
        // Return the required array
        int[] ret=new int[k];
        int count=0;
        for(int x:sortedMap.keySet()){
            ret[count++]=x;
            if(count==k)
                break;
        }
        return ret;
    }
}