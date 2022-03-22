package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * this class is general service
 * @author DANIL NIKISHIN
 * @version 1.0
 */
public class BankService {

    /**
     * This field contains all system users with accounts linked to them
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * This method should add the user to the system
     * @param user is a user and is added to the bank service
     */
    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * the method is to add a new account to the user
     * @param passport helps to find a user in users
     * @param account adds new account user if it doesn't already exist.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            if (!users.get(user).contains(account)) {
                users.get(user).add(account);
            }
        }
    }

    /**
     * This method searches for a user by passport number
     * @param passport helps to find a user
     * @return user
     */
    public User findByPassport(String passport) {
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                return key;
            }
        }
        return null;
    }

    /**
     * the method searches for the user's account by requisite
     * @param passport helps to find a user
     * @param requisite helps to find a user
     * @return Account
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account account = null;
        if (user == null) {
            return null;
        }
        for (Account acc : users.get(user)) {
            if (acc.getRequisite().equals(requisite)) {
                account = acc;
                break;
            }
        }
        return account;
    }

    /**
     * the method is designed to transfer money from one account to another account
     * @param srcPassport account passport from which we transfer
     * @param srcRequisite account from which we are transferring
     * @param destPassport account passport where we transfer
     * @param destRequisite where to transfer the account
     * @param amount how much do we translate
     * @return true if there are such accounts and if the account from which we are transferring more amount
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc != null && accountDest != null) {
            if (accountSrc.getBalance() >= amount) {
                accountSrc.setBalance(accountSrc.getBalance() - amount);
                accountDest.setBalance(accountDest.getBalance() + amount);
            }
            rsl = true;
        }
        return rsl;
    }

}
