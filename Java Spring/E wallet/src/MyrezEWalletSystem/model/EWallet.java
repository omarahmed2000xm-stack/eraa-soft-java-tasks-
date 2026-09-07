package MyrezEWalletSystem.model;

import java.util.ArrayList;
import java.util.List;

public class EWallet {
    private final String name = "Myrez e wallet";
    List<Account>accounts=new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }
}
