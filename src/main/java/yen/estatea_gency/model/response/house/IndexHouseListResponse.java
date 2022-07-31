package yen.estatea_gency.model.response.house;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.domain.Page;
import yen.estatea_gency.model.response.CommonResponse;

@Getter
@Setter
@NoArgsConstructor
public class IndexHouseListResponse  {

    private Page<HouseResponse> houseList;


    public IndexHouseListResponse(Page<HouseResponse> houseList) {
        this.houseList = houseList;
    }
}
