package yen.estatea_gency.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import yen.estatea_gency.model.response.houst_object.HouseObjectDetailResponse;
import yen.estatea_gency.model.response.houst_object.HouseObjectResponse;

public interface HouseObjectService {

    Page<HouseObjectResponse> indexHouseList(String keyword, int pageNumber, int pageSize);

    HouseObjectDetailResponse getHouseDetail(Integer id);
}
