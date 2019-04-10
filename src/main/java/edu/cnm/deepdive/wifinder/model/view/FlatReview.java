package edu.cnm.deepdive.wifinder.model.view;

import java.net.URI;
import java.util.Date;
import java.util.UUID;

/**
 * Declares the getters (and thus the JSON properties) of a quote for serialization, excluding
 * references to other objects that could result in stack or buffer overflow on serialization.
 */

public interface FlatReview {

  UUID getId() ;


  Date getCreated();


  String getName() ;

  URI getHref();


}
