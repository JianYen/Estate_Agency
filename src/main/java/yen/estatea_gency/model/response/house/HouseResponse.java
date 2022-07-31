package yen.estatea_gency.model.response.house;

import lombok.Getter;
import lombok.Setter;
import yen.estatea_gency.model.enity.House;

@Getter
@Setter
public class HouseResponse {

    private Integer id;
    private String objectName;
    private String description;
    private String objectPictures;
    private String city;
    private String township;
    private String street;
    private String detailAddress;


    public static HouseResponse valueOf(House house) {
        HouseResponse response = new HouseResponse();
        response.setId(house.getId());
        response.setObjectName(house.getObjectName());
        response.setDescription(house.getDescription());
        response.setCity(house.getCity());
        response.setTownship(house.getTownship());
        response.setStreet(house.getStreet());
        response.setDetailAddress(house.getDetail_address());
        response.setObjectPictures(house.getHousePictures());
        return response;
    }
}
