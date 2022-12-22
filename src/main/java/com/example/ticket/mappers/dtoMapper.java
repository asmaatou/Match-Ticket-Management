package com.example.ticket.mappers;

import com.example.ticket.dtos.request.MatchDTORequest;
import com.example.ticket.dtos.request.TicketDTORequest;
import com.example.ticket.dtos.response.MatchDTOResponse;
import com.example.ticket.dtos.response.TicketDTOResponse;
import com.example.ticket.entities.Match;
import com.example.ticket.entities.Ticket;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class dtoMapper {

    public MatchDTOResponse fromMatch(Match match){
        MatchDTOResponse matchDTOResponse = new MatchDTOResponse();
        BeanUtils.copyProperties(match,matchDTOResponse);
        return matchDTOResponse;
    }

    public Ticket fromTicket(TicketDTORequest ticketDTORequest){
        Ticket ticket = new Ticket();
        BeanUtils.copyProperties(ticketDTORequest,ticket);
        return ticket;
    }
}
