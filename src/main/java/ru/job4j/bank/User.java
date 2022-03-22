package ru.job4j.bank;

import java.util.Objects;

/**
 * this class is a bank user model. This model contains the fields: passport number and full name.
 * @author DANIL NIKISHIN
 * @version 1.0
 */
public class User {

    private String passport;
    private String username;

    /**
     * A constructor that takes two parameters and assigns their values to an instance of the class
     * @param passport assigns the input parameter passport to an instance field of the class
     * @param username assigns the input parameter username to an instance field of the class
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * the method returns the passport parameter
     * @return the passport parameter belonging to the class instance
     */
    public String getPassport() {
        return passport;
    }

    /**
     * the method assigns the value of the input parameter to an instance field of the passport class
     * @param passport assigned to a field of an instance of a class passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * the method returns the username parameter
     * @return the username parameter belonging to the class instance
     */
    public String getUsername() {
        return username;
    }

    /**
     * the method assigns the value of the input parameter to an instance field of the username class
     * @param username assigned to a field of an instance of a class username
     */
    public void setUsername(String username) {
        this.username = username;
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * The method returns the hash code of the class instance
     * @return a hash code of a class instance by field passport
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    /**
     * Overridden method that returns a string of field values of the class instance
     * @return a string of field values of the class instance
     */
    @Override
    public String toString() {
        return "User{"
                + "passport='" + passport + '\''
                + ", username='" + username + '\''
                + '}';
    }
}
