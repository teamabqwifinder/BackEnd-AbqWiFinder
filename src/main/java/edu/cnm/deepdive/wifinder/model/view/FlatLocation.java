package edu.cnm.deepdive.wifinder.model.view;

import java.net.URI;
import java.util.UUID;

public interface FlatLocation {

  UUID getId();

  String getGooglemap();

  String getAdress();
  String getLatitude();
  String getPictures();

  URI getHref();
}
