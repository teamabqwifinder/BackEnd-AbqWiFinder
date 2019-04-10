package edu.cnm.deepdive.wifinder.model.entity.backend;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import edu.cnm.deepdive.wifinder.model.view.FlatReviewer;
import java.net.URI;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.hateoas.EntityLinks;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 *Defines a database entity and REST resource representing the text of a reviewr, and its
 *relationships to zero or more {@link Location} resources.
 */

@JsonIgnoreProperties(value = {"created","quotes","href","reviews"}, allowGetters = true,ignoreUnknown = true)
@Component
@Entity

public class Reviewer implements FlatReviewer {

  private static EntityLinks entityLinks;

  @Id
  @GeneratedValue(generator = "uuid2")
  @GenericGenerator(name = "uuid2", strategy = "uuid2")
  @Column(name = "reviewer_id", columnDefinition = "CHAR(16) FOR BIT DATA",
      nullable = false, updatable = false)
  private UUID id;


  @NonNull
  @Column(length = 4096, nullable = false, unique = true)
  private String age;

  /**
   * creates column for name
   */
  @NonNull
  @Column(length = 4096, nullable = false, unique = true)
  private String name;

  @NonNull
  @Column(length = 4096, nullable = false, unique = true)
  private String reviewstatus;

  @JsonIgnore
  @OneToMany(fetch = FetchType.LAZY,
      cascade = {CascadeType.DETACH})
  @JoinColumn(name = "reviewer_id")
  private Set<Review> reviews;

  public static EntityLinks getEntityLinks() {
    return entityLinks;
  }

  public static void setEntityLinks(EntityLinks entityLinks) {
    Reviewer.entityLinks = entityLinks;
  }

  @Override
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  @NonNull
  public String getAge() {
    return age;
  }

  public void setAge(@NonNull String age) {
    this.age = age;
  }

  @NonNull
  public String getName() {
    return name;
  }

  /**
   * returns uri
   * @return
   */
  @Override
  public URI getHref() {
    return null;
  }

  public void setName(@NonNull String name) {
    this.name = name;
  }

  @NonNull
  public String getReviewstatus() {
    return reviewstatus;
  }

  public void setReviewstatus(@NonNull String reviewstatus) {
    this.reviewstatus = reviewstatus;
  }

  /**
   * returns reviews
   * @return
   */
  public Set<Review> getReviews() {
    return reviews;
  }

  public void setReviews(Set<Review> reviews) {
    this.reviews = reviews;
  }
}

