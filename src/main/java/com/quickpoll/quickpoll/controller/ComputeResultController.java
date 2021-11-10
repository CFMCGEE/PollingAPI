package com.quickpoll.quickpoll.controller;

import javax.inject.Inject;

import com.quickpoll.quickpoll.domain.Vote;
import com.quickpoll.quickpoll.dto.OptionCount;
import com.quickpoll.quickpoll.dto.VoteResult;
import com.quickpoll.quickpoll.repository.VoteRepository;
import com.quickpoll.quickpoll.services.ComputeResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ComputeResultController {

    @Autowired
    private ComputeResultService computeResultService;

    @RequestMapping(value="/computeresult", method=RequestMethod.GET)
    public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
        return computeResultService.computeResult(pollId);
    }

}
