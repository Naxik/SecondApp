package ru.naxxer.web.api.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.naxxer.business.dto.CelestialObjectCategoryDto;
import ru.naxxer.business.service.ICelestialObjectCategoryService;

/**
 * @author naxxer
 *         date: 05.07.16.
 */
@Slf4j
@RestController
@RequestMapping("/category")
public class CelestialObjectCategoryApiController {

	private final ICelestialObjectCategoryService service;

	@Autowired
	public CelestialObjectCategoryApiController(ICelestialObjectCategoryService service) {
		this.service = service;
	}

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public ResponseEntity<CelestialObjectCategoryDto> save(@RequestBody CelestialObjectCategoryDto categoryDto) {
		return new ResponseEntity<>(service.save(categoryDto), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<CelestialObjectCategoryDto> get(@PathVariable("id") Long id) {
		return new ResponseEntity<>(service.get(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public ResponseEntity<CelestialObjectCategoryDto> update(@RequestBody CelestialObjectCategoryDto categoryDto) {
		return new ResponseEntity<>(service.update(categoryDto), HttpStatus.OK);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
