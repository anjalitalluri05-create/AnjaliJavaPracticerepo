package demo01;

public class Constructor {
	String name;
	int age;
	/*The this keyword is often used to avoid confusion when class 
	attributes have the same name as method or constructor parameters.*/
	public Constructor(String name,int agee) {
		this.name=name;
		age=agee;
		
	}
	void myage(int age){
		this.age=age;
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj=new Constructor("anju",27);
		System.out.println("My name is "+obj.name+" and my age is "+obj.age);
		obj.myage(28);
	}

}
