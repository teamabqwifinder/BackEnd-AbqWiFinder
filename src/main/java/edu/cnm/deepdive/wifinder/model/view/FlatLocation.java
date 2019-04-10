package edu.cnm.deepdive.wifinder.model.view;

import java.net.URI;
import java.util.UUID;

/**
 * Declares the getters (and thus the JSON properties) of a quote for serialization, excluding
 * references to other objects that could result in stack or buffer overflow on serialization.
 */

public interface FlatLocation {
  /**
   * Returns the universally unique ID (UUID) of a quote resource.
   *
   * @return Location UUID.
   */

  UUID getId();

  String getGooglemap();

  String getAdress();
  String getLatitude();
  String getPictures();

  URI getHref();
}
