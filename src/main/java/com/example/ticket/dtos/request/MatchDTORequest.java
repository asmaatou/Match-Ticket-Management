package com.example.ticket.dtos.request;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data @AllArgsConstructor @NoArgsConstructor
public class MatchDTORequest {
    private String reference;
    private Date date;
    private String place;
    private String firstTeam;
    private String secondTeam;
}
