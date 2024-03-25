package entity;

public class billing {

	 int memberId ;
	 int amount;
	 String AmountStatus ;
	 String edate;
	 
	 
	 
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getAmountStatus() {
		return AmountStatus;
	}
	public void setAmountStatus(String amountStatus) {
		AmountStatus = amountStatus;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	 
	 
}
