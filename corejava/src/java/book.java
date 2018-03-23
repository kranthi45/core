package java;
import java.util.TreeSet;
import java.lang.*;
public class book implements Comparable<book> {
private	int id;
private	String name;
private	String author;
book(int id,String name,String author) {
	this.id=id;
	this.name=name;
	this.author=author;
}
@Override
public int compareTo(book b) {
	return name.compareTo(b.name);
}

public static void main(str[] args) {
	book b1=new book(121,"two states","chetan bhagath");
	book b2=new book(101,"midnights children","salman rushdie");
	book b3=new book(131,"the god of small things","arundhati roy");
	TreeSet<book> t=new TreeSet<book>();
	 t.add(b1);
	t.add(b2);
	t.add(b3);
	for(book b:t) {
		System.out.println(b.id+" "+b.name+" "+b.author);
	}
}
}
