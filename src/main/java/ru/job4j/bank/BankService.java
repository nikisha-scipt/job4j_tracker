package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!this.users.containsKey(user)) {
            this.users.put(user, new ArrayList<Account>());
        } else {
            System.out.println("Such user has been added");
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        this.users.get(user).add(account);
    }

    public User findByPassport(String passport) {
        User user = null;
        for (Map.Entry<User, List<Account>> entry : users.entrySet()) {
            User entryUser = entry.getKey();
            if (entryUser.getPassport().equals(passport)) {
                user = entryUser;
                break;
            }
        }
        return user;
    }

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

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountSrc = findByRequisite(srcPassport, srcRequisite);
        Account accountDest = findByRequisite(destPassport, destRequisite);
        if (accountSrc != null && accountDest != null) {
            accountSrc.setBalance(accountSrc.getBalance() - amount);
            accountDest.setBalance(accountDest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<User, List<Account>> entry : users.entrySet()) {
            User user = entry.getKey();
            List<Account> accountList = entry.getValue();
            stringBuilder.append("User: ").append(user).append("\n").append("This user has account: ").append(accountList);
        }
        return stringBuilder.toString();
    }

}
