package com.tarleton.edu.DataAccessors;

import com.tarleton.edu.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by mosei on 5/16/2017.
 */
@Repository
public class UserDao {
    @Autowired
    User userInstance;
}
