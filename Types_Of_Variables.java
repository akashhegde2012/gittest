class Types_Of_Variables
{
	public static void main(String args[])
	{
		Account a1=new Account("aki","002",1000);
		Account a=new Account("001","akash hegde",500000);
		System.out.println("id="+a.getID());
		System.out.println("name="+a.getName());
		System.out.println("balance= "+a.getBalance());
		System.out.println("balance after credit ="+a.credit(60000));
		System.out.println("balance after debit ="+a.debit(70000));
		System.out.println("Balance after transfering amount to another account ="+a.transferTo(a1,50000));
		System.out.println(a.toString());
		System.out.println(a1.toString());

	}
}
	

