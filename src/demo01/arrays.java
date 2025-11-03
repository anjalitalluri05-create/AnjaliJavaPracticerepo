package demo01;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] car= {"honda","BMW","suzuki","fortuner"};
		int[] num=new int[] {11,12,15,17,18};
		car[1]="bike";
		System.out.println(car[1]);
		System.out.println(num[2]);
		//loop through arrays
		for(int i=0;i<car.length;i++) {
			System.out.println(car[i]);
		}
		//for each
		for(int j:num) {
			System.out.println(j);
		}
		
		//multi dimensional array
		int[][] n= {{1,5,7},{7,8,6,9,4}};
		System.out.println(n[1][2]);
		System.out.println("rows "+ n.length);
		System.out.println("colums in row 0"+ n[0].length);
		System.out.println("columns in rows 1"+ n[1].length);
		//looping through multi dimension array
		for(int row=0;row<n.length;row++) {
			for(int col=0;col<n[row].length;col++) {
			  System.out.println("n[" + row + "][" + col + "] = " + n[row][col]);

			}
		}

	}

}
