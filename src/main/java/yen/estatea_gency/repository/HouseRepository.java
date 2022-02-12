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
public interface HouseRepository extends JpaRepository<House, Integer> {

    /**todo keyword搜尋後續再考慮要搜尋哪些欄位，第一版只搜尋房屋物件名稱，後續應可搜尋地址、城市等多項*/
    @Query("select h from House h where h.objectName like concat('%',:keyword,'%') and h.city like :city and h.houseType = :type")
    Page<House> indexHouseList(@Param("keyword") String keyword, @Param("city") String city, @Param("type")Enum type,Pageable pageable);

}
