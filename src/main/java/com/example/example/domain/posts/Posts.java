package com.example.example.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id // 해당 테이블의 PK 의미
    @GeneratedValue(strategy= GenerationType.IDENTITY) // auto increment 설정
    private Long id;

    @Column(length=500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author; // 왜 얘는 컬럼 어노테이션 안 붙여주지?

    @Builder
    public Posts(String title, String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }
}
