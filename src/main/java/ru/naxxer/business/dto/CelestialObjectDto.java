package ru.naxxer.business.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author naxxer
 *         date: 05.07.16.
 */
@Getter
@Setter
public class CelestialObjectDto {

    Long id;
    String title;
    CelestialObjectCategoryDto category;

    public CelestialObjectDto(){}
}
