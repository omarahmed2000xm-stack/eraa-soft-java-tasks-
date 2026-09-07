package MyrezService;

import MyrezEWalletSystem.model.Account;

public interface ServiceAccount {
    boolean createAccount(Account account);

    Account signIn(String email, String password);

    Account findAccountByName(String name);

    String showProfile(String email);

    boolean deposit(Account account, double amount);

    boolean withDraw(Account account, double amount);

    boolean transfer(Account sender, Account receiver, double amount);

}
