package entities;

public class OrderItens {
	private String productName;
	double priceProduct;
	int quantity;
	double subTotal;
	
	public OrderItens() {
	}

	public OrderItens(String productName, double priceProduct, int quantity) {
		this.productName = productName;
		this.priceProduct = priceProduct;
		this.quantity = quantity;
		
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void calculateSubTotal() {
	    subTotal = priceProduct * quantity;
	}

	public double subTotal(double priceProduct,int quantity) {
		return priceProduct * quantity;
	}
	
	public double getSubTotal() {
	    return subTotal;
	}

	
	public String toString() {
		return "Product NAME:" +   productName +  " ," + "QUANTITY:" + quantity + " ," + "SUBTOTAL:" + 
	String.format("%.2f",subTotal(priceProduct, quantity));
	}
	
	
}
