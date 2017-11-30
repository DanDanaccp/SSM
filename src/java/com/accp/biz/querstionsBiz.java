package com.accp.biz;

import com.accp.entiey.answers;
import com.accp.entiey.querstions;

import java.util.List;

public interface querstionsBiz {

    //查询问题
    List<querstions> queryQuerstions();

    //添加问题
    boolean addQuerstions(querstions q);

    /*
    * 按id查询
    * */
    querstions queryQuerstionsById(int id);

    /*
    * 网友回答
    * */
    List<answers> queryAnswers(int id);


    int update(querstions q);


}
