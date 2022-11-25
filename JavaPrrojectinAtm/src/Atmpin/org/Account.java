package Atmpin.org;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
		Scanner input=new Scanner(System.in);
		DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
		//set the customer number
		
		public int getCustomerNumber() {
			return customerNumber;
		}
		public void setCustomerNumber(int customerNumber) {
			this.customerNumber = customerNumber;
			return customerNumber();
		}
		public int getPinNumber() {
			return pinNumber;
		}
		public void setPinNumber(int pinNumber) {
			this.pinNumber = pinNumber;
			return pinNumber();
		}
		public double getCheckingBalance() {
			return checkingBalance;
		}
		public void calcSetCheckingBalance(double amount) {
			checkingBalance = (checkingBalance-amount);
			return checkingBalance();
		}
		public double getSavingBalance() {
			return savingBalance;
		}
		public void calcSetSavingBalance(double amount) {
			savingBalance = (savingBalance-amount);;
			return savingBalance();

		}
		
		public void getCheckingWithDrawInput() {
			System.out.println("checking AccountBlanace :"+moneyFormat.format(checkingBalance));
			System.out.println("Amount you want to withdraw from checking account :");
			double amount=input.nextDouble();
			if((checkingBalance-amount)>=0) 
			{
				calcSetCheckingBalance(amount);
				System.out.println("checking AccountBlanace :"+moneyFormat.format(checkingBalance));
				
				}else {
					System.out.println("balance canot be negative "+"\n");
				
			}

		}
		public void getSavingWithDrawInput() {
			System.out.println("savingBalance :"+moneyFormat.format(savingBalance));
			System.out.println("Amount you want to withdraw from savingBalance :");
			double amount=input.nextDouble();
			if((savingBalance-amount)>=0) 
			{
				calcSetSavingBalance(amount);
				System.out.println("savingBalance :"+moneyFormat.format(savingBalance));
				
				}else {
					System.out.println("balance canot be negative "+"\n");
				
			}

		}
		private int customerNumber;
		private int pinNumber;
		private double checkingBalance=0;
		private double savingBalance=0;
		
		
	

}
