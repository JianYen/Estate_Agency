package yen.estatea_gency.model.response.houst;

import yen.estatea_gency.model.enity.House;

public class HouseResponse {

    private Integer id;
    private String objectName;
    private String description;
    private String objectPictures;
    private String city;
    private String township;
    private String street;
    private String detailAddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObjectPictures() {
        return objectPictures;
    }

    public void setObjectPictures(String objectPictures) {
        this.objectPictures = objectPictures;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTownship() {
        return township;
    }

    public void setTownship(String township) {
        this.township = township;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

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
