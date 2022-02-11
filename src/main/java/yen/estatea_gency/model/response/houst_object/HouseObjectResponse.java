package yen.estatea_gency.model.response.houst_object;

import yen.estatea_gency.model.enity.HouseObject;

public class HouseObjectResponse {

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

    public static HouseObjectResponse valueOf(HouseObject houseObject) {
        HouseObjectResponse response = new HouseObjectResponse();
        response.setId(houseObject.getId());
        response.setObjectName(houseObject.getObjectName());
        response.setDescription(houseObject.getDescription());
        response.setCity(houseObject.getCity());
        response.setTownship(houseObject.getTownship());
        response.setStreet(houseObject.getStreet());
        response.setDetailAddress(houseObject.getDetail_address());
        response.setObjectPictures(houseObject.getObjectPictures());
        return response;
    }
}
