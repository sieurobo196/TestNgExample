package com.codewr.user;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCheckedException {

    UserDao orderBo;
    User data;

    @BeforeTest
    void setup() {
        orderBo = new UserDao();

        data = new User();
        data.setId(1);
        data.setCreatedBy("codewr");
    }

    @Test(expectedExceptions = UserSaveException.class)
    public void throwIfOrderIsNull() throws UserSaveException {
        orderBo.save(null);
    }

    /*
	 * Example : Multiple expected exceptions
	 * Test is success if either of the exception is throws
     */
    @Test(expectedExceptions = {UserUpdateException.class, UserNotFoundException.class})
    public void throwIfOrderIsNotExists() throws UserUpdateException, UserNotFoundException {
        orderBo.update(data);
    }

}
