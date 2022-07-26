package com.infin.shapecalculate.service;

import com.infin.shapecalculate.payload.request.TriangleRequest;
import com.infin.shapecalculate.payload.response.AnswerResponse;
import org.springframework.stereotype.Service;

@Service
public class TriangleService {

    public AnswerResponse calculateByAnglesAndSide(TriangleRequest request) {
        double a = request.getFirstSide();
        double al = request.getFirstAngle();
        double bet = request.getSecondAngle();
        double gam = 180 - (al + bet);

        double area = a * a * Math.sin(al) * Math.sin(bet) / 2 / Math.sin(al + bet);
        double perimeter = area * Math.sin(gam) / 2;
        return new AnswerResponse(perimeter, area);
    }

    public AnswerResponse calculateByHeightAndBase(TriangleRequest request) {

        double a = request.getFirstSide();
        double h = request.getHeight();

        double area = (h * a) / 2;
        double perimeter = 2 * Math.sqrt(a * a - h * h) + 2 * a;
        return new AnswerResponse(perimeter, area);
    }

    public AnswerResponse calculateBySidesAndAngle(TriangleRequest request) {

        double a = request.getFirstSide();
        double b = request.getSecondSide();
        double g = Math.cos(request.getFirstAngle());

        double area = (a * b * Math.sin(request.getFirstAngle())) / 2;

        double perimeter = Math.sqrt(b * b + a * a + 2 * a * b * g) + b + a;
        return new AnswerResponse(perimeter, area);
    }

    public AnswerResponse calculateByOutCircle(TriangleRequest request) {
        double area = (request.getFirstSide() * request.getSecondSide() * request.getThirdSide())
                / (4 * request.getOutRadius());
        double perimeter = request.getFirstSide() + request.getSecondSide() + request.getThirdSide();
        return new AnswerResponse(perimeter, area);
    }

    public AnswerResponse calculateByInCircle(TriangleRequest request) {
        double perimeter = request.getFirstSide() + request.getSecondSide() + request.getThirdSide();
        double area = (request.getInRadius()
                * (perimeter))
                / 2;
        return new AnswerResponse(perimeter, area);
    }

    public AnswerResponse calculateByInThreeSides(TriangleRequest request) {

        double a = request.getFirstSide();
        double b = request.getSecondSide();
        double d = request.getThirdSide();

        double perimeter = a + b + d;
        double p = perimeter / 2;
        double area = Math.abs(p * (p - a) * (p - b) * (p - d));
        return new AnswerResponse(perimeter, area);
    }
}
