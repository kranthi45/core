package java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class files {
public static void main(str[] args) throws IOException {
	FileInputStream fis=new FileInputStream("D:\\java\\test.txt");
	int i=0;
	while((i=fis.read())!=-1)
	{
	System.out.print((char)i);	
	}
}
}
