package com.epam.training.webservice;

import com.epam.training.persistence.pojo.UserEntity;
import com.epam.training.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Oleg_Burshinov on 10.02.14.
 */
@WebService
public class UserWS extends SpringBeanAutowiringSupport {

    @Autowired
    private UserService userService;

    @WebMethod (action="create")
    public long create(@WebParam(name = "fullName") String fullName, @WebParam(name = "billingAddress") String billingAddress, @WebParam(name = "login") String
            login, @WebParam(name = "password") String password, @WebParam(name = "email") String email, @WebParam(name = "phone") String phone, @WebParam(name = "confirmPassword") String confirmPassword) {
        UserEntity user = new UserEntity();
        user.setFullName(fullName);
        user.setBillingAddress(billingAddress);
        user.setLogin(login);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);
        user.setConfirmPassword(confirmPassword);
        return userService.create(user);
    }

    @WebMethod (action="authorize")
    public boolean authorize(@WebParam(name = "login")String login,@WebParam(name = "password") String password) {
        UserEntity user = new UserEntity();
        user.setLogin(login);
        user.setPassword(password);
        return userService.authorize(user);
    }

}
