package com.example.ticket.repos;

import com.example.ticket.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
