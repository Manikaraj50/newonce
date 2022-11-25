package org.newone;

import java.util.ArrayList;
import java.util.List;

public class One {
	public static void main(String[] args) {
		List<Integer> s=new ArrayList<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		
	}
	

}
