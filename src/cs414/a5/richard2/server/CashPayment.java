package cs414.a4.richard2;

import java.util.Date;

public class CashPayment extends Payment {
	
	private double TotalPaid;
	private double balanceCash;
	
	public CashPayment(double amountFee,double totalPaid){
	        this.amountFee = amountFee;   
	        this.TotalPaid = totalPaid;
	        this.balanceCash = totalPaid - amountFee;
	        this.datePaid = new Date();   
	        this.paymentType = PaymentType.Cash;
	    }

	public double getBalanceCash(){
		return balanceCash;
	}
}
