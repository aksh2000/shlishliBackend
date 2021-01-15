package com.shlishli.userActivity.service;

import java.util.List;

import com.shlishli.userActivity.entity.UserActivity;
import com.shlishli.userActivity.repository.UserActivityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserActivityService {
    @Autowired
    private UserActivityRepository userActivityRepository;

    public UserActivity updateLogs(UserActivity userActivity) {
        return  userActivityRepository.save(userActivity);
    }

    public List<UserActivity> getLogs(String userId) {
        return userActivityRepository.findByUserId(userId);
    }
}