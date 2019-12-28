public class Bank
{
   double balance;
   public Bank(double balance)
   {
       this.balance = balance;
   }
   void deposite(double dAmount) throws InsufficientFundsException
   {
       if(dAmount < 0)
           throw new InsufficientFundsException(dAmount);
       balance += dAmount;
//       if()
   }
   double showBalance()
   {
       return  balance;
   }
   void withdrawal(double dAmount) throws InsufficientFundsException
   {
       if(balance - dAmount<0)
       {
         throw new InsufficientFundsException(dAmount,balance);
       }
       else
       {
           balance -= dAmount;
       }
   }


}
