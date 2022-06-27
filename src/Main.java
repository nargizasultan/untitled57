public class Main {
    public static void main(String[] args) {
       BankAccount bankAccount=new BankAccount();
       bankAccount.deposit(20000);
        System.out.println(bankAccount.getAmount());
        while (true){
            bankAccount.withDraw(6000);
        }
    }
}