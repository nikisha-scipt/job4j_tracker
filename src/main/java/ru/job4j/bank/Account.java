package ru.job4j.bank;

import java.util.Objects;

/**
 * This class describes the bank account model. This model contains fields: balance and requisite.
 * @author DANIL NIKISHIN
 * @version 1.0
 */
public class Account {

    private String requisite;
    private double balance;

    /**
     * A constructor that takes two parameters and assigns their values to an instance of the class
     * @param requisite assigns the input parameter requisite to an instance field of the class
     * @param balance assigns the input parameter balance to an instance field of the class
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * the method returns the required parameter
     * @return the requisite parameter belonging to the class instance
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * the method assigns the value of the input parameter to an instance field of the requisite class
     * @param requisite assigned to a field of an instance of a class requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * the method returns the balance parameter
     * @return the balance parameter belonging to the class instance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * the method assigns the value of the input parameter to an instance field of the balance class
     * @param balance assigned to a field of an instance of a class balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * overridden method takes another instance of the same class as input and compares it by class fields
     * @param o another instance of this class
     * @return true if both instances are equal in margins, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * The method returns the hash code of the class instance
     * @return a hash code of a class instance by field requisite
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }

    /**
     * Overridden method that returns a string of field values of the class instance
     * @return a string of field values of the class instance
     */
    @Override
    public String toString() {
        return "Account{"
                + "requisite='"
                + requisite
                + '\''
                + ", balance="
                + balance
                + '}';
    }
}
