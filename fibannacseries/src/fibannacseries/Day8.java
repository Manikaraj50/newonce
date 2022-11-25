package fibannacseries;



public class Day8 {
	   static boolean reachNexTLevel(int a,int b,int c) {
		  boolean res=((a+b ==c)||(a-b==c) || (a*b==c) || (a/b==c && a%b==c));
		  System.out.println(res);
		return res;
		 
		
	}
	public static void main(String[] args) {
          Day8.reachNexTLevel(2,3,50);
          
          
	
	 }
	
		
		
	}
	
	
		
	
	

		
	

	
	
     

 



		




