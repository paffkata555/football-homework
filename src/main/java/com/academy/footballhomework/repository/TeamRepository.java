package com.academy.footballhomework.repository;

import com.academy.footballhomework.model.Player;
import com.academy.footballhomework.model.Team;

import java.util.Optional;

public interface TeamRepository {

    Optional<Team> findById(Long id);
}
