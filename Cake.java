import java.util.ArrayList;

public abstract class Cake {
	//DATA MEMBERS
	protected String name;
	protected String baseFlavor;
	protected ArrayList <String> ingredients;
	
	//MEMBER METHODS
	public void prepare() {
		System.out.println("Preparing " + this.toString());
	}
	
	public void bake() {
		System.out.println("Baking " + this.toString());
	}
	
	public void box() {
		System.out.println("Boxing " + this.toString());
	}
	
	public String toString() {
		return name + " with a base flavor of " + baseFlavor + ".";
	}
}
