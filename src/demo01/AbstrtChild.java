package demo01;

public class AbstrtChild extends Abstract {
	void animalsound() {
		System.out.println("animal sounds are unique");
	}
	public static void main(String[] args) {
		AbstrtChild obj =new AbstrtChild();
		obj.animalsound();
		obj.animal();
		obj.name="dog";
		System.out.println(obj.name);
		
	}
	

}
