package com.accp.biz.impl;

import com.accp.biz.querstionsBiz;
import com.accp.dao.QuerstionsDao;
import com.accp.entiey.answers;
import com.accp.entiey.querstions;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("querstionsBiz")
public class querstionsBizImpl implements querstionsBiz {

    @Resource
    private QuerstionsDao querstionsDao;


    public List<querstions> queryQuerstions() {
        return querstionsDao.queryQuerstions();
    }

    public boolean addQuerstions(querstions id) {
        return querstionsDao.addQuerstions(id)>0;
    }

    public querstions queryQuerstionsById(int id) {
        return querstionsDao.queryQuerstionsById(id);
    }

    public List<answers> queryAnswers(int id) {
        return querstionsDao.queryAnswers(id);
    }

    public int update(querstions q) {
        return  querstionsDao.update(q);
    }
}
