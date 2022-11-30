package abstractclasses;

abstract class Dog {
	
	public void bark() {
		System.out.println("Bark!");
	}
}
	
class Chihuahua extends Dog {
	public void poop() {
		System.out.println("Dog pooped!");
	}
}


public class Abstract {

	public static void main(String[] args) {
		Chihuahua c = new Chihuahua();
		c.bark();
		c.poop();

	}
}

