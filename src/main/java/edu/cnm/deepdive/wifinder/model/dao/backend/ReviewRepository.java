package edu.cnm.deepdive.wifinder.model.dao.backend;


import edu.cnm.deepdive.wifinder.model.entity.backend.Location;
import edu.cnm.deepdive.wifinder.model.entity.backend.Review;
import edu.cnm.deepdive.wifinder.model.entity.backend.Reviewer;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Declares database operations that can be performed on {@link Review} entity instances.
 */
public interface ReviewRepository extends CrudRepository<Review, UUID> {

  /**
   * Selects and returns all {@link Review} instances containing the specified text fragment, in
   *    * alphabetical order.
   * @param location
   * @return
   */
  List<Review> findAllByLocation(Location location);

}












