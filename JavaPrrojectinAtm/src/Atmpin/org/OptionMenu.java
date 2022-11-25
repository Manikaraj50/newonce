package Atmpin.org;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	
		Scanner menuInput=new Scanner(System.in);
		DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
		HashMap<Integer,Integer> data=new HashMap<>();
		/*validate the information customer number and pin number*/
		public void getLogin() throws IOException {
			int x=1;
			do {
				try {
					data.put(12345678, 1234);
					data.put(987654321,9876);
					System.out.println("Welcome to the java project");
					System.out.println("Enter the customer Number");
					setCustomerNumber(menuInput.nextInt());
					System.out.println("Enter the customer Pin");
					setPinNumber(menuInput.nextInt());
					
				}catch(Exception e) {
					System.out.println("\n"+"invali character(s).onlyNumbers"+"\n");
					x=2;
				}
				for ( Entry<Integer,Integer>entry: data.entrySet()) {
					
				}
				System.out.println("Wrong Customer Number or pin number");
				
			}while(x==1);
		}
		public void getAccountType() {
			System.out.println("Select the account you wnat this :");
			System.out.println("Type 1 -view Balance");
			System.out.println("Type 2 -WithDraw Funds");
			System.out.println("Type 3 -Deposit Funds");
			System.out.println("Type 4 -Exit");
			
			selection= menuInput.nextInt();
			switch(selection) {
			case 1:
				System.out.println("checking bank balance :"+moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;
			case 2:
				getCheckingWithDrawInput();
				getAccountType();
				break;
			case 3:	
				getCheckingDepositInput();
				getAccountType();
				break;
				
				
				
	
								


			
		}
		
		}

}
