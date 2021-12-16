package com.academy.footballhomework.converter;

import com.academy.footballhomework.dto.PlayerDto;
import com.academy.footballhomework.model.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerConverter {

    public PlayerDto toPlayerDto(Player player){
        return PlayerDto.builder()
                .id(player.getId())
                .number(player.getNumber())
                .build();

    }
    public Player toPlayer(PlayerDto playerDto){
        return Player.builder()
                .id(playerDto.getId())
                .number(playerDto.getNumber())
                .build();
    }
}
