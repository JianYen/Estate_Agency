package yen.estatea_gency.model.enums;

public enum HouseObjectType {
    SUITE(1, "套房"),
    ROOM(2, "雅房"),
    APARTMENT(3, "大樓");

    private Integer code;
    private String type;

    HouseObjectType(Integer code, String type) {
        this.code = code;
        this.type = type;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
