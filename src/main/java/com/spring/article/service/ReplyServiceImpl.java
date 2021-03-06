package com.spring.article.service;

import com.spring.article.dao.ReplyDao;
import com.spring.article.dto.Reply;
import com.spring.commons.paging.Criteria;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

  private final ReplyDao replyDao;

  @Inject
  public ReplyServiceImpl(ReplyDao replyDao) {
    this.replyDao = replyDao;
  }

  @Override
  public List<Reply> findAllReply(Integer articleNo) {
    return replyDao.findAllReply(articleNo);
  }

  @Override
  public void createReply(Reply reply) {
    replyDao.createReply(reply);
  }

  @Override
  public void updateReply(Reply reply) {
    replyDao.updateReply(reply);
  }

  @Override
  public void deleteReply(Integer replyNo) {
    replyDao.deleteReply(replyNo);
  }

  @Override
  public List<Reply> findAllReplyPaging(Integer articleNo, Criteria criteria) {
    return replyDao.findAllReplyPaging(articleNo, criteria);
  }

  @Override
  public int countReplies(Integer articleNo) {
    return replyDao.countReplies(articleNo);
  }

}
