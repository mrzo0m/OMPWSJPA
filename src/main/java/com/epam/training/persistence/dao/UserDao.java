package com.epam.training.persistence.dao;

import com.epam.training.persistence.pojo.UserEntity;

/**
 * Created by Oleg_Burshinov on 04.02.14.
 */
public interface UserDao {
    /**
     * @param user
     * @return  description  not added yet
     */
    public long create(UserEntity user);

    /**
     * @param user with login
     * @return user info without password
     */
    public UserEntity read (UserEntity user);

//    /**
//     * @param login
//     * @return user id
//     */
//    public Integer read(String login);
//
//    /**
//     * @param userId
//     * @return information about user
//     */
//    public UserEntity read(Integer userId);


    public boolean update(UserEntity user);

    public boolean delete(UserEntity user);
    /**
     * @param user
     * @return  description  not added yet
     */
    public boolean authorize(UserEntity user);


//    /**
//     * @param user
//     * @return status
//     */
//    public boolean addUserToBlackList(BlackList user);
//
//    /**
//     * @param user
//     * @return status
//     */
//    public boolean removeUserFromBlackList(BlackList user);

}
