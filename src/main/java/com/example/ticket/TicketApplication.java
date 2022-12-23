package com.example.ticket;

import com.example.ticket.dtos.request.MatchDTORequest;
import com.example.ticket.dtos.request.TicketDTORequest;
import com.example.ticket.dtos.response.MatchDTOResponse;
import com.example.ticket.services.MatchService;
import com.example.ticket.services.TicketService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.Random;
import java.util.stream.Stream;

@SpringBootApplication
public class TicketApplication {
    MatchService matchService;
    TicketService ticketService;

    public static void main(String[] args) {
        SpringApplication.run(TicketApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner () {
        return args -> {
            Stream.of(
                    new MatchDTORequest(new Random().toString(), new Date(), "Place 1", "Team A", "Team B"),
                    new MatchDTORequest(new Random().toString(), new Date(), "Place 2", "Team A", "Team B"),
                    new MatchDTORequest(new Random().toString(), new Date(), "Place 3", "Team A", "Team B")
            ).forEach(element -> {
                MatchDTOResponse matchDTOResponse = null;
                matchDTOResponse = matchService.addMatch(element);
                for (int i = 0; i < 2022; i++) {
                    ticketService.buyTicket(
                            new TicketDTORequest(new Random().toString(), new Random().nextDouble(), matchDTOResponse.getId())
                    );
                }
            });

        };
    }}
