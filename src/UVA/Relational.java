import java.util.Scanner ;

public class Relational {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in) ; 
		
		
		int t = input.nextInt() ;
		
		for (int i =0 ; i < t ; i ++){
			
			int x = input.nextInt() ;
			int y = input.nextInt() ;
			
			if (x > y){
				System.out.println(">");
				
			}
			else if (x < y ){
				System.out.println("<");		
			}
			else {
				System.out.println("=");
			}
			
		}
		
		
		
		
		
		
	}

}
