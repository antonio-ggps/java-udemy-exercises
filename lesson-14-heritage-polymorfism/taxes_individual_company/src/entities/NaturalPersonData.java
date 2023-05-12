package entities;

public class NaturalPersonData extends Data {
	
	private Double healthExpenditures;
	
	public NaturalPersonData() {
	}

	public NaturalPersonData(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenses() {
		return healthExpenditures;
	}

	public void setHealthExpenses(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double taxesPaid() {
		if (super.getAnualIncome() < 20000.00) {
			return super.getAnualIncome() * 0.15 - (healthExpenditures * 0.5);
		}
		
		else {
			if (super.getAnualIncome() >= 20000.00) {
				return super.getAnualIncome() * 0.25 - (healthExpenditures * 0.5);
			}
			
			return taxesPaid();
		}
		
		

	}
	
}
