package MyrezService;

import MyrezEWalletSystem.model.Account;
import MyrezEWalletSystem.model.EWallet;

public class ServiceAccountImpl implements ServiceAccount{
    EWallet eWallet=new EWallet();
    int counterPasswordRetry=0;
    @Override
   public boolean createAccount(Account account){
        boolean isAccountExist=eWallet.getAccounts().stream().anyMatch(acc->acc.getEmail().equals(account.getEmail()));
        if (isAccountExist){return  false;}
        eWallet.getAccounts().add(account);
        return true;

    }

    @Override
    public Account signIn(String Name, String password) {
       return eWallet.getAccounts().stream().filter(acc->acc.getEmail().equals(acc.getEmail())&&acc.getPassword().equals(password)).findFirst().orElse(null);

    }


    @Override
    public Account findAccountByName(String name) {
        return eWallet.getAccounts().stream().filter(acc->acc.getEmail().equals(acc.getEmail())).findFirst().orElse(null);

    }

    @Override
    public String showProfile(String email) {
        Account account = findAccountByName( email);
        if (account==null){
        return " account is not found";}
        else {
            return account.toString();
        }
    }

    @Override
    public boolean deposit(Account account, double amount) {
        Account isAccountExist=  eWallet.getAccounts().stream().filter(acc->acc.getEmail().equals(account.getEmail())).findFirst().orElse(null);

        if (isAccountExist!=null){
            isAccountExist.setBalance(isAccountExist.getBalance()+amount);
            return  true;
        }


        return false;
    }

    @Override
    public boolean withDraw(Account account, double amount) {
        Account isAccountExist=eWallet.getAccounts().stream().filter(acc->acc.getEmail().equals(account.getEmail())).findFirst().orElse(null);
        if (isAccountExist!=null){
            isAccountExist.setBalance(isAccountExist.getBalance()-amount);
            return true;

        }
        return false;
    }

    @Override
    public boolean transfer(Account sender, Account receiver, double amount) {
        Account realSender=eWallet.getAccounts().stream().filter(acc->acc.getEmail().equals(sender.getEmail())).findFirst().orElse(null);

        Account realReciever=eWallet.getAccounts().stream().filter(acc->acc.getEmail().equals(receiver.getEmail())).findFirst().orElse(null);
        if (realSender != null && realReciever != null) {
            realSender.setBalance(realSender.getBalance()-amount);
            realReciever.setBalance(realReciever.getBalance()+amount);
            return  true;
        }

        return false;
    }
}
