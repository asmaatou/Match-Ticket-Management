package com.example.ticket.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface MatchRepository extends JpaRepository<Math,Long> {
}
