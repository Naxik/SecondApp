package ru.naxxer.business.service;

import ru.naxxer.business.dto.CelestialObjectDto;

/**
 * @author naxxer
 *         date: 05.07.16.
 */
public interface ICelestialObjectService {

    CelestialObjectDto save(CelestialObjectDto celestialObjectDto);
    CelestialObjectDto get(Long id);
    CelestialObjectDto findByTitle(String title);
    CelestialObjectDto update(CelestialObjectDto celestialObjectDto);
    void delete(Long id);
}
