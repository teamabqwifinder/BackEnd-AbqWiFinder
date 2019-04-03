package edu.cnm.deepdive.wifinder.model.view;

import java.net.URI;
import java.util.Date;
import java.util.UUID;

public interface FlatReview {

  UUID getId() ;


  Date getCreated();


  String getName() ;

  URI getHref();


}
