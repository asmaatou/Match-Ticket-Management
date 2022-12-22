package com.example.ticket.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data @AllArgsConstructor @NoArgsConstructor
public class MatchDTOResponse {
    private String reference;
    private Date date;
    private String place;
    private String firstTeam;
    private String secondTeam;
}
