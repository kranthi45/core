package java;
import java.util.ArrayList;
//import java.util.Iterator;
public class Student {
private char group;
private int id;
private String name;
Student(String name,int id,char group){
	this.name=name;
	this.id=id;
	this.group=group;
}
public static void main(str[] args) {
	Student s1=new Student("kranthi",45,'b');
	Student s2=new Student("kumar",82,'b');
	Student s3=new Student("phanidam",4582,'b');
	ArrayList<Student> al=new ArrayList<Student>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	/**System.out.println(al.add(s1));  (or)
	System.out.println(al.add(s2));
	Iterator<Student> i=al.iterator();//(or)Iterator i=al.iterator();
	while(i.hasNext()) {
		Student sd=(Student)i.next();
		System.out.println(sd.name+" "+sd.id+" "+sd.group);
	}*/
	for(Student s:al) {
		System.out.println(s.name+" "+s.id+" "+s.group);
	}
}
}