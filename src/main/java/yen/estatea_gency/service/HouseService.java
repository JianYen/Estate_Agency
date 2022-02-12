package yen.estatea_gency.service;

import org.springframework.data.domain.Page;
import yen.estatea_gency.model.response.houst.HouseResponse;

public interface HouseService {

    Page<HouseResponse> indexHouseList(String keyword, String city, String houseType, int pageNumber, int pageSize);

    HouseResponse getHouseDetail(Integer id);
}