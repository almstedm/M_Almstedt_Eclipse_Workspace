public class Cat extends Animal{
	public Cat() {
	super("Tom")	;
	}
	public Cat(String name){
		super(name);
	}
	public String getSound(){
		return "Meow";
	}
}