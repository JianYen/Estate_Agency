package yen.estatea_gency.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yen.estatea_gency.exception.ErrorCodeEnum;
import yen.estatea_gency.exception.ExistException;
import yen.estatea_gency.model.enity.User;
import yen.estatea_gency.model.request.user.UserRequest;
import yen.estatea_gency.repository.UserRepository;
import yen.estatea_gency.service.UserService;
import yen.estatea_gency.tool.Utils;

import java.util.Optional;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * todo 第一版不需會員註冊
     */
    @Override
    public String register(UserRequest request) throws ExistException {
        Optional<User> userOptional = userRepository.findAllByUsername(request.getUsername());
        if (userOptional.isPresent()) {
            throw new ExistException(ErrorCodeEnum.USERNAME_EXIST.getErrorCode(), ErrorCodeEnum.USERNAME_EXIST.getDescription());
        }
        User user = new User();
        Utils.copyPropertiesIgnoreNull(request, user);
        userRepository.save(user);
        return "註冊成功！";
    }


}
