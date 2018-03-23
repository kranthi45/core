package java;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.lang.*;
public class Hashmap {
public static void main(str[] args) {
	LinkedHashMap<Integer, String> h=new LinkedHashMap<Integer, String>();
	h.put(102, "kranthi");
	h.put(67, "kumar");       //Here we can use both integers or strings also
	h.put(89, "krishna");
	for(Entry<Integer, String> m:h.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
}
}