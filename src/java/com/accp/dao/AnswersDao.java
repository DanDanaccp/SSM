package com.accp.dao;

import com.accp.entiey.answers;

import java.util.List;

public interface AnswersDao {

    //查询回答
    List<answers> queryAnswers(int qid);
    //添加回答s
    int addAnswers(answers a);

}
