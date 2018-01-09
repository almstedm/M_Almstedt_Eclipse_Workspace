public class Zoo {
	public static void main(String[] args){
		Animal a1 = new Cat("Bessie"); 
		a1.eat();
		a1.sleep();
		a1.speak();
		
		Cat c1 = new Cat();
		c1.eat();
		c1.sleep();
		c1.speak();
		
		Alligator  L1 = new Alligator();
		L1.eat();
		L1.sleep();
		L1.speak();
		
		Dog d1 = new Dog();
		d1.eat();
		d1.sleep();
		d1.speak();
	}
}