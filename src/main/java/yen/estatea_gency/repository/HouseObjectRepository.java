package yen.estatea_gency.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import yen.estatea_gency.model.enity.HouseObject;

@Repository
public interface HouseObjectRepository extends JpaRepository<HouseObject, Integer> {

    @Query("select h from HouseObject h where h.objectName like concat('%',:keyword,'%') ")
    Page<HouseObject> indexHouseList(@Param("keyword") String keyword, Pageable pageable);

}
