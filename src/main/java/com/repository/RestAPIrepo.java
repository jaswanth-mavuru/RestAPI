package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.RestAPImodel;

public interface RestAPIrepo extends JpaRepository<RestAPImodel, Integer> {

}
