public class FunHouse {
    
	public static int getSum(int[] numArray, int start, int stop){
		int sum= 0;
		for(int i = start;i<=numArray[stop];i++){
		sum = sum +numArray[i];
	
		}
		return sum;
	}


		
		
		public static int getCount(int[] numArray, int val)
		{int amount=0;
			for(int i=0;i < numArray.length;i++){
				if(numArray[i]==val){
					amount++;
				}

			}
			return amount;
		}

		
		


}

