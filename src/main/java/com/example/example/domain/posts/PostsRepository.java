package com.example.example.domain.posts;
// JPA에서는 dao를 Repository라는 이름으로 부름
// ->JpaRepository를 상속하면 기본적인 메소드 자동 생성됨

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
