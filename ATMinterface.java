package Phase2;

import java.util.Scanner;

class UserAccount{
	private double balance;
	public UserAccount(double bal) {
		this.balance=bal;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount) {
		balance=balance+amount;
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
		}
		else {
			System.out.println("insufficient balance");
		}
	}
}
class Atm{
	private UserAccount userAccount;
	public Atm(UserAccount account) {
		this.userAccount=account;
	}
	public void option() {
		System.out.println("Welcome to our bank ATM! select desired option");
		System.out.println("1. for Withdraw");
		System.out.println("2. for Deposit");
		System.out.println("3. to check balance");
		System.out.println("4. Clear and Exit");
		System.out.println("enter your choice: ");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option) {
		case 1:
			withdraw();
			break;
		case 2:
			deposit();
			break;
		case 3:
			checkBalance();
			break;
		case 4:
			System.out.println("thanks for using ATM. visit again!");
			break;
		default:
			System.out.println("select a valid option");
		}
	}
	
	public void withdraw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount you want to withdraw: ");
		double amount=sc.nextDouble();
		if(amount<=userAccount.getBalance()) {
			userAccount.withdraw(amount);
			System.out.println("withdraw of "+amount+" is successfully done");
		}
		else {
			System.out.println("insufficient balance!");
		}
	}

public void deposit() {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the amount you want to deposit: ");
double amount=sc.nextDouble();
userAccount.deposit(amount);
System.out.println(amount+" is deposited to your acount successfully!");
}
public void checkBalance() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Your acount balance is: "+userAccount.getBalance());

}
}
public class ATMinterface {
	
public static void main(String[] args) {
	UserAccount userAccount= new UserAccount(100000.0);
	Atm atm=new Atm(userAccount);
	while(true) {
	atm.option();
}

}}
