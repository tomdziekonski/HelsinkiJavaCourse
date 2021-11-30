public class Debt {
private double balance;
private double interestRate;

public Debt (double initialBalance, double initialInterestRate) {
this.balance = initialBalance;
this.interestRate = initialInterestRate;
}
public void printBalance () {
    System.out.println(this.balance);
}
public void waitOneYear () {
    this.balance = this.balance * this.interestRate;
}
public int returnTen () {
 return 10;   
}
public void  returnTwenty () {
    System.out.println(20);
    
}
}
