
public class CakeFactory {
	public Cake createCake(String type) {
		
		if (type.equals("Chocolate")) {
		return new ChocolateCake();
		}
		
		else if (type.equals("Lemon")) {
		return new LemonCake();
		}
		
		else {
			return new VanillaCake();
		}
	}

}
