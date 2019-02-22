package com.jackrutorial.service;

import java.util.List;

import com.jackrutorial.model.Article;

public interface ArticleService {
	
	public void deleteArticle(long id);
	
	public List<Article> getAllArticles();
	
	public Article getArticleById(long id);
	
	public void saveOrUpdate(Article article);
}