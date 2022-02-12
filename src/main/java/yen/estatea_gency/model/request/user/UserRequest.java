package yen.estatea_gency.model.request.user;

import lombok.Data;

@Data
public class UserRequest {

    private String username;
    private String password;
    private String realName;
    private String mobilePhoneNumber;
    /**縣市*/
    private String county;
    /**鄉鎮*/
    private String townShip;
    /**詳細地址*/
    private String address;
    private String email;


}
