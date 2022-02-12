package yen.estatea_gency.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import yen.estatea_gency.model.enity.House;
import yen.estatea_gency.model.enums.HouseType;

@Repository
public interface HouseObjectRepository extends JpaRepository<House, Integer> {

    @Query("select h from House h where h.objectName like concat('%',:keyword,'%') and h.city = :city and (:houseType is null or h.houseType = :houseType)")
    Page<House> indexHouseList(@Param("keyword") String keyword, @Param("city") String city, @Param("houseType") HouseType houseType, Pageable pageable);

}
