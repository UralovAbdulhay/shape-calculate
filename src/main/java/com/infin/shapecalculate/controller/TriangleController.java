package com.infin.shapecalculate.controller;


import com.infin.shapecalculate.payload.request.TriangleRequest;
import com.infin.shapecalculate.payload.response.Result;
import com.infin.shapecalculate.service.TriangleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("calculate/v1/triangle")
@RequiredArgsConstructor
public class TriangleController {

    private final TriangleService triangleService;

    @PostMapping("/angles-side")
    public ResponseEntity<Result> calculateByAnglesAndSide(@Valid TriangleRequest request) {
        return ResponseEntity.ok(Result.ok(triangleService.calculateByAnglesAndSide(request)));
    }

    @PostMapping("/height-base")
    public ResponseEntity<Result> calculateByHeightAndBase(@Valid TriangleRequest request) {
        return ResponseEntity.ok(Result.ok(triangleService.calculateByHeightAndBase(request)));
    }

    @PostMapping("/sides-angle")
    public ResponseEntity<Result> calculateBySidesAndAngle(@Valid TriangleRequest request) {
        return ResponseEntity.ok(Result.ok(triangleService.calculateBySidesAndAngle(request)));
    }

    @PostMapping("/sides-out-circle")
    public ResponseEntity<Result> calculateBySidesOutCircle(@Valid TriangleRequest request) {
        return ResponseEntity.ok(Result.ok(triangleService.calculateByOutCircle(request)));
    }

    @PostMapping("/sides-in-circle")
    public ResponseEntity<Result> calculateBySidesInCircle(@Valid TriangleRequest request) {
        return ResponseEntity.ok(Result.ok(triangleService.calculateByInCircle(request)));
    }


    @PostMapping("/three-sides")
    public ResponseEntity<Result> calculateByInThreeSides(@Valid TriangleRequest request) {
        return ResponseEntity.ok(Result.ok(triangleService.calculateByInThreeSides(request)));
    }

}
