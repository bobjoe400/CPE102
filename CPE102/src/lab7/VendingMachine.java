package lab7;

import java.util.LinkedHashMap;

public class VendingMachine {

	private LinkedHashMap<Product, Integer> products;
	private CoinSet coins;
	
	private double total;
	private double totalPurchased;

	public VendingMachine() {
		products = new LinkedHashMap<Product, Integer>();
		coins = new CoinSet();
		total = 0;
		totalPurchased = 0;
	}

	public LinkedHashMap<Product, Integer> getProducts(){
		return products;
	}

	public void insertCoin() {
		// TODO Auto-generated method stub
		coins.addCoin();
		updateTotal();
	}

	public boolean purchase(Product p){
		// TODO Auto-generated method stub
		if(total < p.getPrice()){
			throw new VendingException("You don't have enough funds");
		}else if(products.get(p) == 0){
			throw new VendingException("That product is out of stock");
		}else{
			totalPurchased += p.getPrice();
			products.put(p, products.get(p)-1);
			updateTotal();
			return true;
		}
	}

	public void addProduct() {
		// TODO Auto-generated method stub
		Product p = new Product();
		products.put(p, Product.makeValue());
	}

	public void removeCoins() {
		// TODO Auto-generated method stub
		coins.returnCoins();
	}
	
	public void updateTotal(){
		total = coins.sum() - totalPurchased;
	}
}
