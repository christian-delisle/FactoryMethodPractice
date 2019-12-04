
public class MainDriver {

	public static void main(String[] args) {
		//CREATE A NEW FACTORY
		CakeFactory cakeFactory = new CakeFactory();
		//CREATE A CAKE STORE
		CakeStore store = new CakeStore(cakeFactory);
		
		//CREATE CAKES
		Cake cake0 = store.OnlineOrder("Lemon");
		Cake cake1 = store.OnlineOrder("Chocolate");
		Cake cake2 = store.OnlineOrder("Vanilla");
	}

}
