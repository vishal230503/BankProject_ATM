package com.nt.bank;

import java.util.Scanner;

class CheckPinno {
	int pinno;
	boolean k = false;
	boolean verify(int pinno) {
		if (pinno==1111 && pinno==2222 && pinno==3333) {
			System.out.println("Entered pin No is correct");
		}
		return k;
	}
}
class Balance {
	int bal=2000;
	void getbalance() {
		System.out.println(bal);
	}
}
class Withdraw {
	void withdrawamountbalance(int bal,int amount) {
		if(amount<=bal) {
			bal=bal-amount;
			System.out.println("Amount Withdraw Successfully\n");
			System.out.println("Remaining balance is: " + bal);
		}
		else {
			System.out.println("Insufficient funds");
		}
	}
}
class Deposit {
	private int deposit;
	
	void deposit(int amount,int bal) {
		deposit = bal+amount;
		System.out.println("Amount deposited Successfully!\n");
		System.out.println("Available balance: " + deposit);
	}
}
public class Banking {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("======WELCOME TO ATM======");
		System.out.println("Enter the PIN No: ");
		int pin = s.nextInt();
		if(pin==1111 || pin==2222 || pin==3333) {
			System.out.println("Entered pin is correct\n");
			System.out.println("====User Choise!====");
			Balance b = new Balance();
			System.out.println("\n**************\n1.WITHDRAW\n2.DEPOSIT\n3.Check Balance\n4.Exit");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the amount\n");
			    Withdraw wd = new Withdraw();
			    int amount=s.nextInt();
			    wd.withdrawamountbalance(b.bal, amount);
			    System.out.println("Thanking you for using this ATM");
			    break;
			case 2:
				System.out.println("Enter the deposit amount: \n");
				Deposit dt = new Deposit();
				int cash = s.nextInt();
			    dt.deposit(cash, b.bal);
			    System.out.println("Thanking you for using this ATM");
			    break;
			case 3:
				System.out.println("Balance :"+b.bal+"\n");
				System.out.println("Thanking you for using this ATM");
				System.out.println(" ");
				
			case 4:
				System.out.println("Thanking you for using this ATM");
				System.exit(0);
				break;	
				default:
					System.out.println("Please Enter the details correctly");
			}//Switch case end
		}
		else
		{
			System.out.println("Please enter correct pin no\n");
		}
		s.close();
	}
}
