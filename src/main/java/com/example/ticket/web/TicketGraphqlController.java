package com.example.ticket.web;

import com.example.ticket.dtos.request.TicketDTORequest;
import com.example.ticket.dtos.response.TicketDTOResponse;
import com.example.ticket.services.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class TicketGraphqlController {
    private TicketService ticketService;

    private TicketDTOResponse getTicket(@Argument TicketDTORequest ticketDTORequest){
        return ticketService.buyTicket(ticketDTORequest);
    }

    private void updateTicket(@Argument Integer ticketId){
        ticketService.updateStatus(ticketId);
    }
}
