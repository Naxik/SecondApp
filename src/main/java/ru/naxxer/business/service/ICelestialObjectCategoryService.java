package ru.naxxer.business.service;

import ru.naxxer.business.dto.CelestialObjectCategoryDto;

/**
 * @author naxxer
 *         date: 05.07.16.
 */

public interface ICelestialObjectCategoryService {

    CelestialObjectCategoryDto save(CelestialObjectCategoryDto newCategory);
    CelestialObjectCategoryDto get(Long id);
    CelestialObjectCategoryDto update(CelestialObjectCategoryDto newCategory);
    void delete (Long id);
}
