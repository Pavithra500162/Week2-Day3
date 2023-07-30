package week2.day3;

public class AxisBank extends BankInfo{
	int dAmount=2000;
	public void deposit()
	{
		System.out.println("Amount deposited: "+dAmount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank a=new AxisBank();
		a.deposit();
		BankInfo b=new BankInfo();
		b.deposit();
	}

}
