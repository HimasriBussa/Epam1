import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class DescendingWeights {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long N = Long.parseLong(str[0]);
        long k = Long.parseLong(str[1]);
        
        HashMap<Long, Long> h = new HashMap<Long, Long>();
        String[] nStr = br.readLine().split(" ");
        for(int i = 0; i < N; i++){
            long v = Long.parseLong(nStr[i]);
            h.put(v, v%k);
        }
        
        Map<Long, Long> h1 = sortByValue(h); 
        for(Map.Entry<Long, Long> e : h1.entrySet()){
            System.out.print(e.getKey()+" ");
        }
       // System.out.println(h1);
    }
    
    public static HashMap<Long, Long> sortByValue(HashMap<Long, Long> hm) {
        // Creating a list from elements of HashMap 
        List<Map.Entry<Long, Long> > list = 
               new LinkedList<Map.Entry<Long, Long> >(hm.entrySet()); 
  
        // Sorting the list
        Collections.sort(list, new Comparator<Map.Entry<Long, Long> >() { 
            public int compare(Map.Entry<Long, Long> o1,  
                               Map.Entry<Long, Long> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
          
        // put data from sorted list to hashmap  
        HashMap<Long, Long> temp = new LinkedHashMap<Long, Long>(); 
        for (Map.Entry<Long, Long> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    }
}
