//THIS IS MODEL VIEW CONTROLLER ARCHITECTURE

public class CakeStore {
	//DATA MEMBERS
	private CakeFactory cakeFactory;
	
	//CONSTRUCTOR (populates data members)
	public CakeStore(CakeFactory cakeFactory) {
		this.cakeFactory = cakeFactory;
	}
	
	//MEMBER METHODS
	public Cake OnlineOrder(String type) {
		//Ordering the cake
		Cake cake = cakeFactory.createCake(type);
		
		//Prepare, bake, and box the cake
		cake.prepare();
		cake.bake();
		cake.box();
		
		//Return the finished cake
		return cake;
	}

}
