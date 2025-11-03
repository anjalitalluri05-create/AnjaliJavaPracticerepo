package demo01;

public class ObjectCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw=new Car();
		Car honda=new Car();
		bmw.colour="Orange";
		bmw.price=100000000;
		bmw.model="nexa";
		honda.model="i10";
		System.out.println(bmw.colour);
        bmw.method1();
        bmw.price();
        honda.method2();
	}

}
