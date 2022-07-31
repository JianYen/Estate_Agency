package yen.estatea_gency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yen.estatea_gency.model.response.CommonResponse;
import yen.estatea_gency.service.HouseService;

@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    @GetMapping("/detail")
    public CommonResponse getHouseDetail(@RequestParam Integer id) {
        return houseService.getHouseDetail(id);
    }

}
