package edu.cnm.deepdive.wifinder.controller;

import edu.cnm.deepdive.wifinder.model.dao.backend.LocationRepository;
import edu.cnm.deepdive.wifinder.model.entity.backend.Location;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ExposesResourceFor(Location.class)
@RequestMapping("/locations")
public class LocationController {

  private LocationRepository locationRepository;

  public LocationController(
      LocationRepository locationRepository) {
    this.locationRepository = locationRepository;
  }

  @GetMapping
  public Iterable<Location> getLocations(){
    return locationRepository.findAll();
  }



}
