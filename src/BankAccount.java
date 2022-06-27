public class BankAccount {
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        this.amount+=sum;
    }


    public void withDraw(int sum){
        if (this.amount<sum){
            throw new LimitException("Nedostatochno deneg", amount);
        }else {
            System.out.println(this.amount -= sum);
        }

    }
}
