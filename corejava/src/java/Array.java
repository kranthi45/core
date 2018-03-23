package java;

import java.util.ArrayList;
import java.util.Iterator;
public class Array {
public static void main(str[] args) {
	/**ArrayList<String> al=new ArrayList<String>();  //{for particular type mention type like String,int etc in the Array list <> coloum}
	al.add("kranthi");
	al.add("kumar");
	//System.out.println(al);             (or)
	//System.out.println(al.toString());  (or)
	//for(String s:al) {
		//System.out.println(s);           (or)
	//}
	ArrayList<String>al1=new ArrayList<String>();
	al1.add("mahesh");
	al.addAll(al1);
	Iterator i=al.iterator();
	while(i.hasNext()) {    
		System.out.println(i.next());  //(or)
	}
	System.out.println(al.toString());    //(or)*/
	ArrayList al=new ArrayList();
	al.add("kranthi");
	al.add(45);
	al.add(55.5f);
	System.out.println(al);
}
}