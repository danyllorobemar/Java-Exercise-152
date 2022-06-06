package entities;

public class Company extends TaxPayer {

	private int numbersOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anualIncome, int numbersOfEmployees) {
		super(name, anualIncome);
		this.numbersOfEmployees = numbersOfEmployees;
	}
	
	public int getNumbersOfEmployees() {
		return numbersOfEmployees;
	}

	public void setNumbersOfEmployees(int numbersOfEmployees) {
		this.numbersOfEmployees = numbersOfEmployees;
	}

	@Override
	public double tax() {
		if(numbersOfEmployees > 10 ) {
			return getAnualIncome() * 0.14;
		}else return getAnualIncome() * 0.16;
	}
	
	@Override
	public String toString() {
		return getName()
				+ ": $ "
				+ String.format("%.2f",tax());
	}

}
