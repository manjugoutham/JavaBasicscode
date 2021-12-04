package reference;

class SavingsAccount {
	
public static double annualInterestRate;
private double savingsBalance;

public SavingsAccount()
{
annualInterestRate = 0.0;
savingsBalance = 0.0;
}

public SavingsAccount(double intrate, double saveBal) 

{
this.annualInterestRate = intrate;
this.savingsBalance = saveBal;
}

public double calculateMonthlyInterest()
{
double intrate = (savingsBalance * annualInterestRate/12);
savingsBalance = savingsBalance + intrate;
return intrate;
}

public static void modifyInterestRate(double newInteresRate) 
{
annualInterestRate = newInteresRate;
}

public void setSavingsBalance(double newBal)
{
this.savingsBalance = newBal;
}

public double getSavingsBalance()
{
return savingsBalance;
}

public double getAnnualInterestRate() 
{
return annualInterestRate;
}


public static void main(String[] args) 
{
SavingsAccount obj1 = new SavingsAccount();
SavingsAccount obj2 = new SavingsAccount();

obj1.setSavingsBalance(2000.00);
obj2.setSavingsBalance(3000.00);

SavingsAccount.modifyInterestRate(0.04);
obj1.calculateMonthlyInterest();
obj2.calculateMonthlyInterest();

System.out.println("Savings : " +obj1.getSavingsBalance());
System.out.println("New savings : "+obj2.getSavingsBalance());



}
}

