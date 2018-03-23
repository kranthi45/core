package java;
import java.util.Scanner;
class Ato {
	int pin=1234;
	int Available=5000;
	void add(){int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter your four digit pin");
	int p=sc.nextInt();
	if(pin==p) {
		System.out.println("press 1 for Available balance");
		System.out.println("press 2 for deposit");
		System.out.println("press 3 for withdrawl");
		System.out.println("press 4 for pin change");
		System.out.println("press 5 for exit");
		int a=sc.nextInt();
		if(a==1) {
			System.out.println("Available balance is:"+this.Available);
			add();
		}
		else if(a==2) {System.out.println("please enter deposit amount");
	      int z=sc.nextInt();
	      this. Available=this.Available+z;
	       System.out.println("Available amount is:"+this.Available);
	       add();
	}
		else if(a==3) {
			System.out.println("enter withdrawl amount");
		      int w=sc.nextInt();
		      if(w<=this.Available) {
		    	 this.Available=this.Available-w;
		    	  System.out.println("available balance is:"+this.Available);
		    	  add();
		      }
		      else {
		    	  System.out.println("insufficient funds");  }
		}
		      else if(a==4) {
		    	  System.out.println("enter new pin");
			       n=sc.nextInt();
			       this.pin=n;
			       add();
		      }
		      else {System.out.println("you have sucessfully exited");}
	}
	else {
		System.out.println("please enter correct pin");}
	sc.close();
}
	}
class Atm extends Ato {
public static void main(str[] args) {
	Atm o=new Atm();
	o.add();
}
}


