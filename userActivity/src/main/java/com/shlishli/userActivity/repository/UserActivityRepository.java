package com.shlishli.userActivity.repository;

import java.util.List;

import com.shlishli.userActivity.entity.UserActivity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserActivityRepository extends CrudRepository<UserActivity,Long> {
    List<UserActivity> findByUserId(String userId);

    List<UserActivity> findByCustomerId(Long customerId);
}

