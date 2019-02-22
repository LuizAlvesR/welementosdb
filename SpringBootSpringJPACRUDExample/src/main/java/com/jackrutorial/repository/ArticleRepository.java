package com.jackrutorial.repository;

import org.springframework.data.repository.CrudRepository;

import com.jackrutorial.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {
	
}