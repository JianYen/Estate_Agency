package yen.estatea_gency.service.impl;

import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import yen.estatea_gency.model.enity.House;
import yen.estatea_gency.model.enums.HouseType;
import yen.estatea_gency.model.request.hosut.HouseRequest;
import yen.estatea_gency.model.response.CommonResponse;
import yen.estatea_gency.model.response.house.HouseResponse;
import yen.estatea_gency.repository.HouseRepository;
import yen.estatea_gency.service.HouseService;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class HouseServiceImpl implements HouseService {

    private Gson gson = new Gson();

    @Autowired
    private HouseRepository houseRepository;

    /**
     * 取出首頁房屋物件列表
     *
     * @param keyword
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @Override
    public CommonResponse indexHouseList(String keyword, String city, HouseType houseType, int pageNumber, int pageSize) {
        Page<House> houses = houseRepository.indexHouseList(keyword, city, houseType, PageRequest.of(pageNumber - 1, pageSize));
        List<HouseResponse> resultList = houses.getContent().stream().map(HouseResponse::valueOf).collect(Collectors.toList());
        PageImpl<HouseResponse> houseResponses = new PageImpl<>(resultList, PageRequest.of(pageNumber - 1, pageSize), houses.getTotalElements());

        return CommonResponse.success(gson.toJson(houseResponses));
    }

    /**
     * 取得房屋物件詳細資訊
     *
     * @param id
     * @return
     */
    @Override
    public CommonResponse getHouseDetail(Integer id) {
        return CommonResponse.success(gson.toJson(HouseResponse.valueOf(houseRepository.findById(id).get())));
    }

    /**
     * 新增房屋物件
     *
     * @param houseRequest
     * @return
     */
    @Override
    public CommonResponse addHouse(HouseRequest houseRequest) {
        return null;
    }


}
