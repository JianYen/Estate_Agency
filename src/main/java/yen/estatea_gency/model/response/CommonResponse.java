package yen.estatea_gency.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import yen.estatea_gency.model.enums.StatusCodeEnum;

@Getter
@Setter
@NoArgsConstructor
public class CommonResponse {

    private Integer statusCode;
    private String message;
    private Object data;

    public CommonResponse(Integer statusCode, String message, Object data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public static CommonResponse getCommonResponse(Integer statusCode, String message, Object data) {
        return new CommonResponse(statusCode, message, data);
    }

    public static CommonResponse success(Object data) {
        return getCommonResponse(StatusCodeEnum.SUCCESS.getStatusCode(), StatusCodeEnum.SUCCESS.getMessage(), data);
    }

    public static CommonResponse success(StatusCodeEnum statusCodeEnum, Object data) {
        return getCommonResponse(statusCodeEnum.getStatusCode(), statusCodeEnum.getMessage(), data);
    }

    public static CommonResponse error(StatusCodeEnum statusCodeEnum, Object data) {
        return getCommonResponse(statusCodeEnum.getStatusCode(), statusCodeEnum.getMessage(), data);
    }
}
