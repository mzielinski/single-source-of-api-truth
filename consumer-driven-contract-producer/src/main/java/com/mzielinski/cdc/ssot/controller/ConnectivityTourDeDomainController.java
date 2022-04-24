package com.mzielinski.cdc.ssot.controller;

import com.mzielinski.cdc.ssot.api.V1Api;
import com.mzielinski.cdc.ssot.api.model.EventResponseDto;
import com.mzielinski.cdc.ssot.service.EventsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class ConnectivityTourDeDomainController implements V1Api {

    private final EventsService eventsService;

    public ConnectivityTourDeDomainController(EventsService eventsService) {
        this.eventsService = eventsService;
    }

    @Override
    public ResponseEntity<EventResponseDto> tddEvents(LocalDate date) {
        return ResponseEntity.ok(eventsService.findEvents(date));
    }
}
