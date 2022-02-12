package yen.estatea_gency.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import yen.estatea_gency.exception.ExistException;
import yen.estatea_gency.model.enums.HouseType;
import yen.estatea_gency.model.request.user.UserRequest;
import yen.estatea_gency.model.response.houst.HouseResponse;
import yen.estatea_gency.service.HouseService;
import yen.estatea_gency.service.UserService;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserService userService;
    @Autowired
    private HouseService houseService;

    @PostMapping
    public String register(@RequestBody UserRequest request) throws ExistException {
        return userService.register(request);
    }


    @GetMapping("/houseList")
    public Page<HouseResponse> houseList(@RequestParam(value = "keyword", required = false) String keyword,
                                         @RequestParam(value = "city") String city,
                                         @RequestParam(value = "houseType", required = false) String houseType,
                                         @Param("pageNumber") int pageNumber,
                                         @Param("pageSize") int pageSize) {
        HouseType type = HouseType.valueOf(houseType);
        String houseCity = StringUtils.isBlank(city) ? "%%" : city;
        return houseService.indexHouseList(keyword, houseCity, type, pageNumber, pageSize);
    }

}
