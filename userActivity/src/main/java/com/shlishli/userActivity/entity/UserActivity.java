package com.shlishli.userActivity.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.shlishli.userActivity.utilities.IConstants;

@Entity
@Table(name=IConstants.USER_ACTIVITY_TABLE)
public class UserActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userActivityId;
    private String userId;
    private Date date = new Date();
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public Long getUserActivityId() {
        return userActivityId;
    }
    public void setId(Long userActivityId) {
        this.userActivityId=userActivityId;
    }

    public Date getDate() {
        return date;
    }
    public void setDate() {
        this.date = new Date();
    }

}