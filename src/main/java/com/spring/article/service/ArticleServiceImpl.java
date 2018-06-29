package com.spring.article.service;

import com.spring.article.dao.ArticleDao;
import com.spring.article.dto.Article;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

  private final ArticleDao articleDao;

  @Inject
  public ArticleServiceImpl(ArticleDao articleDao) {
    this.articleDao = articleDao;
  }

  @Override
  public void createArticle(Article article) {
    articleDao.createArticle(article);
  }

  @Override
  public Article findByArticleNo(Integer articleNo) {
    return articleDao.findByArticleNo(articleNo);
  }

  @Override
  public void updateArticle(Article article) {
    articleDao.updateArticle(article);
  }

  @Override
  public void deleteArticle(Integer articleNo) {
    articleDao.deleteArticle(articleNo);
  }

  @Override
  public List<Article> findAllArticle() {
    return articleDao.findAllArticle();
  }
}
