package yen.estatea_gency.service;

import org.springframework.stereotype.Service;
import yen.estatea_gency.exception.ExistException;
import yen.estatea_gency.model.request.user.UserRequest;

public interface UserService {

    String register(UserRequest request) throws ExistException;


}
