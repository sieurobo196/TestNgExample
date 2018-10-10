package com.codewr.user;

public class UserDao {

    public void save(User user) throws UserSaveException {
        if (user == null) {
            throw new UserSaveException("User is empty!");
        }
        // persist it
    }

    public void update(User user) throws UserUpdateException, UserNotFoundException {
        if (user == null) {
            throw new UserUpdateException("User is empty!");
        }
        // if order is not available in database
        throw new UserNotFoundException("User is not exists");
    }

}
