import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class FileReader {
    
    
    public static void main(String[] args) throws FileNotFoundException {
   
        File file = new File("/Users/andresvila/Desktop/Poem.txt");
        Scanner scan = new Scanner(file);
        
        Map<String,Integer> map = new HashMap<>(); 
        while (scan.hasNext())
        {
            
            String val = scan.next();
            
            if(map.containsKey(val) == false)
                map.put(val,1);
            
            else
            {
                int count = (int)(map.get(val)); 
                map.remove(val);
                map.put(val,count+1);
            }
        }
        
        Set<Map.Entry<String, Integer>> set = map.entrySet(); 
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(set);
        
        Collections.sort(sortedList, (Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) -> (b.getValue()).compareTo( a.getValue() ));
     
        sortedList.forEach((Map.Entry<String, Integer> i) -> {
            System.out.println(i.getKey()+" ---> "+i.getValue());
        });
    }
}
    

