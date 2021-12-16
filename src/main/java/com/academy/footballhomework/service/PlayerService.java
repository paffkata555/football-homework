package com.academy.footballhomework.service;

import com.academy.footballhomework.model.Player;

import java.util.List;
import java.util.Set;

public interface PlayerService {

    Player save(Player player);

    Player findById(Long id);

    Player findByNumber(Integer number);

    Player update(Player player,Long id);

    void delete(Long id);

    Set<Player> findAll();
}
