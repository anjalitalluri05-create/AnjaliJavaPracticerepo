package demo01;

public class flow_control_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=18;
		boolean citizen=false;
		int day=2;
		if(age>=18) {
			System.out.println("you can vote");
			if(citizen) {
				System.out.println("you are a citizen");
			}else {
				System.out.println("you should be a citizen");
			}
		}else {
			System.out.println("age should be above or 18");
		}
		switch(day) {
		case 1:
			System.out.println("mobay");
			break;
			default:
				System.out.println("day is not there");
				
		}
		String result =(age>18)?"you vote":"no vote";
		System.out.println(result);

	}

}
