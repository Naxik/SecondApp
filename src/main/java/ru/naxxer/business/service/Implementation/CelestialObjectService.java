package ru.naxxer.business.service.Implementation;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.naxxer.business.dao.ICelestialObjectDao;
import ru.naxxer.business.domain.CelestialObject;
import ru.naxxer.business.dto.CelestialObjectDto;
import ru.naxxer.business.service.ICelestialObjectService;

/**
 * @author naxxer
 *         date: 05.07.16.
 */
@Service
@Transactional
public class CelestialObjectService implements ICelestialObjectService {

	private final ICelestialObjectDao dao;
	private final Mapper mapper;

	@Autowired
	public CelestialObjectService(Mapper mapper, ICelestialObjectDao dao) {
		this.mapper = mapper;
		this.dao = dao;
	}

	@Override
	public CelestialObjectDto save(CelestialObjectDto celestialObjectDto) {
		CelestialObject celestialObject = mapper.map(celestialObjectDto, CelestialObject.class);
		return mapper.map(dao.save(celestialObject), CelestialObjectDto.class);
	}

	@Override
	public CelestialObjectDto get(Long id) {
		return mapper.map(dao.findOne(id), CelestialObjectDto.class);
	}

	@Override
	public CelestialObjectDto findByTitle(String title) {
		return mapper.map(dao.findByTitle(title), CelestialObjectDto.class);
	}

	@Override
	public CelestialObjectDto update(CelestialObjectDto celestialObjectDto) {
		CelestialObject celestialObject = mapper.map(celestialObjectDto, CelestialObject.class);
		return mapper.map(dao.save(celestialObject), CelestialObjectDto.class);
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
	}
}
