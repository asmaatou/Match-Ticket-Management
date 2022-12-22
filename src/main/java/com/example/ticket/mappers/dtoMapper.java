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

    public TicketDTOResponse fromTicket(Ticket ticket){
        TicketDTOResponse ticketDTOResponse=new TicketDTOResponse();
        BeanUtils.copyProperties(ticket,ticketDTOResponse);
        return ticketDTOResponse;
    }
}
