package entities;

public class LegalPersonData extends Data {
	
	private int numberEmployees;
	
	public LegalPersonData() {
	}

	public LegalPersonData(String name, Double annualIncome, int numberEmployees) {
		super(name, annualIncome);
		this.numberEmployees = numberEmployees;
	}

	public int getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(int numberEmployees) {
		this.numberEmployees = numberEmployees;
	}
	
	@Override
	public double taxesPaid() {
		if (numberEmployees <= 10) {
			return super.getAnualIncome() * 0.16;
		}
		else {
			if (numberEmployees > 10) {
				return super.getAnualIncome() * 0.14;
			}
			return taxesPaid();
		}
	}
	
	
	

}
