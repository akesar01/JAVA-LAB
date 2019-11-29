//employee.java
import java.util.*;
import Savings.*;

public class employee{
	public static void main(String args[]){
		int ch;
		Scanner x=new Scanner(System.in);
		System.out.print("Enter number of accounts: ");
		int n=x.nextInt();
		savings_account obj[]=new savings_account[n];
		int i=0;
		while(i<n){
			obj[i]=new savings_account();
			do{
				System.out.print("\n1)Deposit\n2)Withdrawal\n3)Exit\nEnter your choice: ");
				ch=x.nextInt();
				switch(ch){
					case 1: obj[i].deposit();
							break;
					case 2: obj[i].withdrawal();
							break;
					case 3: break;
				}
			}while(ch!=3);
			obj[i].calculateAmount();
			obj[i].display();
			i++;
		}
	}
}

//databank -> accounts.java
package DataBank;

import java.util.*;

abstract public class accounts{
	public String name;
	public String address;
	public int acc_no;
	public double bal;
	abstract public void withdrawal();
	abstract public void deposit();
	Scanner s=new Scanner(System.in);
	public accounts(){
		System.out.print("Enter name: ");
		name=s.next();
		System.out.print("Enter address: ");
		address=s.next();
		System.out.print("Enter acc_no: ");
		acc_no=s.nextInt();
		System.out.print("Enter bal: ");
		bal=s.nextDouble();
	}
	public void display(){
		System.out.println("\nPresent Balance: "+bal);
	}
}

//savings -> savings_account.java
package Savings;

import java.util.*;
import DataBank.*;

public class savings_account extends accounts{
	public float rate;
	public double amount;
	public double deposit;
	public double withdraw;
	Scanner a=new Scanner(System.in);
	public void deposit(){
		super.display();
		System.out.print("Enter amount to deposit: ");
		deposit=a.nextDouble();
		bal=bal+deposit;
	}
	public void withdrawal(){
		super.display();
		System.out.print("Enter amount to withdraw: ");
		withdraw=a.nextDouble();
		bal=bal-withdraw;
	}
	public void calculateAmount(){
		System.out.print("Enter rate of interest: ");
		rate=a.nextFloat();
		amount=(bal*rate)/100.0;
		System.out.println("\nInterest for 1 year: "+amount);
		bal=bal+amount;
	}
	public void display(){
		System.out.println("\nName: "+name+"\nAcc_no: "+acc_no+"\nAddress: "+address+"\nBalance: "+bal+"\n\n");
	}
}