package com.example.ticket.services;

import com.example.ticket.dtos.request.TicketDTORequest;
import com.example.ticket.dtos.response.TicketDTOResponse;
import com.example.ticket.entities.Match;
import com.example.ticket.entities.Ticket;
import com.example.ticket.enums.Status;
import com.example.ticket.mappers.dtoMapper;
import com.example.ticket.repos.MatchRepository;
import com.example.ticket.repos.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;
import java.util.UUID;

public class TicketServiceImpl implements TicketService{
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private dtoMapper dtoMapper;
    @Autowired
    private TicketRepository ticketRepository;
    @Override
    public TicketDTOResponse buyTicket(TicketDTORequest ticketDTORequest) {
        Match match = matchRepository.findById(ticketDTORequest.getMatchId()).get();
        Ticket ticket=new Ticket();
        ticket.setId(new Random().nextInt());
        ticket.setReference(UUID.randomUUID().toString().substring(0,16));
        ticket.setPrice(ticketDTORequest.getPrice());
        ticket.setStatus(Status.ENABLED);
        ticket.setMatch(match);
        matchRepository.save(match);
        return dtoMapper.fromTicket(ticketRepository.save(ticket));
    }

    @Override
    public void updateStatus(Integer ticketId) {
        Ticket ticket = ticketRepository.findById(ticketId).get();
        ticket.setStatus(Status.DISABLED);
        ticketRepository.save(ticket);
    }
}
