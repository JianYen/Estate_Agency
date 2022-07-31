package yen.estatea_gency.service;

import yen.estatea_gency.exception.ExistException;
import yen.estatea_gency.model.request.user.UserRequest;

public interface UserService {

    String register(UserRequest request) throws ExistException;

}
