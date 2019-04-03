package edu.cnm.deepdive.wifinder.controller;

import edu.cnm.deepdive.wifinder.model.dao.backend.LocationRepository;
import edu.cnm.deepdive.wifinder.model.dao.backend.ReviewRepository;
import edu.cnm.deepdive.wifinder.model.dao.backend.ReviewerRepository;
import edu.cnm.deepdive.wifinder.model.entity.backend.Review;
import edu.cnm.deepdive.wifinder.model.entity.backend.Reviewer;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ExposesResourceFor(Review.class)
@RequestMapping("/sources")

public class ReviewController {

  private ReviewRepository reviewRepository;
  private ReviewerRepository reviewerRepository;
  private LocationRepository locationRepository;



}
