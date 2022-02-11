package yen.estatea_gency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yen.estatea_gency.exception.ExistException;
import yen.estatea_gency.model.request.user.UserRequest;
import yen.estatea_gency.service.UserService;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private UserService userService;

    @PostMapping
    private String register(@RequestBody UserRequest request) throws ExistException {
        return userService.register(request);
    }

}
