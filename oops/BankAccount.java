package oops;

public class BankAccount {
    private String acNumber;
    private double acBalance;
    private String customerName;
    private String Email;
    private int customerPhoneNo;

    //creating a constructor
    public BankAccount()
    {
        this("543430",3000,"default name","@default",99990000);
        System.out.println("Empty constructor called");
    }

    public BankAccount(String acNumber, double acBalance, String customerName, String email, int customerPhoneNo){
        this.acNumber = acNumber;
        this.acBalance = acBalance;
        this.customerName = customerName;
        this.Email = email;
        this.customerPhoneNo = customerPhoneNo;

    }

    public BankAccount(String customerName, String email, int customerPhoneNo) {
        this("9999",1000.55, customerName, email, customerPhoneNo);
    }

    public String getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(String acNumber) {
        this.acNumber = acNumber;
    }

    public double getAcBalance() {
        return acBalance;
    }

    public void setAcBalance(double acBalance) {
        this.acBalance = acBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(int customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public void deposit(double depositAmnt)
    {
        this.acBalance += depositAmnt;
        System.out.println("Deposit of "+ depositAmnt+" is successful, available balance = "+ acBalance);
    }
    public void withdrawl(double withdrawlAmnt) {
        if (this.acBalance - withdrawlAmnt < 0) {
            System.out.println("only " + acBalance + " Available to withdraw, process failed retry");
        } else {
            acBalance -= withdrawlAmnt;
            System.out.println("Withdrawal of " + withdrawlAmnt + " processed. Remaining balance = " + acBalance);
        }
    }

}
