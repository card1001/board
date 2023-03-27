package com.fast.fastboard.repository;

import com.fast.fastboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

 interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
