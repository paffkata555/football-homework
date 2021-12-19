package com.academy.footballhomework.converter;

import com.academy.footballhomework.dto.ManagerDto;
import com.academy.footballhomework.dto.PlayerDto;
import com.academy.footballhomework.model.Manager;
import com.academy.footballhomework.model.Player;
import org.springframework.stereotype.Component;

@Component
public class ManagerConverter {

    public ManagerDto toManagerDto(Manager manager){
        return ManagerDto.builder()
                .id(manager.getId())
                .name(manager.getName())
                .build();

    }
    public Manager toManager (ManagerDto managerDto){
        return Manager.builder()
                .id(managerDto.getId())
                .name(managerDto.getName())
                .build();
    }



}

