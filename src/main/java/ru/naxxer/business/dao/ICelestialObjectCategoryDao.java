package ru.naxxer.business.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.naxxer.business.domain.CelestialObjectCategory;

/**
 * @author naxxer
 *         date: 05.07.16.
 */
@Transactional
public interface ICelestialObjectCategoryDao extends CrudRepository<CelestialObjectCategory, Long> {
}
