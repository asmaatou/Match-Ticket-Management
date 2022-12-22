package com.example.ticket.services;

import com.example.ticket.dtos.request.MatchDTORequest;
import com.example.ticket.dtos.response.MatchDTOResponse;
import com.example.ticket.entities.Match;
import com.example.ticket.mappers.dtoMapper;
import com.example.ticket.repos.MatchRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;


@Service
@Transactional
@AllArgsConstructor
public class MatchServiceImpl implements MatchService{
    @Autowired
    private dtoMapper dtoMapper;
    @Autowired
    private MatchRepository matchRepository;
    @Override
    public MatchDTOResponse addMatch(MatchDTORequest matchDTORequest) {
        Match match=new Match();
        match.setId(new Random().nextInt());
        match.setReference(matchDTORequest.getReference());
        match.setDate(matchDTORequest.getDate());
        match.setPlace(matchDTORequest.getPlace());
        match.setFirstTeam(matchDTORequest.getFirstTeam());
        match.setSecondTeam(matchDTORequest.getSecondTeam());
        return dtoMapper.fromMatch(matchRepository.save(match));
    }

    @Override
    public List<MatchDTOResponse> matchList() {
        return matchRepository.findAll().stream().map(
                match -> dtoMapper.fromMatch(match)).collect(Collectors.toList());
    }
}
