package com.match.matchticket.controller;


import com.match.matchticket.dto.TicketRequestDto;
import com.match.matchticket.dto.TicketResponseDto;
import com.match.matchticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TicketControllerGraphQl {

    @Autowired
    TicketService ticketService;

    @QueryMapping
    public List<TicketResponseDto> getTickets(){
        return ticketService.findAll();
    }

    @QueryMapping
    public TicketResponseDto getTickethById(@Argument Long id){
        return  ticketService.findById(id);
    }

    @MutationMapping
    public  TicketResponseDto addTicket( @Argument TicketRequestDto t,@Argument Long id){
        return  ticketService.addTicket(id,t);
    }

    @MutationMapping
    public  TicketResponseDto updateTicket(@Argument Long id, @Argument TicketRequestDto t){
        return  ticketService.updateTicket(id,t);
    }
}
