package com.jangni.service;

import com.jangni.entity.UserEntity;
import com.jangni.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: springboot_study
 * @description:
 * @author: Mr.Jangni
 * @create: 2018-07-05 23:06
 **/
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getUserEntityList() {
        return userRepository.findAll();
    }

    public void save(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    public UserEntity findUserById(long id) {
        return userRepository.findOne(id);
    }

    public void edit(UserEntity user){
        userRepository.update(user);
    }

    public void delete(long id){
        userRepository.delete(id);
    }
}
