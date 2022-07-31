package yen.estatea_gency.service;

import yen.estatea_gency.model.enums.HouseType;
import yen.estatea_gency.model.request.hosut.HouseRequest;
import yen.estatea_gency.model.response.CommonResponse;

public interface HouseService {

    CommonResponse indexHouseList(String keyword, String city, HouseType houseType, int pageNumber, int pageSize);

    CommonResponse getHouseDetail(Integer id);

    CommonResponse addHouse(HouseRequest houseRequest);
}
