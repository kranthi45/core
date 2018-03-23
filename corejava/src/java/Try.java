package java;

public class Try {
public static void main(str[] args) {
	int a=10,b=0;
	try {int z=a+b;
	System.out.println(z);
	int y=a-b;
	System.out.println(y);
	int x=a/b;
	System.out.println(x);
	int w=a%b;
	System.out.println(w);
	}catch(Exception e) {
		//System.out.println("enter correct b value");
		//System.out.println(e);(or)
		//System.out.println(e.getMessage());(or)
		System.out.println(e.getStackTrace());
		throw new ArithmeticException("enter b value correctly");
	}
}
}