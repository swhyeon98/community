package io.github.swhyeon98.community.repository;

import io.github.swhyeon98.community.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
