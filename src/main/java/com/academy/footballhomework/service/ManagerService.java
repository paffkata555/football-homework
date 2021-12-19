package com.academy.footballhomework.service;

import org.apache.catalina.Manager;

import java.util.Optional;

public interface ManagerService {

    Manager findByName(String name);

    Manager findById(Long id);

    Manager save (Manager manager);

}
