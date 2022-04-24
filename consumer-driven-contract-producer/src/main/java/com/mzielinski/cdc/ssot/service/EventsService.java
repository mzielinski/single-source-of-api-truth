package com.mzielinski.cdc.ssot.service;

import com.mzielinski.cdc.ssot.api.model.EventResponseDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EventsService {

    public EventResponseDto findEvents(LocalDate date) {
        throw new UnsupportedOperationException("It is not implemented yet");
    }
}
