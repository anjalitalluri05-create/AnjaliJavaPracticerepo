package demo01;

public class Methods {
	static void mymethod() {
		System.out.println("anju");
	}
	static int age(int myage) {
		return myage+2;
		
	}
	//i am add Anju
	static void vote(int ageis) {
		if(ageis>=18) {
			System.out.println("you can vote testing pull command ");
		}else {
			System.out.println("you can not vote under age");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mymethod();
		System.out.println(age(16));
		vote(20);

	}

}
