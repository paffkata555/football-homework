package com.academy.footballhomework.controller;

import com.academy.footballhomework.converter.ManagerConverter;
import com.academy.footballhomework.dto.ManagerDto;
import com.academy.footballhomework.service.ManagerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/managers")
public class ManagerController {

    private final ManagerService managerService;
    private final ManagerConverter managerConverter;
    private ManagerDto managerDto;

    public ManagerController(ManagerService managerService, ManagerConverter managerConverter, ManagerDto managerDto) {
        this.managerService = managerService;
        this.managerConverter = managerConverter;

    }



}
