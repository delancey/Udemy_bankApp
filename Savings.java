public class Savings extends Account{
    //List properties specific to savings
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;

    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
        // System.out.println("ACCT NUM: " + this.accountNumber);
        // System.out.println("New savings account");        
    }

    @Override
    public void setRate(){
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random()* Math.pow(10, 3));
        safetyDepositBoxKey = (int)(Math.random()* Math.pow(10, 4));
    }

    //constructor to initialize settings for savings

    //list methods specific to savings
    public void showInfo(){
        super.showInfo();
        System.out.println(
            "Your savings account features: " + 
            "\n Safety Deposit Box ID: " + safetyDepositBoxID +
            "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );

    }

    
}