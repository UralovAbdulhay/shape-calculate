package com.infin.shapecalculate.controller;

import com.infin.shapecalculate.payload.request.CircleRequest;
import com.infin.shapecalculate.payload.request.RectangleRequest;
import com.infin.shapecalculate.payload.response.Result;
import com.infin.shapecalculate.service.RectangleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("calculate/v1/rectangle")
@RequiredArgsConstructor
public class RectangleController {

    private final RectangleService rectangleService;

    @PostMapping
    public ResponseEntity<Result> calculate(RectangleRequest request) {
        return ResponseEntity.ok(Result.ok(rectangleService.calculate(request)));
    }

}
