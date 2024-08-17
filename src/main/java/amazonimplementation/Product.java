package amazonimplementation;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String productName;
	private int price;

	public Product(String prodName, int price) {
		this.productName = prodName;
		this.price = price;
	}
//This is abhishek's code
	public String getProdName() {
		return productName;
	}

	public void setProdName(String prodName) {
		this.productName = prodName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<String> getProductList() {

		List<String> productList = new ArrayList<String>();
		productList.add("Apple macbook pro");
		productList.add("Apple iphone12 pro");
		productList.add("Apple iphone15 pro");
		return productList;

	}

}
