package game;

public class Key implements Item {

	private String name;
	
	public Key(){
		this.name = "key";
	}
	
	public void describe() {
		System.out.print("a key");

	}

	public String getName() {
		return name;
	}
}
