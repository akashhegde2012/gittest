class Account
{
        private String name;
        private String id;
        private int balance=0;
public Account(String name,String id)
{this.name=name;
 this.id=id;
}
public Account(String name,String id,int balance)
{this.name=name;
 this.id=id;
 this.balance=balance;
}
        public String getID()
        {
        return id;}
        public String getName()
        {return name;
        }
        public int getBalance()
        {return balance;
        }
        public int credit(int amount)
        {balance=balance+amount;
        return balance;
        }
        public int debit(int amount)
        {if(amount<=balance)
                balance=balance-amount;
        else
                System.out.println("amount excede balance");
        return balance;
        }
        public int transferTo(Account another,int amount)
        {if (amount<=balance)
        {
                balance -= amount;
                another.balance+=amount;}
        else
        System.out.println("amount exceded the balance");
        return balance;
        }
        public String toString()
        {return"Account [id?"+id+" name?"+name+" balance?"+balance+"]";}
}
