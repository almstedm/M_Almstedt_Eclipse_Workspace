public class Fox extends Animal implements Endangered{
	public Fox(String name) {
		super(name);
	}
	public String getSound(){
		return("ding ding ding ding ding ding");
	}
	@Override
	public void survive(){
		System.out.println("I will survive");
	}
}