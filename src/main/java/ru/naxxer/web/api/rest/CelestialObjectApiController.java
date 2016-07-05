package ru.naxxer.web.api.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.naxxer.business.dto.CelestialObjectDto;
import ru.naxxer.business.service.ICelestialObjectService;

/**
 * @author naxxer
 *         date: 05.07.16.
 */
@Slf4j
@RestController
@RequestMapping("/celestial_object")
public class CelestialObjectApiController {

    @Autowired
    private ICelestialObjectService service;

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity<CelestialObjectDto> save(@RequestBody CelestialObjectDto newCelestialObject) {
        return new ResponseEntity<>(service.save(newCelestialObject), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<CelestialObjectDto> get(@PathVariable("id") Long id){
        return new ResponseEntity<>(service.get(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/{title}", method = RequestMethod.GET)
    public ResponseEntity<CelestialObjectDto> findByTitle(@PathVariable("title") String title) {
        return new ResponseEntity<>(service.findByTitle(title), HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<CelestialObjectDto> update(@RequestBody CelestialObjectDto newCelestialObject) {
        return new ResponseEntity<>(service.update(newCelestialObject), HttpStatus.OK);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
