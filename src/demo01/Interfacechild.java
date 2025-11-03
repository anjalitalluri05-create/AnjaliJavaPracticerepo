package demo01;

public class Interfacechild implements dog {
	public void bread() {
		System.out.println("many breads in dog's");
	}
	public void cute() {
		System.out.println("dogs are very cute animals");
	}
	public void speed() {
		System.out.println("dogs are faster");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Interfacechild obj=new Interfacechild();
	//since variables are static we need to access through class reference
	System.out.println(dog.name);
	obj.bread();
	obj.cute();
	obj.speed();

	}

}
