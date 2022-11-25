package org.hotel;

public class Hotel implements places,Menu {
	@Override
	public void chiefName(String name) {
		// TODO Auto-generated method stub
		System.out.println(" the hotel chef name is "+name);
	}
	@Override
	public void noodles(int rate) {
		// TODO Auto-generated method stub
		System.out.println(" noodles rate is "+rate);
	}
	@Override
	public void biriyani(int rate) {
		// TODO Auto-generated method stub
		System.out.println(" biriyani rate is  "+rate);
	}
	@Override
	public void burger(int rate) {
		// TODO Auto-generated method stub
		System.out.println("burger rate is"+rate);
		
	}
	public static void main(String[] args) {
		Hotel h=new Hotel();
		h.chiefName("jona");
		h.biriyani(120);h.burger(150);h.noodles(180);
	}

}
