package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return super.payment()+1.1*additionalCharge;
	}
	
}
