package com.cg.Assignment;

public class BankAccount{
	
	public static void withdraw(double withdamt, double balance) {
		// TODO Auto-generated method stub
		
		if(withdamt <= balance && withdamt > 20000) {
			System.out.println("Withdraw done Successfully");
			balance=balance-withdamt;

			}else if( withdamt < 0) 
			{
				throw new InvalidEntryException("InvalidEntry Fund RuntimeException");
				
			}else if (withdamt > balance && withdamt > 20000) 
			{
				throw new InsufficientFundsException("Insufficient Fund RuntimeException");
				
			}else if(withdamt < 20000) {
				throw new WithdrawLimitException("WithdrawLimitException RuntimeException");
			}
			//return balance;
	}

}

@SuppressWarnings("serial")
class InvalidEntryException extends RuntimeException {
public InvalidEntryException(String message) {
    super(message);
}
}

@SuppressWarnings("serial")
class InsufficientFundsException extends RuntimeException {
public InsufficientFundsException(String message) {
    super(message);
}
}

@SuppressWarnings("serial")
class WithdrawLimitException extends RuntimeException {
public WithdrawLimitException(String message) {
    super(message);
}
}