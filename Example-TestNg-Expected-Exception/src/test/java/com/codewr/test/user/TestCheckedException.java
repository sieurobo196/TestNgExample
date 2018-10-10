package com.codewr.test.user;

import com.codewr.user.User;
import com.codewr.user.UserDao;
import com.codewr.user.UserNotFoundException;
import com.codewr.user.UserSaveException;
import com.codewr.user.UserUpdateException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCheckedException {

    UserDao userBo;
    User data;

    @BeforeTest
    void setup() {
        userBo = new UserDao();

        data = new User();
        data.setId(1);
        data.setCreatedBy("codewr");
    }

    @Test(expectedExceptions = UserSaveException.class)
    public void throwIfOrderIsNull() throws UserSaveException {
        System.out.println("throwIfOrderIsNull");
        userBo.save(null);
    }

    /*
	 * Example : Multiple expected exceptions
	 * Test is success if either of the exception is throws
     */
    @Test(expectedExceptions = {UserUpdateException.class, UserNotFoundException.class})
    public void throwIfOrderIsNotExists() throws UserUpdateException, UserNotFoundException {
        System.out.println("throwIfOrderIsNotExists");
        userBo.update(data);
    }

}
