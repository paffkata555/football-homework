package com.academy.footballhomework.controller;

import com.academy.footballhomework.converter.PlayerConverter;
import com.academy.footballhomework.dto.PlayerDto;
import com.academy.footballhomework.model.Player;
import com.academy.footballhomework.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping(value = "/players")
public class PlayerController {

    private final PlayerService playerService;
    private final PlayerConverter playerConverter;

    @Autowired
    public PlayerController(PlayerService playerService, PlayerConverter playerConverter) {
        this.playerService = playerService;
        this.playerConverter = playerConverter;
    }
    @GetMapping
    public ResponseEntity<Set<PlayerDto>> findByAll(){
        Set<PlayerDto> playerDtos = new HashSet<>();
        Set<Player> players = playerService.findAll();

        for (Player player : players){
            PlayerDto playerDto = playerConverter.toPlayerDto(player);
            playerDtos.add(playerDto);
        }
        return ResponseEntity.ok(playerDtos);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable Long id){
        playerService.delete(id);
        return ResponseEntity.ok().build();

    }

}
