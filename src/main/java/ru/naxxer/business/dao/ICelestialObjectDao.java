package ru.naxxer.business.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.naxxer.business.domain.CelestialObject;

/**
 * @author naxxer
 *         date: 04.07.16.
 */
@Transactional
public interface ICelestialObjectDao extends CrudRepository<CelestialObject, Long> {
	CelestialObject findByTitle(String title);
}
