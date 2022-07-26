package com.infin.shapecalculate.payload.request;

import com.infin.shapecalculate.validation.Triangle.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TriangleRequest {

    @NotNull
    private Double firstSide;

    @NotNull(groups = {SidesAndAngle.class, SidesAndOutCircle.class,
            SidesAndInCircle.class, ThreeSides.class})
    private Double secondSide;

    @NotNull(groups = {ThreeSides.class, SidesAndInCircle.class})
    private Double thirdSide;

    @NotNull(groups = {HeightAndBase.class})
    private Double height;

    @NotNull(groups = {SidesAndAngle.class, AnglesAndSide.class})
    private Double firstAngle;

    @NotNull(groups = {AnglesAndSide.class})
    private Double secondAngle;

    @NotNull(groups = {SidesAndOutCircle.class})
    private Double outRadius;

    @NotNull(groups = {SidesAndOutCircle.class})
    private Double inRadius;


}
