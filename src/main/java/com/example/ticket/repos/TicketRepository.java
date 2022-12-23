package com.example.ticket.repos;

import com.example.ticket.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TicketRepository extends JpaRepository<Ticket,Integer> {
}
