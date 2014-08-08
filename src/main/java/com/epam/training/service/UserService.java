package com.epam.training.service;

import com.epam.training.persistence.dao.UserDao;
import com.epam.training.persistence.pojo.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Oleg_Burshinov on 04.02.14.
 */
@Service
public class UserService {

    Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserDao userDao;

    public boolean read(UserEntity user){
        return userDao.update(user);
    }


    public long create(UserEntity user) {
        return userDao.create(user);
    }

    public boolean authorize(UserEntity user){
        return userDao.authorize(user);
    }
}

