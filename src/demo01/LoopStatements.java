package demo01;

public class LoopStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while loop
		int i=1;
		int[] numbers= {21,23,26};
		while(i<6) {
			System.out.println(i);
			i++;
			
		}
		//for loop
	  for (int j=0;j<=10;j+=2) {
		  System.out.println(j);
		  
	  }
	  //for each loop
	  for (int num:numbers){
		  System.out.println(num);
	  }
			
		
			

	}

}
