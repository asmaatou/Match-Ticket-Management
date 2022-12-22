package com.example.ticket.services;

import com.example.ticket.dtos.request.MatchDTORequest;
import com.example.ticket.dtos.response.MatchDTOResponse;

import java.util.List;

public interface MatchService {
    MatchDTOResponse addMatch(MatchDTORequest matchDTORequest);
    List<MatchDTOResponse> matchList();
}
