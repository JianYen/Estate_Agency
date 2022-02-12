package yen.estatea_gency.model.enity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "real_name")
    private String realName;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.MERGE)
    private Set<Comment> comments;

    @JsonIgnore
    @OneToMany(mappedBy = "user", cascade = CascadeType.MERGE)
    private Set<House> houses;

}
