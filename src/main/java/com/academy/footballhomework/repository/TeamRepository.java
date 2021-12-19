package com.academy.footballhomework.repository;

import com.academy.footballhomework.model.Manager;
import com.academy.footballhomework.model.Player;
import com.academy.footballhomework.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TeamRepository  {

    Optional<Team> findByName(String name);


}
