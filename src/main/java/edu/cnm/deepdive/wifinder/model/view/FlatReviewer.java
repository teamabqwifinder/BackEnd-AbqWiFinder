package edu.cnm.deepdive.wifinder.model.view;

import java.net.URI;
import java.util.UUID;

public interface FlatReviewer {
  UUID getId();

  String getAge();

  String getName();
  String getReviewstatus();

  URI getHref();


}
