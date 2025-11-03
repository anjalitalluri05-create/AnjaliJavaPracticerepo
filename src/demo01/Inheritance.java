package demo01;
	
public class Inheritance {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj1=new Dog();
		obj1.colour="Brown";
		obj1.bread="germanshepard";
		System.out.println("my dog is"+obj1.colour);
		obj1.Bark();
		obj1.size();
		obj1.cute();
		System.out.println("-------------");
		Pug obj= new Pug();
		obj.colour="Black";
		obj.bread="Pug";
		System.out.println("my dog is"+obj.colour);
		obj.Bark();
         obj.cute();
	}


}

 