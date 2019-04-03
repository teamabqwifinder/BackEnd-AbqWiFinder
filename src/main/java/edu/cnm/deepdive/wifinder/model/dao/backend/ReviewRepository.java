package edu.cnm.deepdive.wifinder.model.dao.backend;


import edu.cnm.deepdive.wifinder.model.entity.backend.Location;
import edu.cnm.deepdive.wifinder.model.entity.backend.Review;
import edu.cnm.deepdive.wifinder.model.entity.backend.Reviewer;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, UUID> {


  List<Review> findAllByLocation(Location location);

}









//  @Query("SELECT * FROM Review WHERE Review_id = :reviewId ORDER BY date DESC")
//  List<Review> findAllByUserIdOrderByDate(long reviewId);
//
//
//
//  @Query("SELECT * FROM review WHERE review_id = :reviewId")
//  Reviewer findFirstBySearchId(long reviewId);
//
//
//
//  @Insert
//  List<Long> insert(Review... reviews);
//
//
//
//  @Delete
//  int delete(Review... reviews);
//
//  @Query("SELECT * FROM review ORDER BY date DESC")
//  List<Reviewer> findAll();
//
//
//  @Query("SELECT * FROM Review WHERE date = :date")
//  Review findFirstByDate(Date date);


