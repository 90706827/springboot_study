package com.jangni.repository;

import com.jangni.entity.UserEntity;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: springboot_study
 * @description:
 * @author: Mr.Jangni
 * @create: 2018-07-05 23:02
 **/

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    public <S extends UserEntity> S save(S s);

    public UserEntity findOne(Long aLong);

    public boolean exists(Long aLong);

    public List<UserEntity> findAll();

    public List<UserEntity> findAll(Sort sort);

    public Page<UserEntity> findAll(Pageable pageable);

    public List<UserEntity> findAll(Iterable<Long> iterable);

    public long count();

    public void delete(Long aLong);

    public void delete(UserEntity tmUserEntity);

    public void delete(Iterable<? extends UserEntity> iterable);

    public void deleteAll();

    public void flush();

    public void deleteInBatch(Iterable<UserEntity> iterable);

    public void deleteAllInBatch();

    public UserEntity getOne(Long aLong);

    public <S extends UserEntity> List<S> findAll(Example<S> example, Sort sort);

    public <S extends UserEntity> List<S> findAll(Example<S> example);

    public <S extends UserEntity> S saveAndFlush(S s);

    public <S extends UserEntity> List<S> save(Iterable<S> iterable);

    public <S extends UserEntity> S findOne(Example<S> example);

    public <S extends UserEntity> Page<S> findAll(Example<S> example, Pageable pageable);

    public <S extends UserEntity> long count(Example<S> example);

    public <S extends UserEntity> boolean exists(Example<S> example);
}