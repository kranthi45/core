package java;
import java.util.TreeMap;
public class Treemap {
public static void main(String[] args) {
TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
tm.put(108, "kranthi");
tm.put(99, "kumar");
tm.put(123, "krishna");
  for(java.util.Map.Entry<Integer, String> m:tm.entrySet())
    {
	System.out.println(m.getKey()+" "+m.getValue());
     }
}
}