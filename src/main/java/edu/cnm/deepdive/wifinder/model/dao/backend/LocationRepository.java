package edu.cnm.deepdive.wifinder.model.dao.backend;


import edu.cnm.deepdive.wifinder.model.entity.backend.Location;
import edu.cnm.deepdive.wifinder.model.entity.backend.Review;
import java.util.List;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, UUID> {

  List<Location> findTop10ByOrderByAddress();

}


























//  @Query("SELECT * FROM Location WHERE location_id= :locationId ORDER BY date DESC")
//  List<Location> findAllByUserIdOrderByDate(long locationId);
//
//
//
//  @Query("SELECT * FROM location WHERE location_id = :locationId")
//  Location findFirstBySearchId(long locationId);
//
//
//
//  @Insert
//  List<Long> insert(Location... Locations);
//
//
//
//  @Delete
//  int delete(Location... Locations);
//
//  @Query("SELECT * FROM location ORDER BY date DESC")
//  List<Location> findAll();
//
//
//  @Query("SELECT * FROM Location WHERE date = :date")
//  Location findFirstByDate(Date date);



