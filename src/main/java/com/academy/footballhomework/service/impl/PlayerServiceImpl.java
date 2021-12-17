package com.academy.footballhomework.service.impl;

import com.academy.footballhomework.exception.DuplicateResourceException;
import com.academy.footballhomework.exception.ResourceNotFoundException;
import com.academy.footballhomework.model.Player;
import com.academy.footballhomework.repository.PlayerRepository;
import com.academy.footballhomework.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

@Service
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    public Set<Player> findAll() {
        return new TreeSet<>(playerRepository.findAll());
    }
    @Override
    public Player save(Player player) {
        try {
            return playerRepository.save(player);
        }catch (DataIntegrityViolationException exception){
            throw new DuplicateResourceException(String.format("Player with number %d already exists.",player.getNumber()));
        }

    }

    @Override
    public Player findById(Long id) {
        return playerRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException(String.format("Player with %d id does not exists.",id)));
    }

    @Override
    public Player findByNumber(Integer number) {
        return playerRepository.findByNumber(number)
                .orElseThrow(()-> new ResourceNotFoundException(String.format("Player with %d does not exists.",number)));
    }

    @Override
    public Player update(Player player, Long id) {
        Player foundPlayer = findById(id);
        Player updatedPlayer = Player.builder()
                .id(foundPlayer.getId())
                .number(foundPlayer.getNumber())
                .name(foundPlayer.getName())
                .position(foundPlayer.getPosition())
                .build();

            return save(updatedPlayer);
    }

    @Override
    public void delete(Long id) {
        playerRepository.deleteById(id);

    }


}
