package yen.estatea_gency.model.enity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import yen.estatea_gency.model.enums.HouseObjectType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "house_object")
public class HouseObject {

    @Id
    @Column(name = "id")
    private Integer id;

    /**房屋名稱*/
    @Column(name = "object_name")
    private String objectName;

    /**房屋介紹*/
    @Column(name = "description")
    private String description;

    /**房屋照片*/
    @Column(name = "object_pictures")
    private String objectPictures;

    /**房屋所在城市*/
    @Column(name = "city")
    private String city;

    /**房屋所在鄉鎮*/
    @Column(name = "township")
    private String township;

    /**房屋所在街道*/
    @Column(name = "street")
    private String street;

    /**房屋詳細地址*/
    @Column(name = "detail_address")
    private String detail_address;

    /**房屋租金*/
    @Column(name = "rent")
    private Integer rent;

    /**房屋押金*/
    @Column(name = "deposit")
    private Integer deposit;

    /**房屋型態*/
    @Enumerated(EnumType.STRING)
    private HouseObjectType houseObjectType;

    /**坪數*/
    @Column(name = "houst_object_area")
    private Double houseObjectArea;


    @JsonIgnore
    @OneToMany
    private Set<Comment> comments;

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

    public String getDetail_address() {
        return detail_address;
    }

    public void setDetail_address(String detail_address) {
        this.detail_address = detail_address;
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public HouseObjectType getHouseObjectType() {
        return houseObjectType;
    }

    public void setHouseObjectType(HouseObjectType houseObjectType) {
        this.houseObjectType = houseObjectType;
    }

    public Double getHouseObjectArea() {
        return houseObjectArea;
    }

    public void setHouseObjectArea(Double houseObjectArea) {
        this.houseObjectArea = houseObjectArea;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
