public class MonstersValley2 {

	public int minimumPrice(int[] dread, int[] price) {

		int cost = price[0];
		int power = dread[0];

		for (int i = 1; i < dread.length; i++) {

			if (power < dread[i]) {

				cost += price[i];
				power += dread[i];

			} else {
				
				int maxDread = 0;
				int maxPos = 0;
				int danger = 0;
				
				for (int j = i; j < dread.length; j++) {
					if (dread[j] > maxDread) {
						maxPos = j;
						maxDread = dread[j];
					}
				}
				
				int dreadInc = dread[maxPos]-power ; 
				int priceInc = price[maxPos]-cost ;
				
				int temp1 =0 ; 
				int temp2 = 0 ;
				
				for (int j = i; j < maxPos; j++) {
					
					if(dreadInc > temp1){
						
						
					}
					
					
					if (dreadInc >=maxDread){
						return cost ;
					}
					
					
				}
			
			

		}

		return cost;
	}

	public static void main(String[] args) {

	}

}
