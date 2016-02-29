
public class Payroll {

	private double IdNumber;
	private double grossPay;
	private double stateTax;
	private double federalTax;
	private double FICA;
	public double getIdNumber() {
		return IdNumber;
	}
	public void setIdNumber(double idNumber) {
		IdNumber = idNumber;
	}
	public double getGrossPay() {
		return grossPay;
	}
	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}
	public double getStateTax() {
		return stateTax;
	}
	public void setStateTax(double stateTax) {
		this.stateTax = stateTax;
	}
	public double getFederalTax() {
		return federalTax;
	}
	public void setFederalTax(double federalTax) {
		this.federalTax = federalTax;
	}
	public double getFICA() {
		return FICA;
	}
	public void setFICA(double fICA) {
		FICA = fICA;
	}
	
	public double getNetPay()
	{
		return grossPay - stateTax - federalTax - FICA;
	}
	
	
	
	
}
