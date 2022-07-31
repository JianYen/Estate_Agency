package yen.estatea_gency.model.enums;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum StatusCodeEnum {

    SUCCESS(200,"操作成功"),
    ERROR(500,"系統錯誤"),
    UPLOAD_SUCCESS(200,"上傳成功"),
    NO_FILE(400,"請至少上傳一張圖片！"),
    FILE_TYPE_NOT_ALLOWED(400,"檔案格式不允許,請上傳JPG或PNG格式")

    ;

    private Integer statusCode;
    private String message;

    StatusCodeEnum(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }
}
