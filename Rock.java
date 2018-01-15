package game;

public class Rock implements Item {
	
	private String name;
	/**
	 * Constructor
	 */
	public Rock(){
		this.name = "rock";
	}
	
	public void describe() {
		System.out.print("a rock on the floor");
		
	}
	
	public String getName() {
		return name;
	}

}
