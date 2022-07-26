package com.infin.shapecalculate.service;

import com.infin.shapecalculate.payload.request.SquareRequest;
import com.infin.shapecalculate.payload.response.AnswerResponse;
import org.springframework.stereotype.Service;

@Service
public class SquareService {

    public AnswerResponse calculate(SquareRequest request) {
        double area = Math.pow(request.getSide(), 2);
        double perimeter = request.getSide() * 2;
        return new AnswerResponse(perimeter, area);
    }
}
