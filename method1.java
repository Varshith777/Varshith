/* with drawing amount from atm program*/
class account
{
int acc_no;
String name;
float amount;
void insert(int a,String n,float amt)
{
acc_no=a;
name=n;
amount=amt;
}
void display()
{
System.out.println(name+" "+acc_no+" "+amount);
}
void deposit(float amt)
{
amount=amount+amt;
System.out.println("deposited"+amt);
}
void withdrawn(float amt)
{
if(amount<amt)
System.out.println("Insufficient balance");
else
amount=amount-amt;
System.out.println("Withdrawn"+amt);
}
void checkbalance()
{
System.out.println("balance"+amount);
}
}
class method1
{
public static void main(String args[])
{
account a1=new account();
a1.insert(123444,"K S S GUPTA",56000);
a1.display();
a1.deposit(23000);
a1.checkbalance();
a1.withdrawn(10000);
a1.checkbalance();
a1.display();
}
}
