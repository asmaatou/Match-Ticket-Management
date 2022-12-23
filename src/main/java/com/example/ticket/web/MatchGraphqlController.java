package com.example.ticket.web;

import com.example.ticket.dtos.request.MatchDTORequest;
import com.example.ticket.dtos.response.MatchDTOResponse;
import com.example.ticket.services.MatchService;
import org.springframework.graphql.data.method.annotation.Argument;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class MatchGraphqlController {
    private MatchService matchService;

    @MutationMapping
    private MatchDTOResponse addMatch(@Argument MatchDTORequest matchDTORequest){
        return  matchService.addMatch(matchDTORequest);
    }
    @QueryMapping
    private List<MatchDTOResponse> getMatches(){
        return matchService.matchList();
    }
}
