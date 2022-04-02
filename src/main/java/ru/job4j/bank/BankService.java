package ru.job4j.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> currentAccount = users.get(user.get());
            if (!currentAccount.contains(account)) {
                currentAccount.add(account);
            } else {
                System.out.println("This account already exists!");
            }
        }
    }

    /**
     * This method searches for a user by passport number
     * @param passport helps to find a user
     * @return user
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    public Optional<User> findByPassportOfOptional(String passport) {
        Optional<User> result = Optional.empty();
        for (User user: users.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = Optional.of(user);
                break;
            }
        }
        return result;
    }

    /**
     * the method searches for the user's account by requisite
     * @param passport helps to find a user
     * @param requisite helps to find a user
     * @return Account
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value)
                .stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst());
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
        boolean result = false;
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (src.isPresent() && dest.isPresent()) {
            if (src.get().getBalance() >= amount) {
                src.get().setBalance(src.get().getBalance() - amount);
                dest.get().setBalance(dest.get().getBalance() + amount);
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BankService bankService = new BankService();
        bankService.addUser(new User("321", "Danil Nikishin"));
        Optional<User> optionalUser = bankService.findByPassportOfOptional("3211");
        if (optionalUser.isPresent()) {
            System.out.println(optionalUser.get().getUsername());
        }
    }

}
