package yen.estatea_gency.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import yen.estatea_gency.model.enity.House;
import yen.estatea_gency.model.enums.HouseType;
import yen.estatea_gency.model.response.houst.HouseResponse;
import yen.estatea_gency.repository.HouseRepository;
import yen.estatea_gency.service.HouseService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HouseServiceImpl implements HouseService {

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
    public Page<HouseResponse> indexHouseList(String keyword, String city, HouseType houseType, int pageNumber, int pageSize) {
        Page<House> houses = houseRepository.indexHouseList(keyword, city, houseType, PageRequest.of(pageNumber - 1, pageSize));
        List<HouseResponse> resultList = houses.getContent().stream().map(HouseResponse::valueOf).collect(Collectors.toList());
        return new PageImpl<>(resultList, PageRequest.of(pageNumber - 1, pageSize), houses.getTotalElements());
    }

    /**
     * 取得房屋物件詳細資訊
     *
     * @param id
     * @return
     */
    @Override
    public HouseResponse getHouseDetail(Integer id) {
        return HouseResponse.valueOf(houseRepository.findById(id).get());
    }
}
