package org.newone;
import java.util.ArrayList;
import java.util.List;

 public class Collectionlist{
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add(78);
		li.add("java");
		li.add(78.20);
		li.add(null);
		System.out.println(li);
        System.out.println(li.size());
        System.out.println(li.get(0));
        System.out.println(li.remove(1));
        Object set = li.set(1, "jona");
        System.out.println(set);
        System.out.println(li);
       // System.out.println(li.set(1, "jona"));
        System.out.println(li.contains(78));
        System.out.println(li.indexOf(78));
        System.out.println(li.lastIndexOf(null));
        li.clear();
        System.out.println(li);
			
		}
	
	}
 
 
  
 
 