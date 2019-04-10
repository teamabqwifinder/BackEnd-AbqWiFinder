package edu.cnm.deepdive.wifinder.controller;

import edu.cnm.deepdive.wifinder.model.dao.backend.LocationRepository;
import edu.cnm.deepdive.wifinder.model.entity.backend.Location;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *Defines REST endpoints for servicing requests on {@link edu.cnm.deepdive.wifinder.model.entity.backend.Review}
 * resources, invoking {@link LocationRepository} methods to perform the required operations.
 */

@RestController
@ExposesResourceFor(Location.class)
@RequestMapping("/locations")
public class LocationController {

  private LocationRepository locationRepository;
  private Object imageService;

  public LocationController(
      LocationRepository locationRepository) {
    this.locationRepository = locationRepository;
  }

  @GetMapping
  public Iterable<Location> getLocations(){
    return locationRepository.findAll();
  }



}
