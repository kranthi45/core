package java;

import java.io.FileInputStream;
import java.io.IOException;
public class Throws {
	void add() {
		System.out.println("exception");
	}
public static void main(str[] args) throws IOException  {
	Throws t=new Throws();
	t.add();
FileInputStream fis=new FileInputStream("D:\\sample.txt");
int i=0;
while((i=fis.read())!=-1) {
System.out.print((char)i);
}fis.close();
}
}