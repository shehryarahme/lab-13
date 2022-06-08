class Customer{ 
int amount=10000; 
 
synchronized void withdraw(int amount){ 
System.out.println("going to withdraw..."); 
 
if(this.amount<amount){ 
System.out.println("Less balance; waiting for deposit..."); 
try{wait();}catch(Exception e){} 
} 
this.amount-=amount; 
System.out.println("withdraw completed..."); 
} 
 
synchronized void deposit123(int amount){ 
System.out.println("going to deposit..."); 
this.amount+=amount; 
System.out.println("deposit completed... "); 
notify(); 
} 
} 


class Thread1 extends Thread
{
Customer c=new Customer(); 


public void run()
{
c.withdraw(1000);
}
}



class Thread2 extends Thread
{
Customer c=new Customer(); 


public void run()
{
c.deposit(100000);
}
}


class Use{ 
public static void main(String args[]){ 
Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
t1.start();
t2.start();
}
}
