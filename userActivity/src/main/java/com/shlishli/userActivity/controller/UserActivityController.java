package com.shlishli.userActivity.controller;

import java.util.List;

import com.shlishli.userActivity.entity.UserActivity;
import com.shlishli.userActivity.service.UserActivityService;
import com.shlishli.userActivity.utilities.IConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = IConstants.USER_ACTIVITY)
public class UserActivityController {
    
    @Autowired
    private UserActivityService userActivityService;

    @PostMapping(value = IConstants.ADD_USER_ACTIVITY)
    public UserActivity updateLogs(@RequestBody UserActivity userActivity)
    {
        return userActivityService.updateLogs(userActivity);
    }
    
    @GetMapping(value = IConstants.GET_USER_ACTIVITIES)
    public List<UserActivity> getLogs(@PathVariable("userId") String userId)
    {
        return userActivityService.getLogs(userId);
    }
}
