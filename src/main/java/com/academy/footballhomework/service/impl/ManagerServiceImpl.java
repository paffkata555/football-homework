package com.academy.footballhomework.service.impl;


import com.academy.footballhomework.exception.ResourceNotFoundException;
import com.academy.footballhomework.repository.ManagerRepository;
import com.academy.footballhomework.service.ManagerService;
import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {

    private final ManagerRepository managerRepository;

    @Autowired
    public ManagerServiceImpl(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    @Override
    public Manager findByName(String name) {
        return (Manager) managerRepository.findByName(name)
                .orElseThrow(() ->
                        new ResourceNotFoundException(String.format("Manager with name &s does not exists.",name)));
    }

    @Override
    public Manager findById(Long id) {
        return null;
    }

    @Override
    public Manager save(Manager manager) {
        return null;
    }



}
