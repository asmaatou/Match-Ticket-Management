package com.example.ticket.repos;

import com.example.ticket.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MatchRepository extends JpaRepository<Match,Integer> {
}
