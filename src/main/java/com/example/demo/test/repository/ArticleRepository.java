package com.example.demo.test.repository;

import com.example.demo.test.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticleRepository extends CrudRepository<Article, Long> {
    List<Article> findByTitle(String title);

    List<Article> findDistinctByCategory(String category);

    List<Article> findByTitleAndCategory(String title, String category);
}
