package com.accp.biz;

import com.accp.entiey.answers;

import java.util.List;

public interface answersBiz {

    //查询回答
    List<answers> queryAnswers(int qid);

    //添加回答
    boolean addAnswers(answers a);


}
