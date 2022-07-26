package com.infin.shapecalculate.service;

import com.infin.shapecalculate.payload.request.RectangleRequest;
import com.infin.shapecalculate.payload.response.AnswerResponse;
import org.springframework.stereotype.Service;

@Service
public class RectangleService {


    public AnswerResponse calculate(RectangleRequest request) {

        double area = request.getFirstSide() * request.getSecondSide();
        double perimeter = (request.getFirstSide() + request.getSecondSide()) * 2;
        return new AnswerResponse(perimeter, area);

    }
}
