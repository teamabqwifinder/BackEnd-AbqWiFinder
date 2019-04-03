package edu.cnm.deepdive.wifinder.model.dao.backend;


import edu.cnm.deepdive.wifinder.model.entity.backend.Review;
import edu.cnm.deepdive.wifinder.model.entity.backend.Reviewer;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface ReviewerRepository extends CrudRepository<Reviewer, UUID> {

  List<Reviewer> findAllByReviewsContains(Review review);
}




















//  @Query("SELECT * FROM Reviewer WHERE Reviewer_id = :reviewerId ORDER BY date DESC")
//  List<Reviewer> findAllByUserIdOrderByDate(long reviewerId);
//
//
//
//  @Query("SELECT * FROM reviewer WHERE reviewer_id = :reviewerId")
//  Reviewer findFirstBySearchId(long reviewerId);
//
//
//
//  @Insert
//  List<Long> insert(Reviewer... reviewers);
//
//
//
//  @Delete
//  int delete(Reviewer... reviewers);
//
//  @Query("SELECT * FROM reviewer ORDER BY date DESC")
//  List<Reviewer> findAll();
//
//
//  @Query("SELECT * FROM Reviewer WHERE date = :date")
//  Reviewer findFirstByDate(Date date);


