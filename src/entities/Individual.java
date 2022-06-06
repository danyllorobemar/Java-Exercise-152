package entities;

public class Individual extends TaxPayer {

	private Double heathExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double heathExpenditures) {
		super(name, anualIncome);
		this.heathExpenditures = heathExpenditures;
	}

	@Override
	public double tax() {
		if (getAnualIncome() < 20000) {
			return (getAnualIncome() * 0.15) - (heathExpenditures * 0.5);
		}else {
			return (getAnualIncome() * 0.25) - (heathExpenditures * 0.5);
		}
	}
	
	@Override
	public String toString() {
		return getName()
				+ ": $ "
				+ String.format("%.2f", tax());
	}

}
