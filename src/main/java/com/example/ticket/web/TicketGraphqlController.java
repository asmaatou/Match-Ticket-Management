package com.example.ticket.web;

import com.example.ticket.dtos.request.TicketDTORequest;
import com.example.ticket.dtos.response.TicketDTOResponse;
import com.example.ticket.services.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class TicketGraphqlController {
    private TicketService ticketService;

    @MutationMapping
    private TicketDTOResponse getTicket(@Argument TicketDTORequest ticketDTORequest){
        return ticketService.buyTicket(ticketDTORequest);
    }

    @QueryMapping
    private void updateTicket(@Argument Integer ticketId){
        ticketService.updateStatus(ticketId);
    }
}
