package edu.cnm.deepdive.wifinder.controller;

import edu.cnm.deepdive.wifinder.model.dao.backend.LocationRepository;
import edu.cnm.deepdive.wifinder.model.entity.backend.Location;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *Defines REST endpoints for servicing requests on {@link ExposesResourceFor}
 * resources, invoking {@link LocationRepository} methods to perform the required operations.
 */
public class ReviewerController {

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

    /**
     * returns find all locations
     * @return locationRepository
     */
    @GetMapping
    public Iterable<Location> getLocations(){
      return locationRepository.findAll();
    }




  }}
