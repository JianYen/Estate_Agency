package yen.estatea_gency.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Component;
import yen.estatea_gency.model.enity.User;
import yen.estatea_gency.repository.UserRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class LoginHandler implements AuthenticationProvider {

    public static final Logger log = LoggerFactory.getLogger(LoginHandler.class);

    @Autowired
    private UserRepository userRepository;


    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Optional<User> user = userRepository.findAllByUsername(authentication.getPrincipal().toString());
        log.info("user: {} login success！", authentication.getPrincipal().toString());
        List<String> permissions = Arrays.asList("NORMAL");
        return new UsernamePasswordAuthenticationToken(user.get(), null, AuthorityUtils.createAuthorityList(permissions.toArray(new String[permissions.size()])));
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass == UsernamePasswordAuthenticationToken.class;
    }
}
