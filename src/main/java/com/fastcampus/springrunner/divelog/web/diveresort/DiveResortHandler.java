package com.fastcampus.springrunner.divelog.web.diveresort;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import com.fastcampus.springrunner.divelog.core.diveresort.application.DiveResortEditor;
import com.fastcampus.springrunner.divelog.core.diveresort.application.DiveResortFinder;

@Component
public class DiveResortHandler {
    private final DiveResortFinder diveResortFinder;
    private final DiveResortEditor diveResortEditor;

    public DiveResortHandler(DiveResortFinder diveResortFinder, DiveResortEditor diveResortEditor) {
        this.diveResortFinder = diveResortFinder;
        this.diveResortEditor = diveResortEditor;
    }

    public ServerResponse findAll(ServerRequest request) {
        return ServerResponse.ok().body(diveResortFinder.findAll());
    }
}