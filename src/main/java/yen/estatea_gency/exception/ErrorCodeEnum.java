package yen.estatea_gency.exception;

public enum ErrorCodeEnum {
    USERNAME_EXIST("U01","使用者名稱已存在");

    private String errorCode;
    private String description;


    ErrorCodeEnum(String errorCode, String description) {
        this.errorCode = errorCode;
        this.description = description;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
