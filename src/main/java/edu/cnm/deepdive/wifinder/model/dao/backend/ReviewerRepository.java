package edu.cnm.deepdive.wifinder.model.dao.backend;


import edu.cnm.deepdive.wifinder.model.entity.backend.Review;
import edu.cnm.deepdive.wifinder.model.entity.backend.Reviewer;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * Declares database operations that can be performed on {@link Reviewer} entity instances.
 */

public interface ReviewerRepository extends CrudRepository<Reviewer, UUID> {

  /**
   * Selects and returns all {@link Reviewer} instances containing the specified text fragment, in
   *    * alphabetical order.
   * @param review
   * @return
   */
  List<Reviewer> findAllByReviewsContains(Review review);
}























