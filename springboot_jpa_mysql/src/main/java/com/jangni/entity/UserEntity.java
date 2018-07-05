package com.jangni.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @program: springboot_study
 * @description:
 * @author: Mr.Jangni
 * @create: 2018-07-05 22:35
 **/
@Entity
@Table(name = "t_m_user", schema = "jangni", catalog = "")
public class UserEntity {
    private int id;
    private String userName;
    private String userPassword;
    private Integer userAge;
    private String userTel;
    private String userEmail;
    private String userNickName;
    private String userHeadPortrait;
    private String userRandomKey;
    private Timestamp userCreateTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_name")
    public java.lang.String getUserName() {
        return userName;
    }

    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_password")
    public java.lang.String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(java.lang.String userPassword) {
        this.userPassword = userPassword;
    }

    @Basic
    @Column(name = "user_age")
    public java.lang.Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(java.lang.Integer userAge) {
        this.userAge = userAge;
    }

    @Basic
    @Column(name = "user_tel")
    public java.lang.String getUserTel() {
        return userTel;
    }

    public void setUserTel(java.lang.String userTel) {
        this.userTel = userTel;
    }

    @Basic
    @Column(name = "user_email")
    public java.lang.String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(java.lang.String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_nick_name")
    public java.lang.String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(java.lang.String userNickName) {
        this.userNickName = userNickName;
    }

    @Basic
    @Column(name = "user_head_portrait")
    public java.lang.String getUserHeadPortrait() {
        return userHeadPortrait;
    }

    public void setUserHeadPortrait(java.lang.String userHeadPortrait) {
        this.userHeadPortrait = userHeadPortrait;
    }

    @Basic
    @Column(name = "user_random_key")
    public java.lang.String getUserRandomKey() {
        return userRandomKey;
    }

    public void setUserRandomKey(java.lang.String userRandomKey) {
        this.userRandomKey = userRandomKey;
    }

    @Basic
    @Column(name = "user_create_time")
    public Timestamp getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(java.sql.Timestamp userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        UserEntity that = (UserEntity) object;

        if (id != that.id) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPassword != null ? !userPassword.equals(that.userPassword) : that.userPassword != null) return false;
        if (userAge != null ? !userAge.equals(that.userAge) : that.userAge != null) return false;
        if (userTel != null ? !userTel.equals(that.userTel) : that.userTel != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (userNickName != null ? !userNickName.equals(that.userNickName) : that.userNickName != null) return false;
        if (userHeadPortrait != null ? !userHeadPortrait.equals(that.userHeadPortrait) : that.userHeadPortrait != null)
            return false;
        if (userRandomKey != null ? !userRandomKey.equals(that.userRandomKey) : that.userRandomKey != null)
            return false;
        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + id;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userAge != null ? userAge.hashCode() : 0);
        result = 31 * result + (userTel != null ? userTel.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userNickName != null ? userNickName.hashCode() : 0);
        result = 31 * result + (userHeadPortrait != null ? userHeadPortrait.hashCode() : 0);
        result = 31 * result + (userRandomKey != null ? userRandomKey.hashCode() : 0);
        return result;
    }
}
