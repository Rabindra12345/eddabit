
public class HowMuchIsTruenFalse {

	public static void main(String[] args) {

		 boolean arr[] = {true,false,false,false, false};
		 
		 int total []= countTrue(arr);
		 
		 System.out.println("Total true:"+total[0]);
		 
		 System.out.println("Total false:"+total[1]);
		
	}
	
	public static int[] countTrue(boolean arr[]) {
		
		int len = arr.length;
		int cf=0;
		int ct =0;
		
		
		
		for(int i=0;i<len;i++) {
			
			if(arr[i]==true) {
				ct=ct+1;
				
			}else {
				cf =cf+1;
				
			}
		}
		
		int [] total = {ct,cf};

		return total;
	}
	

}
