package com.p139571jpa.back.post.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor //jpa는 인자없는 기본 생성자가 필요하다. 밑에 post생성자를 만들어서 필요.
@ToString // tostring이 있으면 post를 출력했을때 스트링으로 결과값이 나온다

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime creatDate;
    private LocalDateTime modifyDate;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        creatDate = LocalDateTime.now();
        modifyDate = this.creatDate;
    }
}
