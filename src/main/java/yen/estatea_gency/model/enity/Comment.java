package yen.estatea_gency.model.enity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "comment")
public class Comment {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "edit_date")
    private LocalDateTime editDate;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "house_id")
    private House house;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "user_id")
    private User user;


}
