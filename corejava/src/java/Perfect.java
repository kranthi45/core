package java;
import java.util.Scanner;
public class Perfect {
public static void main(str[] args) {
	int n,a=0;
	Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				a=a+i;
			}
		}
		if(n==a) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}
		sc.close();
}
}