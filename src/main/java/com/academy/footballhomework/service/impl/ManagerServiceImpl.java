package com.academy.footballhomework.service.impl;

import com.academy.footballhomework.repository.ManagerRepository;
import com.academy.footballhomework.service.ManagerService;
import org.apache.catalina.Manager;

import java.util.Set;

public class ManagerServiceImpl implements ManagerService {

    private final ManagerRepository managerRepository;

    public ManagerServiceImpl(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    @Override
    public Manager findByName(String name) {
        return null;
    }

    @Override
    public Set<Manager> findAll() {
        return null;
    }

    @Override
    public Manager save(Manager manager) {
        return null;
    }
}
