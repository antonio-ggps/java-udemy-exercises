package entities;

public class ImportProducts extends Product {
	
	private Double customsFee;
	
	public ImportProducts() {
	}

	public ImportProducts(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return super.getName()
				+ " $ "
				+ String.format("%.2f", totalPrice())
				+ " (Customs Fee: $" 
				+ String.format("%.2f", customsFee) 
				+ " )";
	}
	
	public double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
	

}
