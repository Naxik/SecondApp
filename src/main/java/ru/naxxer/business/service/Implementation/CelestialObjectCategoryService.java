package ru.naxxer.business.service.Implementation;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.naxxer.business.dao.ICelestialObjectCategoryDao;
import ru.naxxer.business.domain.CelestialObjectCategory;
import ru.naxxer.business.dto.CelestialObjectCategoryDto;
import ru.naxxer.business.service.ICelestialObjectCategoryService;

/**
 * @author naxxer
 *         date: 05.07.16.
 */
@Service
@Transactional
public class CelestialObjectCategoryService implements ICelestialObjectCategoryService {

    @Autowired
    ICelestialObjectCategoryDao dao;

    @Autowired
    Mapper mapper;

    @Override
    public CelestialObjectCategoryDto save(CelestialObjectCategoryDto newCategory) {
        CelestialObjectCategory celestialObjectCategory = mapper.map(newCategory, CelestialObjectCategory.class);
        return mapper.map(dao.save(celestialObjectCategory), CelestialObjectCategoryDto.class);
    }

    @Override
    public CelestialObjectCategoryDto get(Long id) {
        return mapper.map(dao.findOne(id), CelestialObjectCategoryDto.class);
    }

    @Override
    public CelestialObjectCategoryDto update(CelestialObjectCategoryDto newCategory) {
        CelestialObjectCategory celestialObjectCategory = mapper.map(newCategory, CelestialObjectCategory.class);
        return mapper.map(dao.save(celestialObjectCategory), CelestialObjectCategoryDto.class);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
}
