package edu.cnm.deepdive.wifinder.model.entity.backend;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import edu.cnm.deepdive.wifinder.model.view.FlatReview;
import java.net.URI;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.hateoas.EntityLinks;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;


@JsonIgnoreProperties(value = {"created","quotes","href","location"}, allowGetters = true,ignoreUnknown = true)
@Component
@Entity
public class Review implements FlatReview {

  private static EntityLinks entityLinks;

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(name = "review_id", columnDefinition = "CHAR(16) FOR BIT DATA",
      nullable = false, updatable = false)
  private UUID id;

  @NonNull
  @CreationTimestamp
  @Temporal(TemporalType.TIMESTAMP)
  @Column(nullable = false, updatable = false)
  private Date created;

  @NonNull
  @Column(length = 4096, nullable = false, unique = true)
  private String text;

  @NonNull
  @Column(length = 4096, nullable = false, unique = true)
  private String photos;


 // @JsonSerialize(contentAs = FlatReview.class)
//  @ManyToMany(fetch = FetchType.LAZY, mappedBy = "reviews",
//      cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH});

  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "location_id")
  private Location location;

  @ManyToOne
  @JoinColumn(name = "reviewer_id")
  private Reviewer reviewer;

  public static EntityLinks getEntityLinks() {
    return entityLinks;
  }

  public static void setEntityLinks(EntityLinks entityLinks) {
    Review.entityLinks = entityLinks;
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
  public Date getCreated() {
    return created;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public URI getHref() {
    return null;
  }

  public void setCreated(@NonNull Date created) {
    this.created = created;
  }

  @NonNull
  public String getText() {
    return text;
  }

  public void setText(@NonNull String text) {
    this.text = text;
  }

  @NonNull
  public String getPhotos() {
    return photos;
  }

  public void setPhotos(@NonNull String photos) {
    this.photos = photos;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Reviewer getReviewer() {
    return reviewer;
  }

  public void setReviewer(Reviewer reviewer) {
    this.reviewer = reviewer;
  }
}

