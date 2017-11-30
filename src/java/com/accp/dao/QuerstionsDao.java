package com.accp.dao;

import com.accp.entiey.answers;
import com.accp.entiey.querstions;

import java.util.List;

public interface QuerstionsDao {

    /*
    * 查询所有问题
    * */

    List<querstions> queryQuerstions();




    /*
    * 按id查询
    * */
    querstions queryQuerstionsById(int id);

    /*
    * 网友回答
    * */
    List<answers> queryAnswers(int id);


     int update(querstions q);



    /**
     * 保存学员
     * @param q
     * @return
     */
    int addQuerstions(querstions q);
}
