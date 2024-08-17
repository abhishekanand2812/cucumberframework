package amazonimplementation;

public class Search {

	public String displayProductName(Product prodName) {
		
		if(prodName.getProductList().contains(prodName.getProdName())) {
			return prodName.getProdName();

		}
		else {
			return null;
		}
		
		
		
		
		
	}
}
