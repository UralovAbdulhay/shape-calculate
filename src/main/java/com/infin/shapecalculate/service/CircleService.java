package com.infin.shapecalculate.service;

import com.infin.shapecalculate.payload.request.CircleRequest;
import com.infin.shapecalculate.payload.response.AnswerResponse;
import org.springframework.stereotype.Service;

@Service
public class CircleService {

    public AnswerResponse calculate(CircleRequest request) {
        double area = Math.pow(request.getRadius(), 2) * Math.PI;
        double perimeter = request.getRadius() * 2 * Math.PI;
        return new AnswerResponse(perimeter, area);
    }


}
