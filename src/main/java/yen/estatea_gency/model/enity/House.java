package yen.estatea_gency.model.enity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import yen.estatea_gency.model.enums.HouseType;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "house")
public class House {

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
    @Column(name = "house_pictures")
    private String housePictures;

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
    private HouseType houseType;

    /**坪數*/
    @Column(name = "houst_area")
    private Double houseArea;

    /**點擊率*/
    @Column(name = "click_count")
    private Integer clickCount;


    @JsonIgnore
    @OneToMany(mappedBy = "house" ,cascade = CascadeType.MERGE)
    private Set<Comment> comments;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id")
    private User user;


}
