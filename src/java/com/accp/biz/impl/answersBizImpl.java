package com.accp.biz.impl;

import com.accp.biz.answersBiz;
import com.accp.dao.AnswersDao;
import com.accp.entiey.answers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("answersBiz")
public class answersBizImpl implements answersBiz {
    @Resource
    private AnswersDao answersDao;

    public List<answers> queryAnswers(int qid) {
        return answersDao.queryAnswers(qid);
    }

    public boolean addAnswers(answers a) {
        return answersDao.addAnswers(a)>0;
    }


}
