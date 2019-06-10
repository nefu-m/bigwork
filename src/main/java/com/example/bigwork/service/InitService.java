package com.example.bigwork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import com.example.bigwork.dao.UserDao;
@Service
@Transactional
public class InitService {
    @Autowired
    private UserDao userDao;

    public void initUserAuthority(){
        userDao.init();
    }

    public Boolean isexist_manager(){
        boolean b=false;
        if(userDao.init_find()==1){
            b=true;
        }
        return b;
    }
}
