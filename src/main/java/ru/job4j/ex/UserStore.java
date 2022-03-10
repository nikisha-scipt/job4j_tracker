package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User value : users) {
            if (value.getUsername().equals(login)) {
                return value;
            }
        }
        throw new UserNotFoundException("Not found user");
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean isCheck = user.getUsername().length() < 3;
        if (isCheck || !user.isValid()) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e1) {
            e1.printStackTrace();
        } catch (UserNotFoundException e2) {
            e2.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
