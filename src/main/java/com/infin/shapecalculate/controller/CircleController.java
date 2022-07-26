package com.infin.shapecalculate.controller;

import com.infin.shapecalculate.payload.request.CircleRequest;
import com.infin.shapecalculate.payload.response.Result;
import com.infin.shapecalculate.service.CircleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculate/v1/circle")
@RequiredArgsConstructor
public class CircleController {

    private final CircleService circleService;

    @PostMapping
    public ResponseEntity<Result> calculate(CircleRequest request) {
        return ResponseEntity.ok(Result.ok(circleService.calculate(request)));
    }
}
