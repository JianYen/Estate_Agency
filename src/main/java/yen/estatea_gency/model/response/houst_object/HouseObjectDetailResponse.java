package yen.estatea_gency.model.response.houst_object;

import yen.estatea_gency.model.enity.HouseObject;

public class HouseObjectDetailResponse extends HouseObjectResponse {


    public static HouseObjectDetailResponse valueOf(HouseObject houseObject) {
        HouseObjectDetailResponse response = new HouseObjectDetailResponse();
        response.setObjectName(houseObject.getObjectName());
        response.setDescription(houseObject.getDescription());
        response.setCity(houseObject.getCity());
        return response;
    }

}
