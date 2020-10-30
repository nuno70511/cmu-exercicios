package Bank;

public class SpecialAccount extends Account {

    public SpecialAccount() {
        super();
    }

    public void withdraw(double amount) {
        this.balance -= amount * 1.01;
    }


    public static void main(String[] args) {

    }
}
