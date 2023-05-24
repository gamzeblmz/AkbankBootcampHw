package com.example.bootcamphw2.entitiy;

import com.example.bootcamphw2.general.BaseEntitiy;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COMMENT")
@Getter
@Setter
public class Comment extends BaseEntitiy {
    @Id
    @GeneratedValue(generator = "Comment", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Comment", sequenceName = "COMMENT_ID_SEQ")
    private Long id;
    @Column(name = "USER_ID")
    private Long userId;
    @Column(name = "PRODUCT_ID")
    private Long productId;
    @Column(name = "TITLE", length = 100, nullable = false)
    private String title;
    @Column(name = "COMMENT", length = 500, nullable = false)
    private String comment;
}
