class Account					//outer class
{
	static int principle;
	static int rate;
	static int time;
	
	Account(int principle, int rate,int time)
	{
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}

	static class Interest			//inner c;ass
	{
		int interest = (principle*rate*time)/100;
	
	}

}

class Q6
{
	public static void main(String args[])
	{
		Account a1 = new Account(100,10,5);
		Account.Interest i1 = new Account.Interest();
		
		
		System.out.println("Interest is "+i1.interest);
		
	}


}