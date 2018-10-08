package com.codewr.user;

public class UserDao {

    public void save(User order) throws UserSaveException {

        if (order == null) {
            throw new UserSaveException("Order is empty!");
        }

        // persist it
    }

    public void update(User order) throws UserUpdateException, UserNotFoundException {

        if (order == null) {
            throw new UserUpdateException("Order is empty!");
        }

        // if order is not available in database
        throw new UserNotFoundException("Order is not exists");

    }

}
