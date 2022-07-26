package com.infin.shapecalculate.controller;


import com.infin.shapecalculate.payload.request.RectangleRequest;
import com.infin.shapecalculate.payload.request.SquareRequest;
import com.infin.shapecalculate.payload.response.Result;
import com.infin.shapecalculate.service.RectangleService;
import com.infin.shapecalculate.service.SquareService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calculate/v1/square")
@RequiredArgsConstructor
public class SquareController {

    private final SquareService squareService;

    @PostMapping
    public ResponseEntity<Result> calculate(SquareRequest request) {
        return ResponseEntity.ok(Result.ok(squareService.calculate(request)));
    }

}
