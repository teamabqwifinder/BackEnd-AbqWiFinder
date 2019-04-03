package edu.cnm.deepdive.wifinder.model.entity.backend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import edu.cnm.deepdive.wifinder.model.view.FlatLocation;
import edu.cnm.deepdive.wifinder.model.view.FlatReviewer;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.hateoas.EntityLinks;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


@JsonIgnoreProperties(value = {"created","quotes","href"}, allowGetters = true,ignoreUnknown = true)
@Component
@Entity

public class Location implements FlatLocation {



    private static EntityLinks entityLinks;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "location_id", columnDefinition = "CHAR(16) FOR BIT DATA",
        nullable = false, updatable = false)
    private UUID id;


    @NonNull
    @Column(length = 4096, nullable = false, unique = true)
    private String googlemap;

    @NonNull
    @Column(length = 4096, nullable = false, unique = true)
    private String address;

    @NonNull
    @Column(length = 4096, nullable = false, unique = true)
    private String latitude;

  @NonNull
  @Column(length = 4096, nullable = false, unique = true)
  private String longitude;

  @NonNull
  @Column(length = 4096, nullable = false, unique = true)
  private String pictures;



    @JsonSerialize(contentAs = FlatReviewer.class)
    @ManyToMany(fetch = FetchType.LAZY,
        cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(joinColumns = @JoinColumn(name = "review_id"),
        inverseJoinColumns = @JoinColumn(name = "location_id"))


    @OrderBy("text ASC")
    private Set<Review> reviews = new LinkedHashSet<>();

    public static EntityLinks getEntityLinks() {
      return entityLinks;
    }

  public static void setEntityLinks(EntityLinks entityLinks) {
    Location.entityLinks = entityLinks;
  }

  @Override
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  @Override
  @NonNull
  public String getGooglemap() {
    return googlemap;
  }

  @Override
  public String getAdress() {
    return null;
  }

  public void setGooglemap(@NonNull String googlemap) {
    this.googlemap = googlemap;
  }

  @NonNull
  public String getAddress() {
    return address;
  }

  public void setAddress(@NonNull String address) {
    this.address = address;
  }

  @Override
  @NonNull
  public String getLatitude() {
    return latitude;
  }

  public void setLatitude(@NonNull String latitude) {
    this.latitude = latitude;
  }

  @NonNull
  public String getLongitude() {
    return longitude;
  }

  public void setLongitude(@NonNull String longitude) {
    this.longitude = longitude;
  }

  @Override
  @NonNull
  public String getPictures() {
    return pictures;
  }

  @Override
  public URI getHref() {
    return null;
  }

  public void setPictures(@NonNull String pictures) {
    this.pictures = pictures;
  }

  public Set<Review> getReviews() {
    return reviews;
  }

  public void setReviews(Set<Review> reviews) {
    this.reviews = reviews;
  }
}


