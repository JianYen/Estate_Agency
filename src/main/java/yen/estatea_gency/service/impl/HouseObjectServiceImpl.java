package yen.estatea_gency.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import yen.estatea_gency.model.enity.HouseObject;
import yen.estatea_gency.model.response.houst_object.HouseObjectDetailResponse;
import yen.estatea_gency.model.response.houst_object.HouseObjectResponse;
import yen.estatea_gency.repository.HouseObjectRepository;
import yen.estatea_gency.service.HouseObjectService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HouseObjectServiceImpl implements HouseObjectService {

    @Autowired
    private HouseObjectRepository houseObjectRepository;

    /**
     * 取出首頁房屋物件列表
     * @param keyword
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @Override
    public Page<HouseObjectResponse> indexHouseList(String keyword, int pageNumber, int pageSize) {
        Page<HouseObject> houseObjects = houseObjectRepository.indexHouseList(keyword, PageRequest.of(pageNumber - 1, pageSize));
        List<HouseObjectResponse> resultList = houseObjects.getContent().stream().map(HouseObjectResponse::valueOf).collect(Collectors.toList());
        return new PageImpl<>(resultList, PageRequest.of(pageNumber - 1, pageSize), houseObjects.getTotalElements());
    }

    /**
     * 取得房屋物件詳細資訊
     * @param id
     * @return
     */
    @Override
    public HouseObjectDetailResponse getHouseDetail(Integer id) {
        return HouseObjectDetailResponse.valueOf(houseObjectRepository.findById(id).get());

    }
}
