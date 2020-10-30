package Bank;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account();
        SpecialAccount specialAccount = new SpecialAccount();

        account.deposit(50);
        specialAccount.deposit(50);

        account.withdraw(10);
        specialAccount.withdraw(10);

        System.out.println(account.getBalance());
        System.out.println(specialAccount.getBalance());

        sc.close();
    }
}
