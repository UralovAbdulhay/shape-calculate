package com.infin.shapecalculate.payload.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RectangleRequest {

    private double firstSide;
    private double secondSide;


}
