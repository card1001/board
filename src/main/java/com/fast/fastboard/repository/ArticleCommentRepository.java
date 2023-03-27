package com.fast.fastboard.repository;

import com.fast.fastboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
 interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
