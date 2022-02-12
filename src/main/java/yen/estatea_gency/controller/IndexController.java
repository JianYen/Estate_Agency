package yen.estatea_gency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yen.estatea_gency.exception.ExistException;
import yen.estatea_gency.model.request.user.UserRequest;
import yen.estatea_gency.model.response.houst.HouseResponse;
import yen.estatea_gency.service.HouseService;
import yen.estatea_gency.service.UserService;

import java.util.List;

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


    @GetMapping("/house")
    public List<HouseResponse> houseList(@RequestParam(value = "keyword", required = false) String keyword,
                                         @RequestParam(value = "city") String city,
                                         @RequestParam(value = "houseType", required = false) String houseType) {
//            return houseService.indexHouseList();
        return null;
    }

}
