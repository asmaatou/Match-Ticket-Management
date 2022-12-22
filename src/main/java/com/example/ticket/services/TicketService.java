package com.example.ticket.services;

import com.example.ticket.dtos.request.TicketDTORequest;
import com.example.ticket.dtos.response.TicketDTOResponse;
import com.example.ticket.entities.Ticket;

public interface TicketService {
    TicketDTOResponse buyTicket(TicketDTORequest ticketDTORequest);
    void updateStatus(Long ticketId);
}
